package MethodChaining;

public class ReportGenerator implements ITitleStep,IContentStep,IPrintStep{
    private String titel;
    private String content;
    private ReportGenerator(){}

    public static ITitleStep start(){
        return new ReportGenerator();
    }
    @Override
    public IContentStep setTitel(String titel){
        this.titel= titel;
        return this;
    }
    @Override
    public IPrintStep setContent(String text){
        this.content = text;
        return this;
    }
    @Override
    public void print(){
        System.out.println("Report: "+titel+"\n"+content);
    }
}

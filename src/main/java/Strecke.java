public class Strecke {
    private int a;
    private int b;

    public Strecke(int a,int b){
        if(a<0||b<0){
            throw new RuntimeException("Es müssen Positvie zahlen sein");
        }else if(a>b){
            this.a=b;
            this.b=a;
        }else{
            this.a=a;
            this.b=b;
        }
    }
    public boolean ueberschneiden(Strecke andere){
        return this.a<andere.b&&this. b>andere.a;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    @Override
    public String toString(){
        String ergeniss="";
        if(this.a==this.b){
            ergeniss=ergeniss+this.a;
            return ergeniss;
        }
        ergeniss=ergeniss+this.a;
        for(int i=0;i<(getB()-getA());i++){
            ergeniss=ergeniss+"-";
        }
        return ergeniss+this.b;
    }
}

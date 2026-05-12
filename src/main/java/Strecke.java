public class Strecke {
    private int a;
    private int b;

    public Strecke(int a,int b){
        if(a>b){
            this.b=a;
        }else{
            this.a=a;
        }if(b<a){
            this.a=b;
        }else{
            this.b=b;
        }
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public boolean ueberschneidet(Strecke andere){
        return this.a< andere.b&& this.b> andere.a;
    }
    @Override
    public String toString(){
        String ergeniss;
        if(this.a==this.b){
            ergeniss=""+getA();
            return ergeniss;
        }else{
            ergeniss=""+getA();
            for(int i=0; i<this.getB()-this.getA();i++){
                ergeniss= ergeniss+"-";

            }
            return ergeniss+getB();
        }
    }

}

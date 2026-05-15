package Übunggenerics;

public class Paar <L,R>{
    private L links;
    private R rechts;

    public Paar(L l,R r){
        this.links=l;
        this.rechts=r;
    }
    public void zeigePaar(){
        System.out.println("Links:"+ links+", Rechts: "+ rechts);
    }
    public static void main(String[]args){
        Paar<Integer,String> p1 = new Paar<>(100,"Hallo");
        p1.zeigePaar();
    }
}

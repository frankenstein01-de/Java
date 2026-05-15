package GeschachtelteKlassen;

public class Auto {
    private String marke;
    private String modell;
    private String farbe;
    private int ps;
    private Auto(String marke,String farbe,String modell,int ps){
        this.marke=marke;
        this.modell=modell;
        this.farbe=farbe;
        this.ps=ps;
    }
    public String getMarke(){
        return marke;
    }
    public String getModell(){
        return modell;
    }
    public String getFarbe(){
        return farbe;
    }
    public int getPs(){
        return ps;
    }
    @Override
    public String toString(){
        String a ="Die Marke: "+this.getMarke()+"| Die Farbe: "+this.getFarbe()+"| Das Modell: "+this.getModell()+
                "| Die Ps anzahl: "+this.getPs();
        return a;
    }
    public static class AutoBuilder{
        private String marke;
        private String modell;
        private String farbe;
        private int ps;
        public AutoBuilder(String marke,String farbe){
            this.marke=marke;
            this.farbe=farbe;
        }
        public AutoBuilder mitModell(String modell){
            this.modell=modell;
            return this;
        }
        public AutoBuilder mitPs(int ps){
            this.ps=ps;
            return this;
        }
        public Auto build(){
            return new Auto(marke,farbe,modell,ps);
        }

    }
    public static void main(String[]args){
        Auto a = new Auto.AutoBuilder("BMW","Schwarz").build();
        System.out.println(a.toString());
        Auto b = new Auto.AutoBuilder("MZD","Silber").mitModell("CLS").mitPs(240).build();
        System.out.println(b.toString());

    }

}

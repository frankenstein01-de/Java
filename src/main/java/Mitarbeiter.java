public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private String geburtsdatum;
    private int id;
    private double grundGehalt;
    private double gehaltsfaktor;
    public Mitarbeiter(String vorname,String nachname,String geburtsdatum,int id,double grundGehalt,double gehaltsfaktor){
        this.vorname=vorname;
        this.nachname=nachname;
        this.geburtsdatum=geburtsdatum;
        this.id=id;
        this.grundGehalt=grundGehalt;
        this.gehaltsfaktor=gehaltsfaktor;
    }
    public double getGehaltsfaktor(){
        return gehaltsfaktor;
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public String getGeburtsdatum(){
        return geburtsdatum;
    }
    public int getId(){
        return id;
    }
    public double getGrundGehalt(){
        return grundGehalt;
    }
    public void setGehaltsfaktor(double neuertfaktor){
        this.gehaltsfaktor=neuertfaktor;
    }

    public static class Abteilungsleiter extends Mitarbeiter{
        public Abteilungsleiter(String vorname,String nachname,String geburtsdatum,int id,double grundGehalt){
            super(vorname, nachname, geburtsdatum, id, grundGehalt,2.0);
        }
        public void befördern(Mitarbeiter a){
            a.setGehaltsfaktor(a.getGehaltsfaktor()*1.10);
        }
    }
    public static class Abteilung{
        Mitarbeiter[] mitarbeiter;
        int kapazität;
        Abteilungsleiter leiter;

        public Abteilung(int kapazität,Abteilungsleiter leiter){
            this.mitarbeiter = new Mitarbeiter[kapazität];
            this.leiter=leiter;
        }
        public void addAnges(Mitarbeiter a){
            for(int i =0;i< mitarbeiter.length;i++){
                if(mitarbeiter[i]==null){
                    mitarbeiter[i]=a;
                    return;
                }
            }throw new ArrayIndexOutOfBoundsException("Die Abteilung is voll");
        }
    }
}

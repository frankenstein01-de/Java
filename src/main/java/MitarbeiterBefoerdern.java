public class MitarbeiterBefoerdern {

    public static class Angestellter{
        protected String vorname;
        protected String nachname;
        protected double id;
        protected double grundGehalt;
        protected double gehaltfaktor;
        protected String geburtsdatum;

        public Angestellter(String vorname,String nachname, double id,double grundGehalt,String geburtsdatum){
            this.vorname=vorname;
            this.nachname=nachname;
            this.id=id;
            this.grundGehalt=grundGehalt;
            this.gehaltfaktor=1;
            this.geburtsdatum=geburtsdatum;

        }
        public String getVorname(){
            return vorname;
        }
        public String getNachname(){
            return nachname;
        }
        public double getId(){
            return id;
        }
        public double getGehaltfaktor(){
            return gehaltfaktor;
        }
        public String getGeburtsdatum(){
            return geburtsdatum;
        }
        public double getGehalt(){
            return grundGehalt*gehaltfaktor;
        }
        public double getGrundGehalt(){
            return grundGehalt;
        }

    }
    public static class Abteilungsleiter extends Angestellter{
        public Abteilungsleiter(String vorname,String nachname, double id,double grundGehalt,String geburtsdatum){
            super(vorname,nachname,id,grundGehalt,geburtsdatum);
            this.gehaltfaktor=2;
        }
        public void befördern(Angestellter a){
            a.gehaltfaktor*=1.10;
        }

    }
    public static class Abteilung{
        protected Abteilungsleiter leiter;
        protected Angestellter[] angestellte;

        public Abteilung(Abteilungsleiter leiter,Angestellter[] angestellte){
            this.leiter=leiter;
            this.angestellte=angestellte;

        }
        public  void addAngestellter(Angestellter a){
            for(int i=0;i<angestellte.length;i++){
                if(angestellte[i]==null){
                    angestellte[i]=a;
                    return;
                }
            }
            throw new RuntimeException("Die Abteilung is voll");
        }
        public Abteilungsleiter getLeiter(){
            return leiter;
        }
    }


}

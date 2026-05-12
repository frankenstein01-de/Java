
public class Person {
    private String vorname;
    private String nachname;
    private Adresse adresse;


    public Person(String vorname,String nachname,Adresse adresse){
        char vErster =vorname.charAt(0);
        char nErster =nachname.charAt(0);
        if(!Character.isUpperCase(vErster)){
            throw new RuntimeException("Der Erste Buchstabe des Vornamens muss Groß sein");
        }else{
            this.vorname=vorname;
        } if(!Character.isUpperCase(nErster)){
            throw new RuntimeException("Der Erste Buchstabe des Nachnamens muss Groß sein");
        }else{
            this.nachname=nachname;
        }
        this.adresse=adresse;


    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public Adresse getAdresse(){
        return adresse;
    }

    public static class Adresse{
        private String strasse;
        private String hausnummer;
        private int postleitzahl;
        private String ort;

        public Adresse(String strasse,String hausnummer,int postleitzahl,String ort){
            char sErster =strasse.charAt(0);
            char oErster =ort.charAt(0);
            char hErster =hausnummer.charAt(0);
            if(!Character.isUpperCase(sErster)){
                throw new RuntimeException("Der Erste Buchstabe der Straße muss Groß sein");
            }else{
                this.strasse=strasse;
            }
            if(!Character.isDigit(hErster)){
                throw new RuntimeException("Der Erste Buchstabe der Hausnummer muss eine Ziffer sein");
            }else {
                this.hausnummer = hausnummer;
            }
            this.postleitzahl = postleitzahl;
            if(!Character.isUpperCase(oErster)){
                throw new RuntimeException("Der Erste Buchstabe des Ortes muss Groß sein");
            }else{
                this.ort=ort;
            }

        }
        public String getStrasse(){
            return strasse;
        }
        public String getHausnummer(){
            return hausnummer;
        }
        public int getPostleitzahl(){
            return postleitzahl;
        }
        public String getOrt(){
            return ort;
        }
    }
}


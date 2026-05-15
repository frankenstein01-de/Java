public class Person {
    private String vorname;
    private String nachname;
    private Adresse adresse;
    public Person(String vorname,String nachname,Adresse adresse){
        if(Character.isLowerCase(vorname.charAt(0))){
            throw new RuntimeException("Vorname muss mit einem  Großbuchstaben bgeinnen");
        }else{
            this.vorname=vorname;
        }
        if(Character.isLowerCase(nachname.charAt(0))){
            throw new RuntimeException("Nachname muss mit einem  Großbuchstaben bgeinnen");
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
            if(Character.isLowerCase(strasse.charAt(0))){
                throw new RuntimeException("Vorname muss mit einem  Großbuchstaben bgeinnen");
            }else{
                this.strasse=strasse;
            }
            if(Character.isLowerCase(ort.charAt(0))){
                throw new RuntimeException("Vorname muss mit einem  Großbuchstaben bgeinnen");
            }else{
                this.ort=ort;
            }
            if(!Character.isDigit(hausnummer.charAt(0))){
                throw new RuntimeException("Die Hausnummer muss mit einer Ziffer beginnen");
            }else{
                this.hausnummer=hausnummer;
            }
            this.postleitzahl=postleitzahl;

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
        public  String getOrt(){
            return ort;
        }

    }
}

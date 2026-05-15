package GeschachtelteKlassen;

public class Person {
    private String vorname;
    private String nachname;
    private int alter;

    private Person(String vorname,String nachnamem,int alter){
        this.vorname=vorname;
        this.nachname=nachnamem;
        this.alter=alter;
    }
    public String getVorname(){
        return vorname;
    }
    public String getNachname(){
        return nachname;
    }
    public int getAlter(){
        return alter;
    }
    @Override
    public String toString(){
        return "Vorname: "+getVorname()+"|Nachname: "+getNachname()+"|Alter: "+getAlter();
    }
    public static class PersonBuilder{
        private String vorname;
        private String nachname;
        private int alter;
        public PersonBuilder(String vorname,String nachname){
            this.vorname=vorname;
            this.nachname=nachname;
        }
        public PersonBuilder mitAlter(int alter){
            this.alter=alter;
            return this;
        }
        public Person build(){
            return new Person(vorname,nachname,alter);
        }

    }
    public static void main(String[]args){
        Person a =new Person.PersonBuilder("Max","Verstappen").mitAlter(21).build();
        System.out.println(a.toString());
    }
}

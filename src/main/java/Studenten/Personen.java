package Studenten;

public abstract class Personen {
    private String tätigkeit;

    public Personen(String tätigkeit){
        this.tätigkeit=tätigkeit;
    }

    public abstract String gibTeatigkeitAus();
    public String getTätigkeit(){
        return tätigkeit;
    }
}

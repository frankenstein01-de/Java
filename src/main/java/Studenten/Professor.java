package Studenten;

public class Professor extends Personen {
    public Professor(String tätikeit){
        super(tätikeit);
    }
    @Override
    public String gibTeatigkeitAus(){
        return "Der Professor unterrichtet das Fach "+getTätigkeit();
    }

}
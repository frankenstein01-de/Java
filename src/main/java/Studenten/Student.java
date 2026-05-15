package Studenten;

public class Student extends Personen {
    public Student(String tätigkeit){
        super(tätigkeit);
    }
    @Override
    public String gibTeatigkeitAus(){
        return "Der Student besucht das Fach "+getTätigkeit();
    }
}
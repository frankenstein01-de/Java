import static org.junit.jupiter.api.Assertions.*;

import Studenten.Personen;
import Studenten.Professor;
import Studenten.Student;
import org.junit.jupiter.api.Test;
public class SutudentenTest {
    @Test
    void sAnlegen(){
        Student a = new Student("Programmieren");
        assertEquals("Der Student besucht das Fach Programmieren",a.gibTeatigkeitAus());
    }
    @Test
    void pAnlegen(){
        Professor a = new Professor("Programmieren");
        assertEquals("Der Professor unterrichtet das Fach Programmieren",a.gibTeatigkeitAus());
    }
    @Test
    void ausgabe(){
        Personen[]a=new Personen[100];
        for(int i =0;i<a.length;i++){
            if(i%2==0){
                a[i]=new Student("Programmieren");
            }else{
                a[i]=new Professor("Programmieren");
            }
        }
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                assertEquals("Der Student besucht das Fach Programmieren",a[i].gibTeatigkeitAus());
            }else{
                assertEquals("Der Professor unterrichtet das Fach Programmieren",a[i].gibTeatigkeitAus());
            }
        }
    }
}

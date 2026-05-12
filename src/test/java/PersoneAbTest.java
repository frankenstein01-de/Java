import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PersoneAbTest {
    @Test
    void fachZuweisung(){
        PersonAb.Student j = new PersonAb.Student("Mathe");
        PersonAb.Professor h= new PersonAb.Professor("Mathe");
        assertEquals("Mathe",j.getFach());
        assertEquals("Mathe",h.getFach());
        assertEquals("Der Student besucht das Fach Mathe.",j.gibFachAus());
        assertEquals("Der Professor unterrichtet das Fach Mathe.",h.gibFachAus());
    }
    @Test
    void testArrayZuweisung(){
        PersonAb[] personen =new PersonAb[100];
        for(int i=0;i< personen.length;i++){
            if(i%2==0){
                personen[i]=new PersonAb.Student("Mathe");
            }else{
                personen[i]=new PersonAb.Professor("Mathe");
            }
        }
        assertEquals("Der Professor unterrichtet das Fach Mathe.",personen[1].gibFachAus());
        assertEquals("Der Student besucht das Fach Mathe.",personen[0].gibFachAus());

    }
}

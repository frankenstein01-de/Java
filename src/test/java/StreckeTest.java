import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StreckeTest {
    @Test
    void punktSpeichern(){
        Strecke s1=new Strecke(7,4);
        assertEquals(4,s1.getA());
        assertEquals(7,s1.getB());
    }
    @Test
    void ueberschneidne(){
        Strecke s1=new Strecke(4,7);
        Strecke s2=new Strecke(2,5);
        assertTrue(s1.ueberschneidet(s2));
    }
    @Test
    void nUeberschnei(){
        Strecke s1=new Strecke(4,7);
        Strecke s2=new Strecke(2,4);
        assertFalse(s1.ueberschneidet(s2));
    }
    @Test
    void toStringAuseinander(){
        Strecke s1=new Strecke(4,7);
        assertEquals("4---7",s1.toString());
    }
    @Test
    void toStringZusammen(){
        Strecke s1=new Strecke(4,4);
        assertEquals("4",s1.toString());
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class StreckeTest {
    @Test
    void streckeAnlegen(){
        Strecke a =new Strecke(1,2);
        Strecke b = new Strecke(5,1);
        assertEquals(1,a.getA());
        assertEquals(2,a.getB());
        assertEquals(1,b.getA());
        assertEquals(5,b.getB());
    }
    @Test
    void negativAnlegen(){
        assertThrows(RuntimeException.class,()->new Strecke(-1,2));
        assertThrows(RuntimeException.class,()->new Strecke(1,-2));
    }
    @Test
    void uebTestTrue(){
        Strecke a =new Strecke(1,2);
        Strecke b = new Strecke(1,5);
        assertTrue(a.ueberschneiden(b));
    }
    @Test
    void uebTestFalse(){
        Strecke a =new Strecke(1,2);
        Strecke b = new Strecke(2,5);
        assertFalse(a.ueberschneiden(b));
    }
    @Test
    void toStringTest(){
        Strecke a=new Strecke(3,5);
        Strecke b =new Strecke(1,1);
        assertEquals("3--5",a.toString());
        assertEquals("1",b.toString());
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PunktTest {
    @Test
    void testBereichOk(){

        Punkt.verschiebePunkt(100,200);
        assertEquals(100,Punkt.x);
        assertEquals(200,Punkt.y);
    }
    @Test
    void testNegativX(){
        assertThrows(RuntimeException.class,()->{
            Punkt.verschiebePunkt(-1,100);
        });
    }
    @Test
    void testNegativY(){
        assertThrows(RuntimeException.class,()->{
            Punkt.verschiebePunkt(100,-1);
        });
    }
    @Test
    void testZuGroX(){
        assertThrows(RuntimeException.class,()->{
            Punkt.verschiebePunkt(1921,100);
        });
    }
    @Test
    void testZuGroY(){
        assertThrows(RuntimeException.class,()->{
            Punkt.verschiebePunkt(100,1081);
        });
    }
}

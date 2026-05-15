import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class KugelvolumenTest {

    @Test
    void kugelvolumenNegativ(){
        assertThrows(IllegalArgumentException.class,()->Kugelvolumen.berechneKugelvolumen(-1));
    }
    @Test
    void kugelvolumenEins(){
        assertEquals(4/3*Math.PI*1*1*1,Kugelvolumen.berechneKugelvolumen(1));
    }
    @Test
    void kugelvolumenNull(){
        assertEquals(4/3*Math.PI*0*0*0,Kugelvolumen.berechneKugelvolumen(0));
    }
    @Test
    void kugelvolumen5(){
        assertEquals(4/3*Math.PI*5*5*5,Kugelvolumen.berechneKugelvolumen(5));
    }
}

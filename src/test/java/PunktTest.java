import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PunktTest {
    @Test
    void punktVerschiben(){
        Punkt.verschiebePunkt(1000,200);
        assertEquals(1000,Punkt.x);
        assertEquals(200,Punkt.y);
    }
    @Test
    void negativ(){
        assertThrows(RuntimeException.class,()->Punkt.verschiebePunkt(-1,-2));
    }
    @Test
    void positiv(){
        assertThrows(RuntimeException.class,()->Punkt.verschiebePunkt(1981,1081));
    }

}

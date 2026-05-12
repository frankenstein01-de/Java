import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class KugelvolumenTest {

        @Test
        void testRadius0() {
            assertEquals(0.0, Kugelvolumen.berechneKugelvolumen(0), 0.0001);
        }

        @Test
        void testRadius1() {
            assertEquals((4.0 / 3.0) * Math.PI, Kugelvolumen.berechneKugelvolumen(1), 0.0001);
        }

        @Test
        void testRadius5() {
            assertEquals((4.0 / 3.0) * Math.PI * 125, Kugelvolumen.berechneKugelvolumen(5), 0.0001);
        }

        @Test
        void testNegativerRadius() {
            assertThrows(IllegalArgumentException.class, () ->
                    Kugelvolumen.berechneKugelvolumen(-1));
        }
    }


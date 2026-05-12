import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import schach.Brett;

public class BrettTest {

    @Test
    public void testKombiniere() {
        Brett b1 = new Brett();
        Brett b2 = new Brett();

        // b1 markiert ein paar Felder
        b1.markiereFeld(1, 1);
        b1.markiereFeld(3, 4);

        // b2 markiert andere Felder
        b2.markiereFeld(2, 2);
        b2.markiereFeld(3, 4); // Überschneidung

        Brett kombi = b1.kombiniere(b2);

        // Erwartete true-Felder
        int[][] erwartet = {
                {1, 1},
                {3, 4},
                {2, 2}
        };

        // Überprüfen: erwartete Felder müssen true sein
        for (int[] f : erwartet) {
            assertTrue(kombi.gibFeld(f[0], f[1]),
                    "Feld (" + f[0] + "," + f[1] + ") sollte markiert sein");
        }

        // Alles andere muss false sein
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {

                boolean sollteTrueSein = false;
                for (int[] f : erwartet) {
                    if (f[0] == x && f[1] == y) {
                        sollteTrueSein = true;
                        break;
                    }
                }

                if (!sollteTrueSein) {
                    assertFalse(kombi.gibFeld(x, y),
                            "Feld (" + x + "," + y + ") sollte NICHT markiert sein");
                }
            }
        }
    }
}
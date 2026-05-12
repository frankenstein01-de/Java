package muenzautomat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MünzautomatTest  {

    private final ChangeCalculator calc = new SimpleChangeCalculator();

    private int total(int[] arr) {
        int[] v = {1,2,5,10,20,50,100,200};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i] * v[i];
        return sum;
    }

    @Test
    public void testSimpleAmounts() {
        int[] c = calc.getChange(0, 99); // 99 Cent
        assertEquals(99, total(c));
    }

    @Test
    public void test2Euro87() {
        int[] c = calc.getChange(2, 87);
        assertEquals(287, total(c));

        // Erwartete optimale Stückelung:
        // 2€ = 1x 200
        // 50 = 1x
        // 20 = 1x
        // 10 = 1x
        // 5 = 1x
        // 2 = 1x
        //  (Summe Münzen: 6)
        assertEquals(1, c[7]); // 2 €
        assertEquals(1, c[5]); // 50
        assertEquals(1, c[4]); // 20
        assertEquals(1, c[3]); // 10
        assertEquals(1, c[2]); // 5
        assertEquals(1, c[1]); // 2
    }

    @Test
    public void testRoundEuroAmounts() {
        int[] c = calc.getChange(5, 0); // 500 Cent
        assertEquals(500, total(c));
        assertEquals(5, c[6]); // 5×1-Euro
    }

    @Test
    public void testMixed() {
        int[] c = calc.getChange(1, 34); // 134 Cent
        assertEquals(134, total(c));
    }
}

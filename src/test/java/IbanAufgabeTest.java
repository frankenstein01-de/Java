import static org.junit.jupiter.api.Assertions.*;

import Klasurvorbereitung.AufgabeIBAN.CheckIban;
import Klasurvorbereitung.AufgabeIBAN.FalscheIBANException;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IbanAufgabeTest {
    @Test
    void checkIbanTest(){
        CheckIban a1 = new CheckIban();
        String iban1 ="DE22100100500123456789";
        String iban2 ="DE12345";
        assertDoesNotThrow(() -> a1.checkIban(iban1));
        assertThrows(FalscheIBANException.class,()-> a1.checkIban(iban2));
    }
    @Test
    void liesIbanAusDateiTest(){
        CheckIban a1 =new CheckIban();
        String[] files ={"ibans.txt"};
        Map<String, List<String>> multiTest = a1.liesIbanAusDateien(files);
        assertEquals(1,multiTest.size());
        assertEquals(List.of("FF22100100500123456789","DE12345"),multiTest.get("ibans.txt"));
        assertTrue(multiTest.containsKey("ibans.txt"));
    }
}

import Klasurvorbereitung.Autoaufgabe.Auto;
import Klasurvorbereitung.Autoaufgabe.Autohändler;
import Klasurvorbereitung.Autoaufgabe.Kraftstoff;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoKlausuraufgabeTest {
    @Test
    void bestandSort(){
        Auto a1 = new Auto("Citroen C7", Kraftstoff.Elektro);
        Auto a2 = new Auto("Citroen C5", Kraftstoff.Diesel);
        Auto a3 = new Auto("Citroen C3", Kraftstoff.Elektro);
        List<Auto> unSortBestand = new ArrayList<>();
        unSortBestand.add(a1);
        unSortBestand.add(a3);
        unSortBestand.add(a2);
        Autohändler martin = new Autohändler(unSortBestand);
        Map<Kraftstoff,List<Auto>> sortier = martin.gesamtBestandSortiert();
        assertEquals("Citroen C7",sortier.get(Kraftstoff.Elektro).get(0).getName());
        assertEquals("Citroen C3",sortier.get(Kraftstoff.Elektro).get(1).getName());
    }

}

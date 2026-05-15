import static org.junit.jupiter.api.Assertions.*;

import Cybor.*;
import org.junit.jupiter.api.Test;
public class CyborTest {
    @Test
    void menschZufall(){
        Mensch a = new Mensch();
        int versuche = 1000;
        int anzahl=0;
        for(int i =0;i<versuche;i++){
            if(a.entscheide(Gefahrensituation.GEFAHR_VORNE)== Entscheidung.UNENTSCHIEDEN){
                anzahl++;
            }
        }
        double quote =(double)anzahl/versuche;
        assertTrue(quote>0.20 && quote<0.30,"Quote sollte bei ca. 25% liegen");
    }
    @Test
    void menschkeinZufall(){
        Mensch a =new Mensch();
        Entscheidung ergebnis;
        do{
            ergebnis=a.entscheide(Gefahrensituation.GEFAHR_RECHTS);
        }while (ergebnis==Entscheidung.UNENTSCHIEDEN);
        assertEquals(ergebnis,Entscheidung.LINKS);
        do{
            ergebnis=a.entscheide(Gefahrensituation.GEFAHR_LINKS);
        }while(ergebnis==Entscheidung.UNENTSCHIEDEN);
        assertEquals(ergebnis,Entscheidung.RECHTS);
        do{
            ergebnis=a.entscheide(Gefahrensituation.GEFAHR_VORNE);

        }while(ergebnis==Entscheidung.UNENTSCHIEDEN);
        assertEquals(ergebnis,Entscheidung.BREMSEN);

    }
    @Test
    void roboterTest(){
        Roboter a = new Roboter();
        assertEquals(a.entscheide(Gefahrensituation.GEFAHR_VORNE),Entscheidung.BREMSEN);
        assertEquals(a.entscheide(Gefahrensituation.GEFAHR_LINKS),Entscheidung.RECHTS);
        assertEquals(a.entscheide(Gefahrensituation.GEFAHR_RECHTS),Entscheidung.LINKS);
    }
    @Test
    void cyborg(){
        Mensch b = new Mensch();
        Roboter c = new Roboter();
        Cyborg a = new Cyborg(b,c);

        Gefahrensituation situation = Gefahrensituation.GEFAHR_RECHTS;
        for(int i = 0;i<100;i++){
            Entscheidung ergebnis = a.entscheide(situation);
            boolean erlaubt =(ergebnis==Entscheidung.LINKS||ergebnis==Entscheidung.UNENTSCHIEDEN);

            assertTrue(erlaubt,"Cyborg hat falsch reagiert: "+ergebnis+" ist bei Gefahr Rechts nicht erlaubt:! ");
        }
    }

}

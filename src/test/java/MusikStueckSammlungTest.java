import static org.junit.jupiter.api.Assertions.*;

import Klasurvorbereitung.AufgabeMsikstücksammlung.MusikStueck;
import Klasurvorbereitung.AufgabeMsikstücksammlung.MusikStueckSammlung;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusikStueckSammlungTest {
    @Test
    void toStringTest(){
        MusikStueck mSt =new MusikStueck("ThunderStruck","ACDC",250);
        assertEquals("Der Titel des Musikstücks: ThunderStruck| Die Gruppe des Stückes: ACDC| Die Dauer des Stückes: 250", mSt.toString());
    }
    @Test
    void musikStueckEinfügen(){
        MusikStueck m1 = new MusikStueck("ThunderStruck","ACDC",250);
        MusikStueck m2 =new MusikStueck("ThunderStruck","ACDC",250);
        Map<String,MusikStueck> sammlung=new HashMap<>();
        MusikStueckSammlung s1 = new MusikStueckSammlung(sammlung);
        s1.musikStueckEinfügen(m1);

        assertEquals(m1,sammlung.get("ThunderStruck"));
        assertThrows(IllegalArgumentException.class,()->s1.musikStueckEinfügen(m2));
    }
    @Test
    void nachTitelSort(){
        MusikStueck m1 = new MusikStueck("ThunderStruck","ACDC",250);
        MusikStueck m2 =new MusikStueck("BalckSabth","BlackSabth",350);
        Map<String,MusikStueck> sammlung=new HashMap<>();
        MusikStueckSammlung s1 = new MusikStueckSammlung(sammlung);
        s1.musikStueckEinfügen(m1);
        s1.musikStueckEinfügen(m2);
        List<MusikStueck> titelSort = s1.getAlleMusikStueckeNachTitel();
        assertEquals(m2,titelSort.get(0));

    }
    @Test
    void nachLeangeSort(){
        MusikStueck m1 = new MusikStueck("ThunderStruck","ACDC",250);
        MusikStueck m2 =new MusikStueck("BalckSabth","BlackSabth",350);
        Map<String,MusikStueck> sammlung=new HashMap<>();
        MusikStueckSammlung s1 = new MusikStueckSammlung(sammlung);
        s1.musikStueckEinfügen(m1);
        s1.musikStueckEinfügen(m2);
        List<MusikStueck> leangeSort = s1.getAlleMusikStueckeNachLaeange();
        assertEquals(m1,leangeSort.get(0));

    }
}

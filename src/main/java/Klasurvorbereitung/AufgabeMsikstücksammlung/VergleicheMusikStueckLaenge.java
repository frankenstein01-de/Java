package Klasurvorbereitung.AufgabeMsikstücksammlung;

import java.util.Comparator;

public class VergleicheMusikStueckLaenge implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck m1,MusikStueck m2){
        int vergleich = Integer.compare(m1.getLaenge(),m2.getLaenge());
        return vergleich;

    }
}

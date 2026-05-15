package Klasurvorbereitung.AufgabeMsikstücksammlung;

import java.util.Comparator;
import java.util.List;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {

    @Override
    public int compare(MusikStueck m1, MusikStueck m2) {
        int vergleich = (m1.getTitel().compareTo(m2.getTitel()));
        return vergleich;
    }
}


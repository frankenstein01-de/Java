package Klasurvorbereitung.AufgabeMsikstücksammlung;

import java.util.*;

public class MusikStueckSammlung {
    private Map<String,MusikStueck> sammlung = new HashMap<>();
    public MusikStueckSammlung(Map<String,MusikStueck> sammlung){
        this.sammlung=sammlung;
    }

    public Map<String, MusikStueck> getSammlung() {
        return sammlung;
    }

    public void musikStueckEinfügen(MusikStueck neu){
        if(getSammlung().containsKey(neu.titel)){
            throw new IllegalArgumentException("Der Titel bzw. das Stück ist bereits in der Liste");
        }
        else{
            sammlung.put(neu.getTitel(),neu);
        }
    }
    public List<MusikStueck> getAlleMusikStueckeNachTitel(){
        VergleicheMusikStueckTitel a =new VergleicheMusikStueckTitel();
        List<MusikStueck> nachTitel = new ArrayList<>();
        for(MusikStueck m: getSammlung().values()){
            nachTitel.add(m);
        }
        Collections.sort(nachTitel,a);
        return nachTitel;
    }
    public List<MusikStueck> getAlleMusikStueckeNachLaeange(){
        VergleicheMusikStueckLaenge a =new VergleicheMusikStueckLaenge();
        List<MusikStueck> nachLaeange= new ArrayList<>();
        for(MusikStueck m: getSammlung().values()){
            nachLaeange.add(m);
        }
        Collections.sort(nachLaeange,a);
        return nachLaeange;
    }
}

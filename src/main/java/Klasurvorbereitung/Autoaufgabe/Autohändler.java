package Klasurvorbereitung.Autoaufgabe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Autohändler {
    List<Auto> bestand = new ArrayList<>();

    public Autohändler(List<Auto> bestand){
        this.bestand=bestand;
    }
    public List<Auto> getBestand(){
        return bestand;
    }


    public List<Auto> nachKraftstoffFilter(Kraftstoff typ){
        return bestand.stream().filter(auto->auto.getK()==typ).toList();
    }
    public Map<Kraftstoff,List<Auto>> gesamtBestandSortiert(){
        Map<Kraftstoff,List<Auto>> sortierterBestand = new HashMap<>();
        for(Auto b: bestand){
            Kraftstoff k = b.getK();
            if(!sortierterBestand.containsKey(k)){
                sortierterBestand.put(k,new ArrayList<>());
            }
            sortierterBestand.get(k).add(b);
        }

        return sortierterBestand;

    }
}

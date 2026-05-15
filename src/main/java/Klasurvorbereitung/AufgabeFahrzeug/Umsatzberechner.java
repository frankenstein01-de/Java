package Klasurvorbereitung.AufgabeFahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Umsatzberechner {

    public double berechneGesamtUmsatzs(List<FahrzeugBasis> fuhrpark){
        double gesamU=0;
        for(FahrzeugBasis fahrzeug:fuhrpark){
            for(Fahrt f:fahrzeug.getFahrtenbuch()){
                gesamU=fahrzeug.entgeltBerechnung(f);
            }
        }
        return gesamU;
    }
    public double berechneGesamtEUmsatz(List<FahrzeugBasis> fuhrpark){
        List<FahrzeugBasis> nurE =new ArrayList<>();
        for(FahrzeugBasis fahrzeug:fuhrpark){
            if(fahrzeug instanceof Elektrofahrzeug){
                nurE.add(fahrzeug);
            }
        }
        return berechneGesamtUmsatzs(nurE);
    }

}

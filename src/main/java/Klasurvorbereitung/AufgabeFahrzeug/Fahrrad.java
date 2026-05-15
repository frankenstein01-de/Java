package Klasurvorbereitung.AufgabeFahrzeug;

public class Fahrrad extends FahrzeugBasis implements  Fahrzeuge {
    public double preis;

    public Fahrrad(double preis){
        this.preis=preis;
    }
    @Override
    public double entgeltBerechnung(Fahrt fahrt){
        return fahrt.getMin()*preis;
    }
}

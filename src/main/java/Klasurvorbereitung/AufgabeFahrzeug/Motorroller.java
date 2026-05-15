package Klasurvorbereitung.AufgabeFahrzeug;

public class Motorroller extends FahrzeugBasis implements Fahrzeuge {
    private double preis;
    public Motorroller(double preis){
        this.preis=0.125;
    }
    @Override
    public double entgeltBerechnung(Fahrt fahrt){
        return 3+fahrt.getKm()*preis;
    }
}

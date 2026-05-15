package Klasurvorbereitung.AufgabeFahrzeug;

public class Kleintransporter extends FahrzeugBasis implements Fahrzeuge{
    public double preisUnterStd;
    public double preisUeberStd;

    public Kleintransporter(double preisUnterStd,double preisUeberStd){
        this.preisUnterStd=0.30;
        this.preisUeberStd=0.25;
    }
    @Override
    public double entgeltBerechnung(Fahrt fahrt){
        double unterStunde =0;
        double ueberStunde =0;
        if(fahrt.getMin()>=60){
            unterStunde=preisUnterStd*fahrt.km;
            return unterStunde;
        }else{
            unterStunde=60*preisUnterStd;
            ueberStunde= (fahrt.getMin()-60)*preisUeberStd+preisUnterStd*fahrt.getKm()+unterStunde;
            return ueberStunde;
        }
    }
}

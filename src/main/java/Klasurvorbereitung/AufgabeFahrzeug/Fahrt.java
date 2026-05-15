package Klasurvorbereitung.AufgabeFahrzeug;

import java.util.ArrayList;
import java.util.List;

public class Fahrt {
    public int km; //kostenpflichtige Kilometer
    public int min; //kostenpflichtige Minuten

    public Fahrt(int km,int min){
        this.km=km;
        this.min=min;
    }
    public int getKm(){
        return km;
    }
    public int getMin(){
        return min;
    }
}
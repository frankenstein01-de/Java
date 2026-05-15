package Klasurvorbereitung.AufgabeFahrzeug;

import java.util.ArrayList;
import java.util.List;

public abstract class FahrzeugBasis implements Fahrzeuge {
    protected List<Fahrt> fahrtenbuch = new ArrayList<>();
    public void addFahrt(Fahrt fahrt){
        fahrtenbuch.add(fahrt);
    }
    public List<Fahrt> getFahrtenbuch(){
        return fahrtenbuch;
    }
}


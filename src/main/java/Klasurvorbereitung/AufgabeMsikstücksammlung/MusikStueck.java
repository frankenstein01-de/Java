package Klasurvorbereitung.AufgabeMsikstücksammlung;

public class MusikStueck
{
    String titel; // Name des Musikstueckes
    String interpret; // Gruppe/Saenger des Stueckes
    int laenge; // Dauer in Sekunden
    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }
    public String getTitel(){
        return titel;
    }
    public String getInterpret(){
        return interpret;
    }
    public int getLaenge(){
        return laenge;
    }
    @Override
    public String toString(){
        String a="Der Titel des Musikstücks: "+getTitel()+"| Die Gruppe des Stückes: "+getInterpret()+"| Die Dauer des Stückes: "+getLaenge();
        return a;
    }

}
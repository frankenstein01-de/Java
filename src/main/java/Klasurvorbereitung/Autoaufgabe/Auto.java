package Klasurvorbereitung.Autoaufgabe;

public class Auto {
    private String name;
    private Kraftstoff k;

    public Auto(String name,Kraftstoff k){
        this.name=name;
        this.k=k;
    }
    public Kraftstoff getK(){
        return k;
    }
    public String getName(){
        return name;
    }

}

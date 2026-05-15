package Quiz;

public abstract class Quizbogen {
    String frage;


    public Quizbogen(String frage){
        this.frage=frage;

    }
    public abstract String gibQuizbogenAus();
    public String getfrage(){
        return frage;
    }


}

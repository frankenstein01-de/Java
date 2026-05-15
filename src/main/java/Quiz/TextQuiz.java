package Quiz;

public class TextQuiz extends Quizbogen {
    public TextQuiz(String frage){
        super(frage);
        this.frage=frage;
    }

    @Override
    public String gibQuizbogenAus(){
        return getfrage()+"\nAntwort:\n\n";
    }

}

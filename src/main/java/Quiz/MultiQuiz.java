package Quiz;

public class MultiQuiz extends Quizbogen {
    private String[] antworten;

    public MultiQuiz(String fragen,String[] antworten){
        super(fragen);
        this.antworten=antworten;
    }
    @Override
    public String gibQuizbogenAus(){
        String quiz =getfrage()+"\nAntwortmöglichkeiten:\n";
        char b = 'A';
        for(int i =0;i<antworten.length;i++){
            quiz =quiz+b+":"+antworten[i]+"\n";
        }
        return quiz;
    }

}

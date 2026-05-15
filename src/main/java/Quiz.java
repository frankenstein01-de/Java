import java.util.Scanner;
public abstract class Quiz {
    String frage;
    String antwort;
    String[] antworten;


    public Quiz(String frage, String antwort,String[] antworten){
        this.frage=frage;
        this.antwort=antwort;
        this.antworten=antworten;

    }
    public abstract void generiereQuizbogen();

    public static class Textfrage extends Quiz{
        public Textfrage(String frage,String antwort){
            super(frage,antwort,null);

        }
        @Override
        public void generiereQuizbogen(){
            System.out.println(frage);
            System.out.println("Antwort:\n\n");

        }
    }
    public static class MultipleChoiceFrage extends Quiz{
        public MultipleChoiceFrage(String frage, String[] antworten){
            super(frage,null,antworten);
            this.antworten= antworten;
        }
        @Override
        public void generiereQuizbogen(){
            System.out.println(frage);
            char option = 'A';
            for(int i =0;i<antworten.length;i++){
                System.out.println(option+":"+antworten[i]);
                option++;
            }

        }

    }
    public static void main(String[] args) {
        Quiz[] quizfragen = new Quiz[2];

        quizfragen[0] = new Textfrage("Was ist die Hauptstadt von Deutschland?", "Berlin");
        quizfragen[1] = new MultipleChoiceFrage("Wie viele Planeten hat unser Sonnensystem?", new String[]{"7","8","9","10"});

        for(int i = 0; i < quizfragen.length; i++) {
            quizfragen[i].generiereQuizbogen();
            System.out.println();
        }
    }
}

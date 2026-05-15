package Quiz;

public class main {
    public static void main(String[]args){
        Quizbogen[] a = new Quizbogen[4];
        a[0]= new TextQuiz("Was ist die Hauptstadt von Deutschland?");
        a[1]= new TextQuiz("Ist Seife Lecker");
        a[2]= new MultiQuiz("Wie viele Protonen hat ein Wasserstoff-Atom?",new String[]{"4","2","1","0"});
        a[3]= new MultiQuiz("Wie viele Planeten haben wir in unseren Sonnensystem",new String[]{"1","5","9","7"});

        for(int i=0;i<a.length;i++){
            System.out.println(a[i].gibQuizbogenAus());
        }

    }

}



package Übunggenerics;


import java.net.URI;
import java.net.URL;

public class OptionalU<T>{
    private T inhalt;

    public OptionalU(T inhalt){
        this.inhalt=inhalt;
    }
    public T getInhalt(){
        return inhalt;
    }
    public void ausfuehrenWennVoll(){
        if(this.inhalt!=null){
            System.out.println("Ich lade jetzt die Seite: "+inhalt.toString());
        }
    }
    public static void main(String[]args)throws Exception{
        URL meineUrl = new URI("https://google.de").toURL();
        OptionalU<URL> urlTresor= new OptionalU<>(meineUrl);
        OptionalU<Integer> a = new OptionalU<>(2000);
        System.out.println(a.getInhalt());
        urlTresor.ausfuehrenWennVoll();
        OptionalU<String> nameBox = new OptionalU<>("Max");





    }
}

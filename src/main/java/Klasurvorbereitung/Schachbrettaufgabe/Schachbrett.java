package Klasurvorbereitung.Schachbrettaufgabe;



import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Schachbrett implements Iterable<Character>{
    char[][] brett = new char[8][8];
    @Override
    public Iterator<Character> iterator(){
        return new SchachbrettIterator();
    }
    private class SchachbrettIterator implements Iterator<Character>{
        private int zeile = 0;
        private int spalte = 0;


        @Override
        public boolean hasNext(){
            return zeile<8;
        }
        @Override
        public Character next(){
            if(!hasNext()){
                try {
                    throw new NoSuchFieldException();
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            }
            char aktuellesZeichen = brett[zeile][spalte];

            spalte++;
            if(spalte>=8){
                spalte=0;
                zeile++;
            }
            return aktuellesZeichen;
        }

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Explizite Nutzung: Wir holen uns den Iterator-Arbeiter direkt
        Iterator<Character> it = this.iterator();

        while (it.hasNext()) {
            sb.append(it.next());
        }

        return sb.toString();
    }
}

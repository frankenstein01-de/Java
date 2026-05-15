package le20ue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Maumau {
    public static void main(String[]args){
        List<karten> deck = new ArrayList<>();
        for(Farbe f:Farbe.values()){
            for(Wert w:Wert.values()){
            karten neueKarte = new karten(f,w);
            deck.add(neueKarte);
            }
        }
        java.util.Collections.shuffle(deck);

        Spieler s1 = new Spieler("Torben");
        for(int i=0;i<5;i++){
            karten gezogen = deck.remove(0);
            s1.add(gezogen);
        }
        s1.zeigeHand();
    }
}

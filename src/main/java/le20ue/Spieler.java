package le20ue;

import java.util.ArrayList;
import java.util.List;

public class Spieler {
    private String name;
    private List<karten> hand;
    public Spieler(String name){
        this.hand=new ArrayList<>();
        this.name=name;
    }
    public void add(karten k){
        hand.add(k);
    }

    public void zeigeHand(){
        int i =1;
        for(karten k: hand){
            System.out.println("Karte "+i+": "+k.toString());
            i++;
        }
    }
}

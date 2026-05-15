package Cybor;

public class Roboter implements Fahrer{
    @Override
    public Entscheidung entscheide(Gefahrensituation situation) {
        switch(situation){
            case GEFAHR_LINKS: return Entscheidung.RECHTS;
            case GEFAHR_RECHTS: return Entscheidung.LINKS;
            case GEFAHR_VORNE: return Entscheidung.BREMSEN;
            default: return Entscheidung.UNENTSCHIEDEN;
        }
    }
}

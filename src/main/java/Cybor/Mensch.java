package Cybor;

public class Mensch implements Fahrer{
    @Override
    public Entscheidung entscheide(Gefahrensituation situation){
        if(Math.random()<0.25){
            return Entscheidung.UNENTSCHIEDEN;
        }
        else if(situation ==Gefahrensituation.GEFAHR_RECHTS){
                return Entscheidung.LINKS;
            }
        else if(situation ==Gefahrensituation.GEFAHR_LINKS){
            return Entscheidung.RECHTS;
        }
        else{
            return Entscheidung.BREMSEN;
        }

    }

}

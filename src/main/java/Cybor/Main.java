package Cybor;

public class Main {
    public static void main(String[]args){
        Mensch a = new Mensch();
        Roboter b = new Roboter();
        System.out.println("Der Mensch tut: "+a.entscheide(Gefahrensituation.GEFAHR_VORNE));
        System.out.println("Der Roboter tut: "+b.entscheide(Gefahrensituation.GEFAHR_RECHTS));

        Cyborg c = new Cyborg(new Mensch(),new Roboter());
        Gefahrensituation gefahr = Gefahrensituation.GEFAHR_VORNE;

        for(int i=0;i<5;i++){
            System.out.println(c.entscheide(gefahr));
        }

    }
}

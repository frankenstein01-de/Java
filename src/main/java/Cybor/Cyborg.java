package Cybor;

public class Cyborg implements Fahrer{
    private Mensch menschAnteil;
    private Roboter roboterAnteil;
    public Cyborg(Mensch menschAnteil,Roboter roboterAnteil){
        this.menschAnteil=new Mensch();
        this.roboterAnteil=new Roboter();
    }
    @Override
    public Entscheidung entscheide(Gefahrensituation situation) {
        Entscheidung entMensch = menschAnteil.entscheide(situation);
        Entscheidung entRoboter = roboterAnteil.entscheide(situation);
        if(entMensch==entRoboter){
            return entMensch;
        }else{
            if(Math.random()<0.5){
                return entRoboter;
            }else{
                return entMensch;
            }
        }
    }
}

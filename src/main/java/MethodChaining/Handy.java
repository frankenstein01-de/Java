package MethodChaining;

public class Handy implements IPowerStep,IPinStep,ICallStep{
    private int pin;
    private String number;

    private Handy(){}

    public static IPowerStep start(){
        return new Handy();
    }
    @Override
    public IPinStep powerOn(){
        System.out.println("Handy ist an");
        return this;
    }
    @Override
    public ICallStep enterPin(int pin){
        this.pin=pin;
        return this;
    }
    @Override
    public void call(String number){
        this.number=number;
        System.out.println("Die Nummer: "+ number+" wird angerufen");

    }

    public static void main(String[]args){
        Handy.start().powerOn().enterPin(123).call("68514");
    }


}

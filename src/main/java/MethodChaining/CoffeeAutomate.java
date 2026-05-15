package MethodChaining;

public class CoffeeAutomate implements IWaterStep,IBeanStep,IBrewStep {
    private int ml;
    private String type;

    private CoffeeAutomate(){}
    public static IWaterStep start(){
        return new CoffeeAutomate();
    }
    @Override
    public IBeanStep fillWater(int ml){
        this.ml=ml;
        return this;
    }
    @Override
    public IBrewStep chooseBeans(String type){
        this.type=type;
        return this;
    }
    @Override
    public void brew(){
        System.out.println("Der Kaffee wir mit: "+ml+" ml und den Bohnen: "+type+" gebraut");
    }
    public static void main(String[]args){
        CoffeeAutomate.start().fillWater(100).chooseBeans("Anusdestroyers").brew();
    }
}

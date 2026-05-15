package SmartHome;

public class Toaster implements Strombetrieben{
    String name;
    public Toaster(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void einschalten(){
        System.out.println("Der Toaster:"+getName()+" wird eingeschalten");

    }
}

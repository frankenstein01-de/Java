package SmartHome;


public class SmartTv implements Strombetrieben,WlanFaehig{
    String name;
    public SmartTv(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void verbindeMitWlan(){
        System.out.println("Der SmartTv:"+getName()+" verbindet sich mit dem Wlan");
    }
    @Override
    public void einschalten(){
        System.out.println("Der SmartTv:"+getName()+" wird eingeschalten");
    }

}

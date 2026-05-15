package SmartHome;

public class Main {
    public static void main(String[]args){
        SmartTv a = new SmartTv("SamsungQled");
        Toaster b = new Toaster("Ninjatoast");

        a.einschalten();
        a.verbindeMitWlan();
        b.einschalten();
    }
}

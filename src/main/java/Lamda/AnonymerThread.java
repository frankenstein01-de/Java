package Lamda;

public class AnonymerThread {
    public static void main(String[]args){
        int zahlentesten =64564;

        Runnable r = ()->{
            boolean istPrimzahl;

            if(zahlentesten<2) istPrimzahl=false;
            else istPrimzahl = true;
            for(int divisor=2;divisor < zahlentesten;divisor++){
                if(zahlentesten%divisor==0) istPrimzahl = false;
                System.out.println(zahlentesten+" ist"+ (istPrimzahl?"eine":"keine")+" Primzahl");
            }

        };
        Thread t= new Thread(r);
        t.start();
    }
}

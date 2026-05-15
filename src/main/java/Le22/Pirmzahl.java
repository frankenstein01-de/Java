package Le22;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pirmzahl extends Thread{
    private List<Long> zahlen = new ArrayList<>();
    private Map<Long, Boolean> ergebnis = new HashMap<>();
    public Pirmzahl(List<Long> zahlen){
        this.zahlen=zahlen;
    }
    private boolean isPrime(long n){
        if(n<2)return false;
        if(n==2||n==3)return true;
        if(n%2==0) return false;
        for(long divisor =3;divisor*divisor<=n; divisor+=2){
            if(n%divisor==0){
                return false;
            }
        }
        return true;
    }
    public Map<Long,Boolean> getErgebnis(){
        return ergebnis;
    }
    @Override
    public void run(){
        for(Long z:zahlen) {
            ergebnis.put(z,isPrime(z));
        }
    }
    public static void main(String[]args){
        List<Long> l1 = new ArrayList<>();
        Long a =0L;
        for(int i=0;i<100;i++){
            l1.add(a);
            a++;
        }
        Pirmzahl a1= new Pirmzahl(l1);
        a1.start();
        try{
            a1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Map<Long, Boolean> gesamtMap = new HashMap<>();
        gesamtMap.putAll(a1.getErgebnis());
        gesamtMap.forEach((zahl, check)->{
            System.out.println(zahl+"->"+check);
        });


    }
}

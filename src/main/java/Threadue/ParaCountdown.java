package Threadue;

import java.util.ArrayList;
import java.util.List;

public class ParaCountdown implements Runnable{
    public List<Integer> zahlen;
    public ParaCountdown(List<Integer> zahlen){
         this.zahlen=zahlen;
    }
    public static void main(String[]args){
        List<Integer>hoch =new ArrayList<>();
        for(int i=1;i<11;i++){
            hoch.add(i);
        }
        List<Integer>runter = new ArrayList<>();
        for(int i=10;i>0;i--){
           runter.add(i);
        }
        ParaCountdown hochT =new ParaCountdown(hoch);
        ParaCountdown runterT=new ParaCountdown(runter);
        Thread coutH = new Thread(hochT);
        Thread countR= new Thread(runterT);

        coutH.start();
        countR.start();
    }
    @Override
    public void run(){
        for(Integer zahl: zahlen){
            System.out.println(Thread.currentThread().getName()+"zeigt: "+zahl);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}

package Le22;

public class YingYangLokal{
    public static void main(String[]args){
        class MeinYinThread extends Thread{
            public void run(){
                try{
                    while(true){
                        System.out.println("Yin");
                        Thread.sleep(500);

                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
        MeinYinThread t = new MeinYinThread();
        t.start();
        try{
            while(true){
                System.out.println("Yang");
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

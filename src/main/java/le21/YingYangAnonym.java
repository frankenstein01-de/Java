package le21;

public class YingYangAnonym extends Thread {
    public static void main(String[]args){
        String msg ="Yang";
        Thread tAnonym = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while(true){
                        System.out.println(msg);
                        Thread.sleep(500);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        tAnonym.start();
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

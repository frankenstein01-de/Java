package Le22;

public class YingYangInter implements Runnable{
    private String msg;
    public YingYangInter(String msg){
        this.msg=msg;

    }
    public String getMsg(){
        return msg;
    }
    public static void main(String[]args){
        YingYangInter aufgabe = new YingYangInter("Yang");
        Thread t = new Thread(aufgabe);
        t.start();
        while(true){
            try {
                System.out.println("Yin");
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run(){
        while(true){

            try{
            System.out.println(getMsg());
            Thread.sleep(500);

            }catch (InterruptedException e){
            e.printStackTrace();

            }

        }
    }

}

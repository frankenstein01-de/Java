package Le22;

public class YinYang extends Thread {
    private String msg;
    public YinYang(String msg){
        this.msg=msg;

    }
    public String getMsg(){
        return msg;
    }
    public static void main(String[]args){
        //YinYang yang = new YinYang("Yang");
        //YinYang yin = new YinYang("Yin");
        YinYang aAufgabe = new YinYang("Yang");
        aAufgabe.start();
        //yin.start();
        //yang.start();
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
        try{
            while(true){
            System.out.println(getMsg());
            Thread.sleep(500);
        }
        }catch(InterruptedException e){
        e.printStackTrace();
        }
    }
}
    //@Override
    //public void run(){
        //try{
            //while(true){
               // System.out.println(getMsg());
                //Thread.sleep(500);

        //}catch(InterruptedException e){
           // e.printStackTrace();
        //}
   // }
//}

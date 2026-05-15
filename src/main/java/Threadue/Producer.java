package Threadue;



public class Producer implements Runnable{
    private WareHouse warehouse;
    public Producer(WareHouse warehouse){
        this.warehouse=warehouse;
    }

    @Override
    public void run(){
        int i=0;
        while(true){

           try{
               warehouse.addItem(i);
               i++;
               Thread.sleep(250);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
        }

    }
}

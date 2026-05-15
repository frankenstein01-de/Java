package Threadue;

public class Consumer<S> implements Runnable{
    private WareHouse warehouse;
    public Consumer(WareHouse warehouse){
        this.warehouse=warehouse;
    }
    @Override
    public void run(){
        while(true){
            try{
                warehouse.removeItem();
                Thread.sleep(500);

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}

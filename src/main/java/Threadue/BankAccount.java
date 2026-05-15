package Threadue;

public class BankAccount {
    private int kontoStand;
    public BankAccount(int kontoStand){
        this.kontoStand=kontoStand;
    }
    public synchronized void withdeaw(int amount){
        if(kontoStand>=amount){
            try{
                Thread.sleep(10);
                this.kontoStand=kontoStand-amount;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            kontoStand-=amount;

        }
    }

    public int getKontoStand() {
        return kontoStand;
    }
}

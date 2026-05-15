package Threadue;

public class WithdrawTask implements Runnable{
    private BankAccount account;
    public WithdrawTask(BankAccount account){
        this.account=account;
    }
    @Override
    public void run(){
        for(int i = 0;i<100;i++){
            account.withdeaw(1000000);
        }

    }
    public static void main(String[]args) throws InterruptedException {
        BankAccount shared = new BankAccount(10000000);
        WithdrawTask task1 = new WithdrawTask(shared);
        WithdrawTask task2 = new WithdrawTask(shared);

        Thread t1 = new Thread(task1,"Person1");
        Thread t2 = new Thread(task2,"Person2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(shared.getKontoStand());
    }
}

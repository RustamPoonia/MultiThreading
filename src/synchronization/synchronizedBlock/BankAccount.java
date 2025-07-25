package synchronization.synchronizedBlock;

public class BankAccount {
//   private int amount  = 1000;
    private int balance = 1000;

    public void withdrow(int amoutn) throws InterruptedException {
       System.out.println("Just a Second");
       synchronized (this){
           if(this.balance <= amoutn){
               System.out.println("insufficient balance");
           }
           else {
               System.out.println("withdrowing");
//               Thread.sleep(1000);
               balance = balance-amoutn;
               System.out.println("amount withdrowed!!"+amoutn);
           }
       }
   }
}

class Atm extends  Thread{
    private BankAccount bankAccount = new BankAccount();
    private int amount;
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName()+":is using Atm");
            bankAccount.withdrow(amount);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Atm ram = new Atm();
        ram.amount = 1000;
        ram.start();

        Atm rahul = new Atm();
        rahul.amount =500;
        rahul.start();
    }


}

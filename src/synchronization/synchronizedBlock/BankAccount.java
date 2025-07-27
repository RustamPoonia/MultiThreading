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
               Thread.sleep(1000);
               balance = balance-amoutn;
               System.out.println("amount withdrowed!!"+amoutn);
           }
       }
   }
}

class Atm extends  Thread{
    private BankAccount bankAccount;
    private int amount;

    Atm(BankAccount bankAccount,int amount){
        this.bankAccount = bankAccount;
        this.amount = amount;
    }
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
        BankAccount bankAccount = new BankAccount();
        Atm ram = new Atm(bankAccount,1000);
        ram.start();

        Atm rahul = new Atm(bankAccount,500);
        rahul.start();
    }


}

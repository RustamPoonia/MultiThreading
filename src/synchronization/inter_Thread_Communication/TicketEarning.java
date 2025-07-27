package synchronization.inter_Thread_Communication;

public class TicketEarning extends Thread{
    int totel = 0;
    public void run(){
        System.out.println("Total earning is :"+totel);
        synchronized(this) {
            for (int i = 0; i <= 10; i++) {
                totel = totel + 100;
                this.notify();
            }

        }
    }
}

class Test {
    public static void main(String[] args) throws InterruptedException {
        TicketEarning obj = new TicketEarning();
        obj.start();
             synchronized(obj){
                 obj.wait();
                 System.out.println("Total earning is :"+obj.totel);
             }
    }

}

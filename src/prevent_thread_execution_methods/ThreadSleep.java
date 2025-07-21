package prevent_thread_execution_methods;

public class ThreadSleep extends Thread {

    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000, 3400);
                System.out.println(i);
            }
        }
        catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }


 class Test{
     public static void main(String[] args) {
         for (int i = 1; i <= 5; i++) {
//             Thread.sleep(1000, 3400);
             System.out.println(i);
         }
         ThreadSleep obj = new ThreadSleep();
         obj.start();
     }
}
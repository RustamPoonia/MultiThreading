package prevent_thread_execution_methods;

public class YieldTest extends Thread{
   public void run(){
       Thread.yield();
       for(int i=0;i<=5;i++){
           System.out.println(i+" "+Thread.currentThread().getName());
       }
   }
    public static void main(String[] args) {
        YieldTest t= new YieldTest();
        t.start();

        for (int i =0;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
package prevent_thread_execution_methods;

public class Testsleep extends Thread {
     public void run(){
//         try{
             for(int i =0;i<=5;i++){
                 System.out.println(i+ ":"+Thread.currentThread().getName());
//                 Thread.sleep(1000);
             }
//         }
//         catch(InterruptedException e)
//         {
//             System.out.println(e);
//         }

     }

    public static void main(String[] args) throws InterruptedException {
        Testsleep t= new Testsleep();
        t.start();
//        t.run();

//        Testsleep t1 = new Testsleep();
//        t1.start();
//        t.run();
            for(int i =0 ; i<=5;i++){
                System.out.println(i+":"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
    }
}


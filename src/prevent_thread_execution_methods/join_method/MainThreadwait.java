package prevent_thread_execution_methods.join_method;

public class MainThreadwait extends Thread{

    public static Thread mainThread;
    public void run(){
        try {
            mainThread.join();
            for (int i = 0; i <= 4; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mainThread = Thread.currentThread();

        MainThreadwait mtw = new MainThreadwait();
        mtw.start();

        try {
  //            mtw.join(); DeadLock happen if we un-comment this
            for (int i = 0; i <= 4; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

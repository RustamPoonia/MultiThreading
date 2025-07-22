package prevent_thread_execution_methods.join_method;

public class JoinThread extends Thread{
    public void run(){
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(i + ":" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        JoinThread t= new JoinThread();
        t.start();
        t.join();
        for(int i =0;i<=5;i++){
            System.out.println(i+":"+Thread.currentThread().getName());
        }
    }
}

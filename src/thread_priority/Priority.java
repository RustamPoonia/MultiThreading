package thread_priority;

public class Priority extends Thread{
    public void run(){
        System.out.println("Thread task");
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
//        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Priority pr = new Priority();
        pr.setPriority(10);
        pr.start();
    }
}

package Thread_Naming;

public class Thread1 extends Thread{

 public void run(){
     System.out.println(Thread.currentThread().getName());
     Thread.currentThread().setName("Rustam");
     System.out.println(Thread.currentThread().getName());
     System.out.println("Thread task");

 }

    public static void main(String[] args) {
        Thread1 th = new Thread1();
        th.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(th.isAlive());
    }
}

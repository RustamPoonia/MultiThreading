package diff_Cases_In_Multithreading;
//Performing multiple tasks from multiple Threads
public class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread task1");
    }
}
 class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread task2");

    }
 }

 class Main{
     public static void main(String[] args) {
         Thread1 t= new Thread1();
         Thread2 th = new Thread2();

         t.start();
         th.start();
     }
 }


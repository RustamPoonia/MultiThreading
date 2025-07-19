package creating_thread;

public class Test1 implements Runnable{
    public void run(){
        System.out.println("Thread task");
    }
//    public void start(){
//        System.out.println("Start method");
//    }

    public static void main(String[] args) {
        Test1 t= new Test1();
        Thread th = new Thread(t);
        th.start();
    }

}


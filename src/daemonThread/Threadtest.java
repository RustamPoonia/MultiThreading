package daemonThread;

public class Threadtest extends Thread{

    public void run(){
        System.out.println("Daemon Thread");
    }

    public static void main(String[] args) {
//        System.out.println("Main Thread");

        Threadtest t = new Threadtest();
//        t.setDaemon(true);
        t.start();
        System.out.println(t.isDaemon());

        Threadtest t1 = new Threadtest();
        t1.setDaemon(true);
        t1.start();
//        System.out.println(t1.isDaemon());
    }

}

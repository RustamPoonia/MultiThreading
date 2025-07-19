package creating_thread;

//By Extending Thread class
public class Test extends Thread {

    public void run(){
        System.out.println("Thread Task");

    }
//    public void run(int i){
//        System.out.println(i);
//    }

//    public void start(){
//        System.out.println("start method");
//    }

    public static void main(String[] args) {
        Test t= new Test();
//        t.run(1);
//        t.start(1);
        t.start();
    }
}

package Thread_Naming;

public class TestThread {

    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Rustam");
        int a = 10/0;
    }
}

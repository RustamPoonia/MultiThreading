package interrupt_methods;

public class Test extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
//                Thread.sleep(1000);
            }
        }
        catch( Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Test t= new Test();
        t.start();
        t.interrupt();
    }
}

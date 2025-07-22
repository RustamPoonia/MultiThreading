package prevent_thread_execution_methods.join_method;


class Medical extends  Thread{
    public void run() {
        try {
            System.out.println("Medical started");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class TestDrive extends Thread{
    public void run() {
        try {
            System.out.println("Test Drive started");
            Thread.sleep(4000);
            System.out.println("Test Drive Completed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Sign extends Thread{
    public void run() {
        try {
            System.out.println("File Submit");
            Thread.sleep(2000);
            System.out.println("Ok Signed");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class LicenceDemo  {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();

        TestDrive td = new TestDrive();
        td.start();
        td.join();

        Sign sign = new Sign();
        sign.start();
    }

}

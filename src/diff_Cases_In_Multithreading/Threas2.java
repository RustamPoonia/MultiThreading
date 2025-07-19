package diff_Cases_In_Multithreading;
//Performing single Task from multiple Threads
class Threas2 extends Thread{
    public void run(){
        System.out.println("task Thread");
    }

}
class Test{
    public static void main(String[] args) {
        Threas2 th = new Threas2();
        Threas2 th1= new Threas2();
        Threas2 th2 = new Threas2();
        th.start();
        th1.start();
        th2.start();
    }
}

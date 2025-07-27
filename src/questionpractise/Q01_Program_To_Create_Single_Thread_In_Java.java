package questionpractise;

public class Q01_Program_To_Create_Single_Thread_In_Java {
    public static void main(String[] args){
        Thread t1 = Thread.currentThread();
        t1.setName("My Main Thread");
        t1.setPriority(7); //byDefault priority ofMain Thread is 5
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
    }

}

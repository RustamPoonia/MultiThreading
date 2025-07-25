package synchronization.staticSynchronization;

public class BookTickit {
    static  int  totel_seats = 10;
    public static synchronized  void bookSeat(int seat ,String name){
        if(totel_seats >= seat){
            System.out.println("Seat booked Successfully by :"+name);
            totel_seats = totel_seats -seat;
            System.out.println( totel_seats +": Seats are left");
        }
        else {
            System.out.println("Not sufficient seats:"+ name);
            System.out.println(totel_seats +": Left only");
        }
    }
}

class Thread1 extends Thread{

    private BookTickit b;
    private  int seat;
    private String name;
    Thread1(BookTickit b , int seat, String name){
        this.b = b;
        this.seat=seat;
        this.name = name;
    }
    public void run(){
        b.bookSeat(seat,name);
    }
}
class Thread2 extends Thread{
    private BookTickit b;
    private  int seat;
    private String name;
    Thread2(BookTickit b , int seat, String name){
        this.b = b;
        this.seat=seat;
        this.name = name;
    }
    public void run(){
        b.bookSeat(seat,name);
    }
}

class BookTickitApp {
    public static void main(String[] args) {
        BookTickit bookTickit = new BookTickit();
        Thread1 t1= new Thread1(bookTickit ,5,"Rustam t1");
        t1.start();

        Thread2 t2 = new Thread2(bookTickit ,5,"Rahul t2");
        t2.start();

        BookTickit bookTickit1 = new BookTickit();
        Thread1 t1obj= new Thread1(bookTickit1 ,5,"Rustam t1");
        t1obj.start();

        Thread2 t2obj = new Thread2(bookTickit1 ,5,"Rahul t2");
        t2obj.start();

    }
}
package synchronization.synchronizedMethod;

public class SynchronizedBookTickit {
    int totel_seats = 10;
  public  synchronized  void bookSeat(int seat ,String name){
        if(totel_seats >= seat){
            System.out.println("Seat booked Successfully by :"+name);
            totel_seats = totel_seats -seat;
            System.out.println( totel_seats +": Seats are left");
        }
        else {
            System.out.println("Not sufficient seats");
            System.out.println(totel_seats +": Left only");
        }
    }
}
class CenimaUi extends  Thread{
    public static SynchronizedBookTickit bookTickit;
    public static SynchronizedBookTickit bookTickit1;
    int seat;
    String name ;
    public void run(){

        bookTickit.bookSeat(seat,name);
        bookTickit1.bookSeat(seat,name);
    }
    public static void main(String[] args) {
        bookTickit = new SynchronizedBookTickit();
        bookTickit1 = new SynchronizedBookTickit();

        CenimaUi rustam = new CenimaUi();
        rustam.seat = 8;
        rustam.name ="Rustam";
        rustam.start();

        CenimaUi deepak = new CenimaUi();
        deepak.seat = 7;
        deepak.name = "Deepak";
        deepak.start();
    }
}

package synchronization.whySynchronization;

public class BookTickit {
        int totel_seats = 10;
        public void bookSeat(int seat ,String name){
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

class CenimaApp extends  Thread{
     public static BookTickit bookTickit;
     int seat;
     String name ;
    public void run(){
        bookTickit.bookSeat(seat,name);
    }
    public static void main(String[] args) {
        bookTickit = new BookTickit();

        CenimaApp rustam = new CenimaApp();
        rustam.seat = 8;
        rustam.name ="Rustam";
        rustam.start();

        CenimaApp deepak = new CenimaApp();
        deepak.seat = 7;
        deepak.name = "Deepak";
        deepak.start();
    }
}

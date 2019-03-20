import java.util.ArrayList;

public class Bookings {

    private Bedroom bedroom;
    private Integer nights;

    public Bookings(Integer nights){
        this.bedroom = null;
        this.nights = nights;
    }

    public int countNights() {
        return this.nights;
    }

//    public int bookRoom() {
//        return this.bedroom.countNights();
//    }
}

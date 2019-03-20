import java.util.ArrayList;

public class Bedroom {

    private Integer roomNumber;
    private Integer capacity;
    private Integer collection;
    private String type;
    private ArrayList<Guests> guests;
    private Bookings booking;

    public Bedroom(Integer roomNumber, Integer capacity, Integer collection, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.collection = collection;
        this.type = type;
        this.guests = new ArrayList<Guests>();
        this.booking = null;
    }


    public int guestCount() {
        return this.guests.size();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCollection() {
        return this.collection;
    }

    public String getRoomType() {
        return this.type;
    }

    public void add(Guests guest) {
        if(guestCount() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void remove(Guests guest){
        this.guests.remove(guest);
    }

//    public int bookRoom() {
//        return this.booking.countNights();
//    }
//
//    public int countNights() {
//        return this.booking.countNights();
//    }
}

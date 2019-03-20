import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedroom;
    private ArrayList<Guests> guest;

    public Hotel(String name){
        this.name = name;
        this.bedroom = new ArrayList<Bedroom>();
        this.guest = new ArrayList<Guests>();
    }

    public String getHotelName() {
        return this.name;
    }

    public void checkIn(Guests guest, Bedroom bedroom){
        bedroom.add(guest);
    }

    public void checkIn(Guests guest, ConferenceRoom conferenceRoom){
        conferenceRoom.add(guest);
    }

    public void checkIn(Guests guest, DiningRoom diningRoom){
        diningRoom.add(guest);
    }

    public void checkOut(Guests guest, Bedroom bedroom) {
        bedroom.remove(guest);
    }

    public void checkOut(Guests guest, ConferenceRoom conferenceRoom){
        conferenceRoom.remove(guest);
    }

    public void checkOut(Guests guest, DiningRoom diningRoom){
        diningRoom.remove(guest);
    }

}

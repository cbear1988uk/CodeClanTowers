import java.util.ArrayList;

public class DiningRoom {

    private Integer capacity;
    private Integer collection;
    private String name;
    private ArrayList<Guests> guests;

    public DiningRoom(Integer capacity, Integer collection, String name){
        this.capacity = capacity;
        this.collection = collection;
        this.name = name;
        this.guests = new ArrayList<Guests>();
    }


    public int guestCount() {
        return this.guests.size();
    }


    public int getCapacity() {
        return this.capacity;
    }


    public int getCollection() {
        return this.collection;
    }


    public String getRoomName() {
        return this.name;
    }


    public void add(Guests guest) {
        if(guestCount() < this.capacity){
            this.guests.add(guest);
        }
    }

    public void remove(Guests guest) {
        this.guests.remove(guest);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    public DiningRoom diningRoom;
    public Guests guest;

    @Before
    public void setup(){
        diningRoom = new DiningRoom(10, 6, "Arran Lounge");
        guest = new Guests("Daniel Faraday");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, diningRoom.getCapacity());
    }

    @Test
    public void hasCollectionOfPeople(){
        assertEquals(6, diningRoom.getCollection());
    }

    @Test
    public void hasRoomName(){
        assertEquals("Arran Lounge", diningRoom.getRoomName());
    }

    @Test
    public void canAddPersonToRoom(){
        diningRoom.add(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemovePersonFromRoom(){
        diningRoom.remove(guest);
        assertEquals(0, diningRoom.guestCount());
    }
}

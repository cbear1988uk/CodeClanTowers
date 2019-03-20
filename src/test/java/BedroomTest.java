import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    public Bedroom bedroom;
    public Guests guest;

    @Before
    public void setup(){
        bedroom = new Bedroom(245, 2, 2, "Double Bed");
        guest = new Guests("Daniel Faraday");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(245, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasCollectionOfPeople(){
        assertEquals(2, bedroom.getCollection());
    }

    @Test
    public void hasRoomType(){
        assertEquals("Double Bed", bedroom.getRoomType());
    }

    @Test
    public void canAddPersonToRoom(){
        bedroom.add(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemovePersonFromRoom(){
        bedroom.remove(guest);
        assertEquals(0, bedroom.guestCount());
    }

}

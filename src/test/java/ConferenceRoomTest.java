import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    public ConferenceRoom conferenceRoom;
    public Guests guest;

    @Before
    public void setup(){
        conferenceRoom = new ConferenceRoom(6, 4, "Conference Room 1");
        guest = new Guests("Daniel Faraday");
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(6, conferenceRoom.getCapacity());
    }

    @Test
    public void hasCollectionOfPeople(){
        assertEquals(4, conferenceRoom.getCollection());
    }

    @Test
    public void hasRoomName(){
        assertEquals("Conference Room 1", conferenceRoom.getRoomName());
    }

    @Test
    public void canAddPersonToRoom(){
        conferenceRoom.add(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemovePersonFromRoom(){
        conferenceRoom.remove(guest);
        assertEquals(0, conferenceRoom.guestCount());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestsTest {

    private Guests guest;
    private Bedroom bedroom;

    @Before
    public void setup(){
        guest = new Guests("Daniel Faraday");
        bedroom = new Bedroom(245, 2, 2, "Double Bed");
    }

    @Test
    public void guestHasName(){
        assertEquals("Daniel Faraday", guest.getName());
    }

}

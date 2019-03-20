import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bookings booking;
    private Bedroom bedroom1;

    @Before
    public void setup(){
        booking = new Bookings(3);
        bedroom1 = new Bedroom(665, 2, 2, "King Suite");
    }

    @Test
    public void bedroomHasNights(){
        assertEquals(3, booking.countNights());
    }

}

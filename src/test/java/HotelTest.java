import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    public Hotel hotel;
    public Bedroom bedroom1;
    public Bedroom bedroom2;
    public Guests guest1;
    public ConferenceRoom conferenceRoom1;
    public Guests guest2;
    public DiningRoom diningRoom1;
    public Guests guest3;
    public Bookings booking;

    @Before
    public void setup(){
        hotel = new Hotel("CodeClan Towers");
        bedroom1 = new Bedroom(245, 2, 2, "Double Bed");
        bedroom2 = new Bedroom(310, 4,2, "2 Twins, 1 Double");
        guest1 = new Guests("Edgar Haliwax");
        conferenceRoom1 = new ConferenceRoom(6,3,"Conference Room 5");
        guest3 = new Guests("Marvin Candle");
        diningRoom1 = new DiningRoom(20, 8, "Baldur's Room");
        booking = new Bookings(5);
    }

    @Test
    public void hotelHasName(){
        assertEquals("CodeClan Towers", hotel.getHotelName());
    }

//    @Test
//    public void guestCanBookRoom(){
//        assertEquals(3, bedroom1.bookRoom());
//    }

    @Test
    public void canCheckGuestIn(){
        hotel.checkIn(guest1, bedroom1);
        hotel.checkIn(guest2, conferenceRoom1);
        hotel.checkIn(guest3, diningRoom1);
        assertEquals(1, bedroom1.guestCount());
        assertEquals(1, conferenceRoom1.guestCount());
        assertEquals(1, diningRoom1.guestCount());
    }

    @Test
    public void canCheckGuestOut(){
        hotel.checkOut(guest1, bedroom1);
        hotel.checkOut(guest2, conferenceRoom1);
        hotel.checkOut(guest3, diningRoom1);
        assertEquals(0, bedroom1.guestCount());
        assertEquals(0, conferenceRoom1.guestCount());
        assertEquals(0, diningRoom1.guestCount());
    }

}

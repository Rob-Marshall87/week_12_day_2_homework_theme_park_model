package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Whippy", "Mr. Whipp", 3, 57);
    }

    @Test
    public void hasName(){
        assertEquals("Whippy", iceCreamStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Mr. Whipp", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, iceCreamStall.getParkingSpot());
    }

}

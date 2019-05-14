package stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("SweetTooth", "Willy Wonka", 6, 23);
    }

    @Test
    public void hasName(){
        assertEquals("SweetTooth", candyFlossStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Willy Wonka", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(6, candyFlossStall.getParkingSpot());
    }
}

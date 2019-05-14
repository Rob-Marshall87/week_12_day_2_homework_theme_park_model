package attraction;

import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoastTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Roller Coaster", 78);
        visitor1 = new Visitor(11, 1.37, 1000000);
        visitor2 = new Visitor(13, 1.22, 37.44);
        visitor3 = new Visitor(10, 1.67, 58.32);
        visitor4 = new Visitor(15, 1.84, 88.88);
    }

    @Test
    public void hasName(){
        assertEquals("Roller Coaster", rollercoaster.getName());
    }

    @Test
    public void notOldOrTallEnoughToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void notTallEnoughToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void notOldEnoughToRide(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void isAllowedToRide(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor4));
    }


}

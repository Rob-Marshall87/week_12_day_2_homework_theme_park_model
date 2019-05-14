package stalls;

import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

        TobaccoStall tobaccoStall;
        Visitor visitor;
        Visitor visitor2;

        @Before
        public void before() {
            tobaccoStall = new TobaccoStall("Smoke on the Water", "Yosemite Sam", 7, 69);
            visitor = new Visitor(18, 0.32, 57.83);
            visitor2 = new Visitor( 17, 1.65, 37.21);
        }

        @Test
        public void hasName(){
            assertEquals("Smoke on the Water", tobaccoStall.getName());
        }

         @Test
        public void hasOwner(){
            assertEquals("Yosemite Sam", tobaccoStall.getOwnerName());
        }

        @Test
        public void hasParkingSpot(){
            assertEquals(7, tobaccoStall.getParkingSpot());
        }

        @Test
        public void canBuySmokeSticks(){
            assertEquals(true, tobaccoStall.isAllowedTo(visitor));
        }

        @Test
        public void canNotBuySticksOfDoom(){
            assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
        }

}

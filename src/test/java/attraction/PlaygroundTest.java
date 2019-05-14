package attraction;

import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("playground", 57);
        visitor = new Visitor(15, 2.34, 10000.00);
        visitor2 = new Visitor(16, 1.21, 0.37);
    }

    @Test
    public void hasName(){
        assertEquals("playground", playground.getName());
    }

    @Test
    public void checkAgeAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void checkAgeNotAllowed(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }

}

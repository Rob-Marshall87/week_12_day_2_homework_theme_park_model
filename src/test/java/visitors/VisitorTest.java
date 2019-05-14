package visitors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(28, 1.87, 55.00);
    }

    @Test
    public void checkHasAge(){
        assertEquals(28, visitor.getAge());
    }

    @Test
    public void checkHasHeight(){
        assertEquals(1.87, visitor.getHeight(), 0.01);
    }

    @Test
    public void checkHasMoney(){
        assertEquals(55.00, visitor.getMoney(), 0.01);
    }

}

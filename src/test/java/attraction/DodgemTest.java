package attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("dodgem", 78);
    }

    @Test
    public void hasName(){
        assertEquals("dodgem", dodgem.getName());
    }


}

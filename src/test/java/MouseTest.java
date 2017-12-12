import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse testMouse;

    @Before
    public void before(){
        testMouse = new Mouse("Cool Mouse", 4);
    }

    @Test
    public void canClick(){
        assertEquals("I clicked!", testMouse.click());
    }



}

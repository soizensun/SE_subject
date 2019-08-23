package th.ku.emailtemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void testArea(){
        Rectangle r1 = new Rectangle(4, 5);
        int area = r1.area();

        assertEquals(20, area);
    }



}

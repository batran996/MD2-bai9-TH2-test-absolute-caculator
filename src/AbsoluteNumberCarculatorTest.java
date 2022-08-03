import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCarculatorTest {
    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;
        ////goi ham so sanh ben class atsolute
        int result = AbsoluteNumberCaculator.findAsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;
        ////goi ham so sanh ben class atsolute
        int result = AbsoluteNumberCaculator.findAsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute11() {
        int number = -1;
        int expected = -1;
        ////goi ham so sanh ben class atsolute
        int result = AbsoluteNumberCaculator.findAsolute(number);
        assertEquals(expected,result);
    }
}

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class DollarTest {
    @Test
    public void testMultiplicationFiveTimesTwo() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    public void testMultiplicationTenTimesThree() {
        Dollar five = new Dollar(10);
        five.times(3);
        assertEquals(30, five.amount);
    }

}

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class DollarTest {
    @Test
    public void testMultiplicationFiveTimesTwo() {
        Dollar five = new Dollar(5);
        Dollar ten = five.times(2);
        assertEquals(10, ten.amount);
    }

    @Test
    public void testMultiplicationTenTimesThree() {
        Dollar ten = new Dollar(10);
        Dollar thirty = ten.times(3);
        assertEquals(30, thirty.amount);
    }

    @Test
    public void testEquality() {
        assertThat(new Dollar(5), is(new Dollar(5)));
        assertThat(new Dollar(5), is(not(new Dollar(6))));
    }


}
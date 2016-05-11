import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

        Money ten = Money.dollar(10);
        assertEquals(Money.dollar(30), ten.times(3));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5), is(Money.dollar(5)));
        assertThat(Money.dollar(5), is(not(Money.dollar(6))));
        assertThat(Money.dollar(5), is(not(Money.franc(5))));
    }

}
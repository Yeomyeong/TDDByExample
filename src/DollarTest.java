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
    public void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));

        Dollar ten = Money.dollar(10);
        assertEquals(Money.dollar(30), ten.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));

        Money ten = Money.franc(10);
        assertEquals(Money.franc(30), ten.times(3));
    }

    @Test
    public void testEquality() {
        assertThat(Money.dollar(5), is(Money.dollar(5)));
        assertThat(Money.dollar(5), is(not(Money.dollar(6))));
        assertThat(new Franc(5), is(new Franc(5)));
        assertThat(new Franc(5), is(not(new Franc(6))));
        assertThat(Money.dollar(5), is(not(new Franc(5))));
    }


}
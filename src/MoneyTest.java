import org.junit.Test;

import static org.junit.Assert.*;

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
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5); //5
        Expression sum = five.plus(five); //4
        Bank bank = new Bank(); //3
        Money reduced = bank.reduce(sum, "USD"); //2

        assertEquals(Money.dollar(10), reduced); //1
    }

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum= new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }


}
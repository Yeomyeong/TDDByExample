/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
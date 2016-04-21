/**
 * Created by aymonwoo on 2016. 4. 19..
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        return this.amount == ((Dollar)object).amount;
    }
}
/**
 * Created by aymonwoo on 2016. 5. 12..
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression expression);

    Expression times(int multiplier);
}

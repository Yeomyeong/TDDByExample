/**
 * Created by wymstar on 4/27/16.
 */
public class Money implements Expression {
  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Expression times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(currency, to);
    return new Money(amount/rate, to);

  }

  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return this.amount == money.amount
            && this.currency.equals(money.currency());
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

}

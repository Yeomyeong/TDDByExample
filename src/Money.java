/**
 * Created by wymstar on 4/27/16.
 */
public abstract class Money {
  protected int amount;

  static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  public static Franc franc(int amount) {
    return new Franc(amount);
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return this.amount == money.amount
            && this.getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier) ;
}

package prob5;

public class Money {
	private int amount;
	Money m;

	public Money() {

	}

	public Money(int amout) {
		this.amount = amout;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		m = new Money(amount + money.getAmount());
		return m;
	}

	public Money minus(Money money) {
		m = new Money(amount - money.getAmount());
		return m;
	}

	public Money multiply(Money money) {

		m = new Money(amount * money.getAmount());
		return m;
	}

	public Money devide(Money money) {
		m = new Money(amount / money.getAmount());
		return m;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (obj.getClass() == this.getClass()) {
			Money mo = (Money) obj;
			if (mo.getAmount() == this.getAmount()) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}
}

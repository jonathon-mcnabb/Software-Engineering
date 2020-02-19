import java.math.BigDecimal;
import java.text.NumberFormat;

public class BankAccount {

	 BigDecimal balance;

	public BankAccount(BigDecimal balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(BigDecimal withdrawAmount) throws NegativeBalanceException {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		if(withdrawAmount.compareTo(balance) > 0) {
			throw new NegativeBalanceException("Withdrawal amount: " + formatter.format(withdrawAmount) + " is greater than balance");
		} else {
			this.balance = this.balance.subtract(withdrawAmount);
		}
	}
	
	public void quickWithdraw(BigDecimal withdrawAmount) throws NegativeBalanceException {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		this.balance = this.balance.subtract(withdrawAmount);
		
		if(withdrawAmount.compareTo(balance) > 0) {
			throw new NegativeBalanceException("Withdrawal amount: " + formatter.format(withdrawAmount) + " is greater than balance");
		}
		
	}
	
}

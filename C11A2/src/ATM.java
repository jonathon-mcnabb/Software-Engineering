import java.math.BigDecimal;

public class ATM {
	
	BankAccount myAccount;

	public ATM() {
		super();
		this.myAccount = new BankAccount(new BigDecimal(500));
	}
	
	public void handleTransactions() {
		try {
			this.myAccount.withdraw(new BigDecimal(600));
		} catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		
		try {
			this.myAccount.quickWithdraw(new BigDecimal(600));
		} catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
	
	 public static void main(String[] args) {
		 ATM myATM = new ATM();
		 
		 myATM.handleTransactions();
	 }
}

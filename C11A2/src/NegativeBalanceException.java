
public class NegativeBalanceException extends Exception { 
	
	public NegativeBalanceException() {
		 super("Negative balance exception");
	}
	
    public NegativeBalanceException(String errorMessage) {
        super(errorMessage);
    }
}

package Ques2a;

public class InsufficientBalanceException extends Exception{
	
	double amount;
	public InsufficientBalanceException(double amount) {
		this.amount=amount;
	}
	
	public double  getAmount() {
		
		return amount;
	}

}

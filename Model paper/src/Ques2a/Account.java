package Ques2a;

import java.util.Scanner;

public class Account {

	double balance=0;
	int Account_No;
	double amount;
	boolean con=true;
	
	public Account(int Account_No) {
		this.Account_No=Account_No;
	
	}
	
	public void deposit(double d) {
		balance=balance+d;
		amount=balance;
	}

	public void withdraw() throws InsufficientBalanceException {
		while(con) {
		try {
		do {	
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter amount to be withdraw = ");
		double w=sc.nextDouble();

		System.out.println("Withdrawing Rs "+w);
		
		if(w<amount) {		
			amount=amount-w;
			System.out.println("Existing amount= "+amount);
		}
		
		else {
			throw new InsufficientBalanceException(amount);
		}
		}while(amount>0);
		
		
		}catch(InsufficientBalanceException e) {
			
		System.out.println("Sorry your account remains only Rs."+e.getAmount());
		e.printStackTrace();
		
		}finally {
			
		Scanner sc1= new Scanner(System.in);
		System.out.println("Do you wish to continue?");
		String res= sc1.next();
		
		if(res.equals("no")         /*equalsIgnoreCase("no")*/) {
			con=false;
		}
		}
	}
	}
}



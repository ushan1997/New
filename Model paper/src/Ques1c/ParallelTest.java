package Ques1c;

public class ParallelTest extends Thread{
	
public static void main(String args[]) throws InterruptedException {
	

	Calculation Calculation=new Calculation();
	
	
	NewThread t1 =new  NewThread(Calculation,1,50000,"thread1");//child thread1
	t1.join();
	int x=Calculation.getTotal();
	
	
	NewThread t2 =new  NewThread(Calculation,50001,100000,"thread2");//child thread2
	t2.join();
	int y=Calculation.getTotal();
	int total=x+y;
	System.out.println("Total="+total);
}	
}

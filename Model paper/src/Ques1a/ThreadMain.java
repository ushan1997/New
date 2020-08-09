package Ques1a;

public class ThreadMain extends Thread{

	public static void main(String args[]) {
		
		SLIITThread sliit = new SLIITThread();
		PrintThread print = new PrintThread();
		sliit.start();
		print.start();
	}
}

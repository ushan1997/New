package Ques1b;

public class ThreadBase extends Thread{

	public static void main(String args[]) throws InterruptedException {
		
		ThreadBase main = new ThreadBase();
	

		NumbersThread Red=new NumbersThread("Red");//assign names to child threads
		NumbersThread blue=new NumbersThread("blue");
		NumbersThread Green=new NumbersThread("Green");
		Red.start();
		blue.start();
		Green.start();
		

		
		for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+"SLIIT");
	
	
}
		Red.join();
		blue.join();
		Green.join();
		System.out.println(main.isAlive());
		System.out.println(main.getState());
}
}
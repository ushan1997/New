package Ques1b;

public class NumbersThread extends Thread{

public NumbersThread(String name) {
		super(name);//assign name in Thread class 
	}



public void run() {
		
		for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+i+1);
		}
	
	}
	
}

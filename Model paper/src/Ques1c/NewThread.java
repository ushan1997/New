package Ques1c;

public class NewThread extends Thread{

	
	Calculation Cal;
	int start;
	int end;
	
	public NewThread(Calculation Cal,int start,int end,String name) {
		super(name);
		this.Cal=Cal;
		this.start=start;
		this.end=end;
		start();
	}
	public void run() {
		Cal.sum(start,end);
		System.out.println("Strtrd to execute "+Thread.currentThread().getName());
	}
	
}

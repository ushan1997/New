package Ques03;

public class MyOwnAutoShop {

	public static void main(String[] args) {
	
		Truck Truck=new Truck(0,"", (float) 1000.00,100000);
		System.out.println(Truck.getSalePrice());
		
		Bus Bus=new Bus(0, null, 1997, (float) 3.1, 100000);
		System.out.println(Bus.getSalePrice());
	}

}

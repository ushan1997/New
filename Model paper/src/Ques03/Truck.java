package Ques03;

public class Truck extends Vehicle{
	float Weight;
	double price=0;
	
	public Truck(float speed, String colour,float Weight,float RegularPrice) {
		super(speed, colour);
		this.Weight= Weight;
		price=RegularPrice;
	}

	public double getSalePrice() {
		if(Weight>2000) {
			
		price=price+(price*0.1);
		
		}else {
		price=price+(price*0.2);	
			
		}
		return price;
	
}

	@Override
	public float getRegularPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

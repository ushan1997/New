package Ques03;

public class Bus extends Vehicle{

	int Year;
	float manufacturerDiscount;
	double price;
	
	public Bus(float speed, String colour,int Year,float manufacturerDiscount,float RegularPrice) {
		super(speed, colour);
		this.Year=Year;
		this.manufacturerDiscount=manufacturerDiscount;
		price=RegularPrice;
	}

	@Override
	public double getSalePrice() {
		
			price=price-price*manufacturerDiscount/100;
			return price;
	}

	@Override
	public float getRegularPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

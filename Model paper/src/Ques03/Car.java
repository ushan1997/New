package Ques03;

public class Car extends Vehicle{

	float RegularPrice;
	public Car(float speed, String colour,float RegularPrice) {
		super(speed, colour);
		// TODO Auto-generated constructor stub
	}

	public float getRegularPrice() {
		return RegularPrice;
	}

	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}

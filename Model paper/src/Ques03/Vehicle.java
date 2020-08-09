package Ques03;

abstract public class Vehicle {


	float speed;
	float regularPrice;
	String colour;
	
	public Vehicle(float speed,  String colour) {
		super();
		this.speed = speed;	
		this.colour = colour;
	}
	public abstract double getSalePrice();
	public abstract float getRegularPrice();
}

package Vehicle;

public class Vehicle {
	
	//declare variables or objects for Vehicle class
	private String type, name, color;
	private int speed;
	private int price;
	
	//create constructor for Vehicle
	public Vehicle(String type, String name, String color, int speed, int price) {
		this.type = type;//setting the parameters for color
		this.name = name;//setting the parameters for color
		this.color = color;//setting the parameters for color
		this.speed = speed; //setting the parameters for speed
		this.price = price;//setting the parameters for price
	}
	// created method for stop
	void stop(){
		System.out.println("The Vehicle has stopped");
	}
	//create getter method to access the value of private instance variables from outside the class
	String getType() {
		return type; // return the value of color
	}
	String getName() {
		return name; // return the value of color
	}
	String getColor() {
		return color; // return the value of color
	}
	
	int getSpeed() {
		return speed;// return the value of speed
	}
				
	int getPrice() {
		return price; // return the value of price
	}
}



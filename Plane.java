package Vehicle;

public class Plane extends Vehicle{
	
	private String wingSpan;
	
	public Plane(String type, String name, String color, int speed, int price, String wingSpan) {
		super(type, name, color, speed, price);
		this.wingSpan = wingSpan;
	}
	String wingSpan() { //create getter method for tireType
		return wingSpan; // return the value of tireType
	}
	void fly() { // Create a method to simulate driving the Toyota_Vios.
		System.out.println("I am piloting the U-2 Spy Plane"); //Indicate that user is driving the Toyota Vios
	}
	
	@Override //Indicates that this methods override a method in superclass Vehicle
	void stop() { //create a method to simulate stopping the Toyota_Vios.
		System.out.println("I stop piloting the U-2 Spy Plane"); //Indicate that user has stopped driving the Toyota Vios
		
	}
}

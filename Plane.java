package Vehicle;

//Create subclass Plane, inherit all the accessible methods and variables of the Vehicle class
public class Plane extends Vehicle{
	
	private String wingSpan;//declare variables or objects for U2-SpyPlane
	
	public Plane(String type, String name, String color, int speed, int price, String wingSpan) {
		super(type, name, color, speed, price);// Call the constructor of the superclass Vehicle
		this.wingSpan = wingSpan;//this a setter method for wingSpan
	}
	String wingSpan() { //create getter method for wingSpan
		return wingSpan; // return the value of wingSpan
	}
	void fly() { // Create a method to simulate flying the U2-SpyPlane.
		System.out.println("I am piloting the U-2 Spy Plane"); //Indicate that pilot is flying the U2-SpyPLane.
	}
	
	@Override //Indicates that this methods override a method in superclass Vehicle
	void stop() { //create a method to simulate stopping the U2-SpyPlane.
		System.out.println("I stop piloting the U-2 Spy Plane"); //Indicate that the pilot has stopped flying the U2-SpyPlane
		
	}
}

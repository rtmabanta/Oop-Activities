package Vehicle;

//Create subclass Toyota_Vios, inherit all the accessible methods and variables of the Vehicle class
public class Car extends Vehicle{ 
	
	private String tireType; //declare variables or objects for Toyota_Vios class
	
	public Car(String type, String name, String color, int speed, int price, String tireType) { //Create constructor for Toyota_Vios
		super(type, name, color, speed, price); // Call the constructor of the superclass Vehicle
		this.tireType = tireType; //this is a setter method for tireType
	}
	
	String getTireType() { //create getter method for tireType
		return tireType; // return the value of tireType
	}
	void drive() { // Create a method to simulate driving the Toyota_Vios.
		System.out.println("I am driving the Toyota Vios"); //Indicate that user is driving the Toyota Vios
	}
	
	@Override //Indicates that this methods override a method in superclass Vehicle
	void stop() { //create a method to simulate stopping the Toyota_Vios.
		System.out.println("I stop driving the Toyota Vios"); //Indicate that user has stopped driving the Toyota Vios
	}
}

package Vehicle;

//Create subclass Boat, inherit all the accessible methods and variables of the Vehicle class
public class Boat extends Vehicle{
	
	private String mainSail_color;//declare variables or objects for Fandango Yacht
	
	
	public Boat(String type, String name, String color, int speed, int price, String mainSail_color) {
		super(type, name, color, speed, price);// Call the constructor of the superclass Vehicle
		this.mainSail_color = mainSail_color; //this a setter method for wingSpan
		
	}
	String mainSail_color() { //create getter method for mainSail_color
		return mainSail_color; // return the value of mainSail_color	
	}
	void floats() { // Create a method to simulate floating of the Fandango Yacht.
		System.out.println("The Fandango Yacht is floating in Manila Bay"); //Indicate that boat is floating in Manila Bay
	}
	
	@Override //Indicates that this methods override a method in superclass Vehicle
	void stop( ) { //create a method to simulate stopping the Fandango Yacht.
		System.out.println("The Fandango Yacht is sinking in Manila Bay"); //Indicate that the boat is sinking in Manila Bay
	}

}


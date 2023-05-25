package Vehicle;

public class Boat extends Vehicle{
	
	private String mainSail_color;
	
	public Boat(String type, String name, String color, int speed, int price, String mainSail_color) {
		super(type, name, color, speed, price);
		this.mainSail_color = mainSail_color; 
		
	}
	String mainSail_color() {
		return mainSail_color;		
	}
	void floats() {
		System.out.println("The Fandango Yacht is floating in Manila Bay");
	}
	
	void stop( ) {
		System.out.println("The Fandango Yacht is sinking in Manila Bay");
	}

}

package Vehicle;

public class MainVehicle {

	public static void main(String[] args) {
		//Create a new object named Vios with specified parameters	
		Car vios = new Car("Car", "Toyota_Vios", "Red", 100, 750000, "All Terrain"); 
		Plane plane = new Plane("Plane", "U2-Spy Plane", "White", 800, 50000000, "10 Meters");
		Boat boat = new Boat("Boat", "Fandango Yacht", "Blue", 15, 100000000, "Violet");
			
		//Print all of the plane object by calling the getter of each method
		System.out.println("Type: " + vios.getType() + "\nName: " + vios.getName() + "\nColor: " + vios.getColor() + "\nSpeed: " + vios.getSpeed() + "\nPrice: " + vios.getPrice() + "\nTire Type: " + vios.getTireType());
		vios.drive(); //We call the drive method of the Vios object
		vios.stop();  //We call the stop method of the Vios object
		System.out.println();
		
		System.out.println("Type: " + plane.getType() + "\nName: " + plane.getName() + "\nColor: " + plane.getColor() + "\nSpeed: " + plane.getSpeed() + "\nPrice: " + plane.getPrice() + "\nWing Span: " + plane.wingSpan());
		plane.fly(); //We call the fly method of the plane object
		plane.stop();  //We call the stop method of the plane object
		System.out.println();
		
		System.out.println("Type: " + boat.getType() + "\nName: " + boat.getName() + "\nColor: " + boat.getColor() + "\nSpeed: " + boat.getSpeed() + "\nPrice: " + boat.getPrice() + "\nMainSail Color: " + boat.mainSail_color());
		boat.floats(); //We call the floats method of the boat object
		boat.stop();  //We call the stop method of the boat object

	}
}

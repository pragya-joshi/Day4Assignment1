package day4;

public class Car extends Vehicle{
	private int noOfSeats;

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public Car(String color, String model, int wheelCount, int noOfSeats) {
		super(color, model, wheelCount);
		this.noOfSeats = noOfSeats;
	}
	
	public void displayDetails() {
		System.out.println("Car Details : "+getColor()+" "+getModel()+" "+getWheelCount()+" and noOfSeats is "+noOfSeats);
		
	}
}

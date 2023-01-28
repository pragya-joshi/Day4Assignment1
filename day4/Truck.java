package day4;

public class Truck extends Vehicle{
	private int capacity;

	public Truck(String color, String model, int wheelCount, int capacity) {
		super(color, model, wheelCount);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void displayDetails() {
		System.out.println("Truck Details : "+getColor()+" "+getModel()+" "+getWheelCount()+" and capacity is"+capacity);
		
	}
	
}

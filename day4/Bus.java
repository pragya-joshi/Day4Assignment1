package day4;

public class Bus extends Vehicle{
	private int fare;

	public Bus(String color, String model, int wheelCount, int fare) {
		super(color, model, wheelCount);
		this.fare = fare;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	
	public void displayDetails() {
		System.out.println("Bus Details : "+getColor()+" "+getModel()+" "+getWheelCount()+" and fare is "+fare);
		
	}
}

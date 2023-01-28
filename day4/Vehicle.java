package day4;

public class Vehicle {
	private String color,model;
	private int wheelCount;
	public Vehicle(String color, String model, int wheelCount) {
		this.color = color;
		this.model = model;
		this.wheelCount = wheelCount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWheelCount() {
		return wheelCount;
	}
	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	
}

package material;

import stock.Inventory;

public class Laptops extends Inventory{
	private int uniqueId;
	private String model;
	static int quantity=0;
	public Laptops(int lowOrderQuantity) {
		super(lowOrderQuantity);
	}
	public Laptops(int quantity, int lowOrderQuantity, int uniqueId, String model) {
		super(quantity, lowOrderQuantity);
		this.uniqueId = uniqueId;
		this.model = model;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}

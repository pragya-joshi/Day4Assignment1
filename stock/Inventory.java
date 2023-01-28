package stock;

public class Inventory {
	private int lowOrderQuantity,quantity;

	public Inventory() {
		
	}
	public Inventory(int lowOrderQuantity) {
		super();
		this.lowOrderQuantity = lowOrderQuantity;
	}
	public Inventory(int quantity, int lowOrderQuantity) {
		this.lowOrderQuantity = lowOrderQuantity;
	}


	public int getLowOrderQuantity() {
		return lowOrderQuantity;
	}

	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setLowOrderQuantity(int lowOrderQuantity) {
		this.lowOrderQuantity = lowOrderQuantity;
	}
	
	
	
	
}

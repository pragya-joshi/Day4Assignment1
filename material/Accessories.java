package material;

import stock.Inventory;

public class Accessories extends Inventory{
	private int uniqueId;
	static int quantity=0;

	public Accessories() {
		
	}
	public Accessories(int lowOrderQuantity) {
		super(lowOrderQuantity);
	}
	public Accessories(int quantity, int lowOrderQuantity, int uniqueId) {
		super(quantity, lowOrderQuantity);
		this.uniqueId = uniqueId;
	}

	
	
}

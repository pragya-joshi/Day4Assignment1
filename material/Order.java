package material;

import java.util.*;

public class Order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			new Laptops(5);
			Laptops.quantity++;
		}
		for(int i=0;i<10;i++) {
			new Accessories(10);
			Accessories.quantity++;
		}
		Scanner in=new Scanner(System.in);
		System.out.println("Enter order quantity for laptop");
		int orderLap=in.nextInt();
		if(orderLap>5) {
			requestForMaterial();
		}else {
			generateInvoice();
		}
		
		System.out.println("Enter order quantity for accessories");
		int orderAcc=in.nextInt();
		if(orderLap>10) {
			requestForMaterial();
		}else {
			generateInvoice();
		}
	}
	public static void generateInvoice() {
		System.out.println("Invoice generated");
	}
	public static void requestForMaterial() {
		System.out.println("Request For Material");
	}

}

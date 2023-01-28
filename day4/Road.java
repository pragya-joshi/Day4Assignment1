package day4;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Black","Audi",4,4);
		Truck t=new Truck("Orange","TATA",6,2400);
		Bus b=new Bus("Blue","Double Decker",4,500);
		
		c.displayDetails();
		b.displayDetails();
		t.displayDetails();
		
	}

}

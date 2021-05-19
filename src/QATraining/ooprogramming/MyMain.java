package qatraining.ooprogramming;

public class MyMain {
	
public static void main(String[] args) {
		
		Computer computer1 = new Computer ();
		
		computer1.setName("Lenovo");
		computer1.setYear("2019");
		computer1.setCost(749);
		
		System.out.println("Computer: " + computer1.getName());
		System.out.println("Age: " + computer1.getYear());
		System.out.println("Cost: " + computer1.getCost());
	}
}


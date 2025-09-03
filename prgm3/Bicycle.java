package transport;

public class Bicycle extends Vehicle {

	public Bicycle(String id) {
		super(id);
		System.out.println("Bicycle() constructor called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deliver(String item, String place) {
		System.out.println("delivering"+"item"+"to"+place+"by Bicycle:");
		// TODO Auto-generated method stub

	}

}


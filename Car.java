package Week1.day1;

public class Car {
	public void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("Car started successfully");
	}
	private void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Applied Brake successfully");
	}
	private void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Horn is applied");
	}
	private void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("Car got Punctured");
	}
	public static void main(String[] args) {
		Car C1 = new Car();
		C1.driveCar();
		C1.applyBrake();
		C1.soundHorn();
		C1.isPuncture();
	}

}

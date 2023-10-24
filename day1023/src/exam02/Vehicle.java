package exam02;

public abstract class Vehicle {
	protected int speed;
	public abstract double getKilosPerLiter();
	
	public void printSpeed() {
		System.out.println("현재속도 : "+speed);
	}
}

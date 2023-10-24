package exam02;

public class Car extends Vehicle implements Movable {
	private String name;
	private String color;
	
	public void turnLeft() {
		System.out.println("좌회전 합니다.");
	}
	public void turnRight() {		
		System.out.println("우회전 합니다.");
	}
	
	@Override
	public void speedUp(int amount) {
		System.out.printf("속도를 %d만큼 올립니다.\n",amount);
		speed += amount;
	}

	@Override
	public void speedDown(int amount) {
		System.out.printf("속도를 %d만큼 내립니다.\n",amount);
		speed -= amount;
	}

	@Override
	public void printSpeed(int amount) {
		System.out.printf("현재속도는 %d 입니다.\n",amount);
	}

	@Override
	public double getKilosPerLiter() {
		return 5;
	}
	
	public final String getName() {return name;}
	public final void setName(String name) {this.name = name;}
	public final String getColor() {return color;}
	public final void setColor(String color) {this.color = color;}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car() {}

	
	
}

package exam01;

public class Car implements Movable{
	private String name;
	private String color;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public final String getName() {return name;}
	public final void setName(String name) {this.name = name;}
	public final String getColor() {return color;}
	public final void setColor(String color) {this.color = color;}
	
	public void turnLeft() {System.out.println("좌회전 합니다.");}
	public void turnRight() {System.out.println("우회전 합니다.");}

	public void speedUp(int amount) {
		System.out.printf("속도를 %d로 올립니다.\n",amount);
	}

	public void speedDown(int amount) {
		System.out.printf("속도를 %d로 내립니다.\n",amount);
	}

}

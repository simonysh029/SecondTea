package exam01;

public class CarTest {
	public static void main(String[] args) {
//		Car myCar = new Car("아반테","흰색");
//		myCar.speedUp(100);
//		myCar.speedDown(50);
		
		Movable m = new Car();
		m.speedUp(100);
		m.speedUp(50);
		((Car)m).turnLeft();
	}
	
}

package exam07;

interface Shape{
	public void draw();
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}
class Triangle implements Shape{
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}
class Circlr implements Shape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		Shape a = new Triangle();
		Shape b = new Circlr();
		Shape c = new Rectangle();
		a.draw(); //a가 메세지를 받았다고 한다.
		b.draw();
		c.draw();
		
	}
}

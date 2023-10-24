package exam04;

class A {
	public void pro() {
		System.out.println("A의 pro입니다.");
	}
	public void hello() {		
		System.out.println("hello!");
	}
	 
}

class B extends A {
	public void pro() {
		System.out.println("B의 pro입니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		A ob = new B();
		ob.pro();
		ob.hello();
		
	}

}

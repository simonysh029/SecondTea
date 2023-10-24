package exam01;

class MyUtil {
	
	public void pro(String data) {
		System.out.println("처리된 데이터는 "+data+"입니다.");
	}
}

public class ValueOfTest02 {
	public static void main(String[] args) {
		boolean a = true;
		double b = 56.7;

		//a의 값을 pro메소드에게 전달
		//b의 값을 pro메소드에게 전달
		
		MyUtil mu = new MyUtil();
		mu.pro(String.valueOf(a));
		mu.pro(String.valueOf(b));
		
		mu.pro(b+"");
		//바로 스트링으로 바꾸는거
	}
}

package exam08;

public class StringTest03 {

	public static void main(String[] args) {
		String data = new String("홍길동");
		byte []arr = data.getBytes();
		// String을 byte의 배열로 변환할 수 있다.
		// 파일입출력하거나 혹은 네트워크 통신으로
		// 데이터를 전달 할 때에는 byte형으로 변환 후 전달한다.
		for(byte i:arr) {
			System.out.print(i+" ");
		}
		String data2 = new String(arr);
		System.out.println("\n"+data2);
	}

}

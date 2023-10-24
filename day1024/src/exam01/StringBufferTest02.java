package exam01;

public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("친구를 사랑했네");
		System.out.println(sb);
		sb.insert(0, "친구의");	//insert는 원하는 위치에 추가
		System.out.println(sb);
	}
}
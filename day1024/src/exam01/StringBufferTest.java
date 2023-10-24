package exam01;

public class StringBufferTest {
	public static void main(String[] args) {
		String data = "오늘 ";
		data += "점심은 ";
		data += "고기를 ";
		data += "먹어요! ";		//변경할때마다 가비지 생성됨
		System.out.println(data);
		
		StringBuffer sb = new StringBuffer("오늘 ");
		sb.append("점심은 ");
		sb.append("고기를 ");
		sb.append("먹어요! ");
		System.out.println(sb);
	}
}

package exam08;

public class StringTest02 {

	public static void main(String[] args) {
		char []data = {'h','e','l','l','o','k','o','r','e','a'};
		
		String str = new String(data,0,5);	//0부터 5번 더 간 곳 까지
		System.out.println(str);
		str = new String(data,5,5);			//5부터 5번 더 간 곳 까지
		System.out.println(str);
	}

}

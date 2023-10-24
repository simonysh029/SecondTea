package exam01;

//split
public class SplitTest02 {
	public static void main(String[] args) {
		String data = "100 80 90 100 60 70 50 40 70 60";
		//위의 데이터의 총점과 평균을 구하여 출력해 봅니다.
		
		String []arr = data.split(" ");
		int sum=0;
		int avg=0;
		
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		avg = sum/arr.length;
		
		//for Each 사용 시
//		for(String v : arr) {
//			sum += Integer.parseInt(v);
//		}
//		avg = sum / arr.length;
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
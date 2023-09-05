package example;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//js14.html 에서 사용한 data.json을 제작하여 활용하는 형태
/*
 * json1.java에서 원시 배열값을 json으로 변환 후 Front가 해당 데이터를 ajax로 로드하여 웹 페이지에 출력하는 형태
 */
public class json1 {

	public static void main(String[] args) throws Exception {
		JSONObject jo = new JSONObject();	//put만 사용 키만 생성
		JSONArray ja = new JSONArray();	//add만 사용, data를 생성
		String user[] = {"최현제","전정호","염무원"};	//숫자형태 json 숫자로 데이터가 생성
		int w = 0;
		while(w < user.length) {
			
			JSONObject jo2 = new JSONObject();	//키 생성시 반복문으로 작동하면 객체 및 인스턴스를 새롭게 생성하면서 적용해야 합니다.
			
			//ja.add(user[w]); //키가 없는 형태의 배열
			//ja.add("product"+w,user[w]);
			jo.put("product"+w,user[w]);	//("키이름",데이터값)
			//ja.add(jo);
			ja.add(jo2);	//[] 배열화 적용
			w++;
			
		}
		jo.put("member", ja);	//다룰 파일 관련, 대표키를 생성하는 형태
		//System.out.println(jo);
		FileWriter fw = new FileWriter("E:\\project2\\MW\\example\\src\\main\\webapp\\member.json",true);	//다룰 파일 경로
		
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(jo.toString());	//배열형태를 문자열로 변환 후 저장
		//bw.write("ajax_data("jo.toString()+")");	//CORS를 해결하기 위함 함수 호출로 적용하는 형태, 프론트에선 ajax로 받아선 안된다, 바로 호출해야함
		
		bw.flush();
		bw.close();
		fw.close();
	}

}

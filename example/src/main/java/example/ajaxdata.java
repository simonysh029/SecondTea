package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


@WebServlet("/ajaxdata.do")
public class ajaxdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    PrintWriter pw = null;   
	
    public ajaxdata() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		String key = request.getParameter("key").intern();
		
		try {
			
		
		this.pw = response.getWriter();
		if(key == null || key == "") {
			this.pw.write("error");
			}
		
		else if (key=="a123456") {
			//this.pw.write("success");
			//대표키 : user_list
			//이름 : user_name
			//성격 : analyze
			String user[][] = {
					{"김승균","박병준","이경선","장진호","최현제"},
					{"INFP","ENIP","EJNP","INTP","ENJP"}
			};
			JSONObject jo = new JSONObject();
			JSONArray ja = new JSONArray();
			
			
			}			
		}
		catch(NullPointerException n) {
			this.pw.write("error");
		}
		catch(Exception e) {
			
		}
		
	}

}

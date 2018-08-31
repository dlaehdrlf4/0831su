package second;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		System.out.println("emali:" + email);
		System.out.println("pw:" + pw);
		System.out.println("name:" + name);
		System.out.println("gender:" + gender);
		
		//결과 페이지에 전송할 데이터를 저장
		/*
		request.setAttribute("message", "회원가입에 성공하셨습니다.");
		*/
		request.getSession().setAttribute("message","회원가입 성공");
		
		response.sendRedirect("output.jsp");
		
		//결과 페이지로 포워딩 -  새로고침하면 작업을 다시 수행 그래서 이걸로 하면 안된다.
		/*
		RequestDispatcher dis = request.getRequestDispatcher("output.jsp");
		dis.forward(request,response);
		*/
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

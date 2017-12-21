import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginForm", urlPatterns = { "/Serv5" })
public class Serv5 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter pw = response.getWriter();
		String strUname = request.getParameter("txtUserName");
		String strPwd = request.getParameter("pwdPwd");
		
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> SignIn Status</title>");
		pw.println("</head>");
		pw.println("<body style='text-align:center;margin-top:100;padding:0;background-color:#ecffb3;'>");
		
		if ((strUname.equals("Tiger")) && (strPwd.equals("Scott"))) {
			pw.println("<h3>");
			pw.println("Valid User");
			pw.println("<br>");
			response.getWriter().println("Login Success\r\n");
			pw.println("</h3>");
		} else {
			pw.println("<h3>");
			pw.println("Invalid User");
			pw.print("<br>");
			response.getWriter().println("Login UnSuccess\r\n");
			pw.println("</h3>");
		}
		
		pw.println("</body>");
		pw.println("</html>");
	}
}
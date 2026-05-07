package web.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.service.LoginService;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Login</title></head>");
        out.println("<body>");
        out.println("<h2>Login Form</h2>");
        out.println("<form action='/login' method='post'>");

        out.println("Username: <input type='text' id='username' name='username'><br><br>");
        out.println("Password: <input type='password' id='passwd' name='passwd'><br><br>");
        out.println("DOB: <input type='date' id='dob' name='dob'><br><br>");

        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("passwd");
        String dob = request.getParameter("dob");

        String loginStatus = "fail";

        if (LoginService.login(username, password, dob)) {
            loginStatus = "success";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>" + loginStatus + "</title></head>");
        out.println("<body>");
        out.println("<h2>Login status: " + loginStatus + "</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vanessamnoble on 1/31/17.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AuthenticationServlet", urlPatterns = {"/login", "/profile"})
public class AuthenticationServlet extends HttpServlet {
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") &&
                password.equalsIgnoreCase("password")) {
            PrintWriter writer = response.getWriter();
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Hi admin!</h1>");
            writer.println("<p>this is your profile!</p>");
            writer.println("</body>");
            writer.println("</html>");
        } else {
            response.sendRedirect("/login");
        }
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<form action='/profile' method='post'>");
        writer.println("<label>Username</label>");
        writer.println("<input type='text' name='username'>");
        writer.println("<label>Password</label>");
        writer.println("<input type='password' name='password'>");
        writer.println("<input type='submit' name='login' value='Login'>");
        writer.println("</form");
        writer.println("</body>");
        writer.println("</html>");
    }
}

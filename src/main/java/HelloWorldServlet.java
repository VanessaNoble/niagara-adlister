import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
        )throws IOException {

            response.setContentType("text/html"); //default

            PrintWriter writer = response.getWriter();

            String name = request.getParameter("name");

            if (name == null) {
                writer.println("<h1>Hello" + name + "</h1>");
            } else {
                writer.println("<h1>Hello World </h1>");
        }
    }
}

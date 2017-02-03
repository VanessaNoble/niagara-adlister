import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vanessamnoble on 2/1/17.
 */
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@WebServlet(name = "HelloServlet", urlPatterns = {"/hello-servlet"})
public class HelloServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        Student student = new Student();
        student.setName("Liz");
        //String name = "Liz";

        if (request.getParameter("name") != null) {
            //name = request.getParameter("name");
            student.setName(request.getParameter("name"));
        }
        List languages = Arrays.asList("Java", "Javascript");

        // Variables passed to the view
        student.setWeight(80);
        student.setAge(36);
        student.setLanguages(languages);
        request.setAttribute("student", student);

        request.getRequestDispatcher("hello-world.jsp").forward(request, response);
    }
}


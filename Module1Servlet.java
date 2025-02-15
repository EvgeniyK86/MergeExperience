package by.itacademy.git.mergeexperience;

import java.io.*;

import by.itacademy.git.mergeexperience.topics.Module1Topics;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/module1")
public class Module1Servlet extends HttpServlet {
    private String message;
    public void init() {
        message = "Модуль 1";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        out.println("<table>");
        for (Module1Topics value : Module1Topics.values())
            out.println("<tr><td>"
                    + value.getOrder() + "</td><td>"
                    + value.getTopic() + "</td><td>"
                    + value.getDesc()
                    + "</td><td><a href='not_implemented_yet.html'>Подробнее</a>"
                    + "</td></tr>");

        out.println("</table>");

        out.println("<br/><a href=\"index.jsp\"'/'>&#9664</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
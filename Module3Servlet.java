package by.itacademy.git.mergeexperience;


import by.itacademy.git.mergeexperience.topics.Module3Topics;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/module3")
public class Module3Servlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Модуль 3";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<table>");
        for (Module3Topics value : Module3Topics.values())
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
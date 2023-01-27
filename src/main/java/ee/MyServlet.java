package ee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyServlet", value = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        int number = Integer.parseInt(request.getParameter("number"));
        int numberMultipliedByTwo = number * 2;

        try {
            printWriter.println("<h3>Number: " + numberMultipliedByTwo + "</h3>");
        } finally {
            printWriter.close();
        }


    }
}

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }


package ee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", value = "/calculator")
public class Calculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        int num1 = Integer.parseInt(request.getParameter("number1"));
        int num2 = Integer.parseInt(request.getParameter("number2"));
        String[] actions = request.getParameterValues("action");
        String result = request.getParameter("result");


        try {
            printWriter.println("<p> Number : " + num1 + "</p>");
            printWriter.println("<p> Number : " + num2 + "</p>");
            for (String action : actions) {
                switch (action) {
                    case "+":
                        System.out.println(num1 + num2);

                        break;
                    case "-":
                        System.out.println(num1 - num2);

                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        System.out.println(num1 / num2);
                        break;
                    default:
                        System.out.println("Mistake");



                }printWriter.println("<p> Action: " + action + "</p>");



            }
            printWriter.println("<p> Result : " + result + "</p>");
        } finally {
            printWriter.close();
        }
    }
}

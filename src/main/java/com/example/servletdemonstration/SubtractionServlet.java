package com.example.servletdemonstration;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

//For this servlet, instead of using annotations, we are using the web.xml file to map it to the appropriate url.
// Check the web.xml file for more details.
public class SubtractionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1, num2;
        int subtraction;
        num1 = Integer.parseInt(request.getParameter("number1"));
        num2 = Integer.parseInt(request.getParameter("number2"));
        subtraction = num1 - num2;

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + subtraction + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

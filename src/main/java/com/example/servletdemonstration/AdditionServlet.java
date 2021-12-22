package com.example.servletdemonstration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdditionServlet", value = "/addition-servlet")
public class AdditionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1, num2;
        int sum;
        num1 = Integer.parseInt(request.getParameter("number1"));
        num2 = Integer.parseInt(request.getParameter("number2"));
        sum = num1 + num2;

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + sum + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

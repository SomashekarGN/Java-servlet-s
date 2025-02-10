package com.xworkz.webservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/apple",loadOnStartup = 1)
public class Apple extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        String appleType=req.getParameter("Atype");
        String grownIn=req.getParameter("GrownIn");
        String imp=req.getParameter("Imported");
        String col=req.getParameter("Colour");
        String ppk=req.getParameter("PricePerKg");

        resp.setContentType("text/html");

        PrintWriter printWriter=resp.getWriter();
        printWriter.println("<html><body>");
        printWriter.println("<h1>Welcome To Farmers Basket The Fruits & Vegies Mart:</h1>");
        printWriter.println("<p>Type Of Apple : "+appleType + "</p>");
        printWriter.println("<p>Apple Originated From : "+grownIn+ "</p>");
        printWriter.println("<p>Apple Imported From : "+imp+ "</p>");
        printWriter.println("<p>Apple Colour : "+col+ "</p>");
        printWriter.println("<p>Apple's Price Per Kg : "+ppk+ "</p>");
        printWriter.println("Send message in Apple resp...!");
        printWriter.println("</body></html>");
    }
}

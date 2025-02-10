package com.xworkz.webservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/banana",loadOnStartup = 1)
public class Banana extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String url=req.getRequestURL().toString();
        String name=req.getParameter("FName");
        String price=req.getParameter("price");
        String quantity=req.getParameter("quantity");


        resp.setContentType("text/html");

        PrintWriter printWriter=resp.getWriter();

        printWriter.println("<html><body>");
        printWriter.println("<h1>Welcome To Farmers Basket The Fruits & Vegies Mart:</h1>");
        printWriter.println("<p>Ordered From Farmer : "+name + "</p>");
        printWriter.println("<p>Total Amount to Be Paid : "+Integer.parseInt(price)*Integer.parseInt(quantity) + "</p>");

        //printWriter.println("Ordered From Farmer : "+name);
        //printWriter.println("Total Amount to Be Paid : "+Integer.parseInt(price)*Integer.parseInt(quantity));
        printWriter.println("<p>Banana Order Submitted...!</p>");

        printWriter.println("</body></html>");

        //resp.setContentType("text/html");






    }
}

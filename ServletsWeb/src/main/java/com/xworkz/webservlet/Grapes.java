package com.xworkz.webservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/grapes",loadOnStartup = 1)
public class Grapes extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String shopName=req.getParameter("Sname");
        String ownerName=req.getParameter("Oname");
        String shopRent=req.getParameter("rent");
        String gstNo=req.getParameter("gstNo");
        String address=req.getParameter("address");
        String sOpenTimming=req.getParameter("openTime");
        String sCloseTimming=req.getParameter("closeTime");
        String worker1=req.getParameter("worker1");
        String worker2=req.getParameter("worker2");
        String worker3=req.getParameter("worker3");
        String worker4=req.getParameter("worker4");

        resp.setContentType("text/html");

        PrintWriter printWriter=resp.getWriter();

        printWriter.println("<html><body>");
        printWriter.println("<h1>Welcome To Farmers Basket The Fruits & Vegies Mart:</h1>");
        printWriter.println("<p>Shope Name : "+shopName+ "</p>");
        printWriter.println("<p>Shop Owner : "+ownerName+ "</p>");
        printWriter.println("<p>Shop Rent : "+shopRent+ "</p>");
        printWriter.println("<p>Shop GST No : "+gstNo+ "</p>");
        printWriter.println("<p>Shop Address : "+address+ "</p>");
        printWriter.println("<p>Shop Opening Time : "+sOpenTimming+ "</p>");
        printWriter.println("<p>Shop Closing Time : "+sCloseTimming+ "</p>");
        printWriter.println("<p>Worker(1) Name : "+worker1+ "</p>");
        printWriter.println("<p>Worker(2) Name : "+worker2+ "</p>");
        printWriter.println("<p>Worker(3) Name : "+worker3+ "</p>");
        printWriter.println("<p>Worker(4) Name : "+worker4+ "</p>");
        printWriter.println("</html></body>");

        printWriter.println("Send message in Grapes resp...!");
    }
}

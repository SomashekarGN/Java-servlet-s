package com.xworkz.diffOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/reg",loadOnStartup = 1)
public class RegForm extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("nameName");
        String email=req.getParameter("emailName");
        String phNo=req.getParameter("phnoName");
        String password=req.getParameter("passName");
        String password1=req.getParameter("passName1");
        //String gender=req.getParameter("genderName");
        String dob=req.getParameter("dobName");
        String anotherEmail=req.getParameter("eName");


        resp.setContentType("text/html");

        PrintWriter writer=resp.getWriter();

        writer.println("<!DOCTYPE html>");
        writer.println("<html lang='en'>");
        writer.println("<head>");
        writer.println("<meta charset='UTF-8'>");
        writer.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        writer.println("<title>Registration Form Details</title>");
        writer.println("</head>");
        writer.println("<body>");

        writer.println("<h2>Registration Details</h2>");
        writer.println("<table border='1' cellspacing='0' cellpadding='5'>");

        writer.println("<tr><th>Field</th><th>Value</th></tr>");
        writer.println("<tr><td>Name</td><td>" + name + "</td></tr>");
        writer.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        writer.println("<tr><td>Phone Number</td><td>" + phNo + "</td></tr>");
        writer.println("<tr><td>Password</td><td>" + password + "</td></tr>");
        writer.println("<tr><td>Confirm Password</td><td>" + password1 + "</td></tr>");
        writer.println("<tr><td>Date of Birth</td><td>" + dob + "</td></tr>");
        writer.println("<tr><td>Alternate Email</td><td>" + anotherEmail + "</td></tr>");

        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");






    }
}

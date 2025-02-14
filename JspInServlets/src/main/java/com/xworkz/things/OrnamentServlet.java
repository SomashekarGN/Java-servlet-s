package com.xworkz.things;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/ornaments",loadOnStartup = 1)
public class OrnamentServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("Sever Initiated...!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String grams=req.getParameter("grams");
        String costPerGram=req.getParameter("costPerGram");
        String gst=req.getParameter("gst");
        String serviceRate=req.getParameter("serviceRate");


        RequestDispatcher request=req.getRequestDispatcher("OrnamentResult.jsp");
        req.setAttribute("Name",name);
        req.setAttribute("Grams",grams);
        req.setAttribute("Cost Per Gram",costPerGram);
        req.setAttribute("GST",gst);
        req.setAttribute("Service Rate",serviceRate);

        request.forward(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("Destoyed...!");
    }
}

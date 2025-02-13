package com.xworkz.fromToDTO.service;

import com.xworkz.fromToDTO.Dto.MusuemDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/musuemform",loadOnStartup = 1)
public class MusuemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cName=req.getParameter("customerName");
        String aMember=req.getParameter("totalAdults");
        String cMember=req.getParameter("totalChildren");
        long phNum=Long.parseLong(req.getParameter("mobileNo"));
        String eMail=req.getParameter("email");

        int NoOfAdultTicket=Integer.parseInt(aMember);
        int NoOfchildTicket=Integer.parseInt(cMember);

        int adultTicket=100;
        int childTicket=50;

        int adultTotal=NoOfAdultTicket*adultTicket;
        int childTotal=NoOfchildTicket*childTicket;

        int total=adultTotal+childTotal;

        MusuemDTO dto=new MusuemDTO(cName,NoOfAdultTicket,NoOfchildTicket,phNum,eMail,total);
        req.setAttribute("dto",dto);
        //req.setAttribute("total",total);
        RequestDispatcher requestDispatcher= req.getRequestDispatcher("MusuemResult.jsp");
        requestDispatcher.forward(req,resp);


    }
}

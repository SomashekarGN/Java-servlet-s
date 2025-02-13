package com.xworkz.fromToDTO.service;

import com.xworkz.fromToDTO.Dto.SweetDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/sweetform")
public class SweetServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("shopName");
        String sweet=req.getParameter("sweetName");
        String special=req.getParameter("special");
        String quantity=req.getParameter("quantity");

        double totalQuantity=Double.parseDouble(quantity);

        Map<String,Integer> map=new HashMap<>();
        map.put("Gulab Jamun",120);
        map.put("Rasgulla",180);
        map.put("Barfi",300);
        map.put("Jalebi",140);
        map.put("Laddu",160);


        int cost=map.get(sweet);
        double totalPrice=totalQuantity*cost;
        if(special.equals("Yes"))
        {
             totalPrice=totalPrice+(totalQuantity*30);
        }

        SweetDTO dto=new SweetDTO(name,sweet,special,totalQuantity,totalPrice);
        req.setAttribute("totalPrice",totalPrice);
        req.setAttribute("dto",dto);

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("SweetForm.jsp");
        requestDispatcher.forward(req,resp);

    }
}

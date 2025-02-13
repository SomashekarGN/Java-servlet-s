package com.xworkz.fromToDTO.service;

import com.xworkz.fromToDTO.Dto.MilkDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/milkform",loadOnStartup = 1)
public class MilkServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("brand");
        String milkType=req.getParameter("type");
        String quantity=req.getParameter("quantity");

        int totalQuantity=Integer.parseInt(quantity);

        Map<String,Integer> map=new HashMap<>();
        map.put("Special",56);
        map.put("Ordinary",54);
        map.put("Good Life",67);
        map.put("Good Life Lite",68);
        map.put("Family",56);
        map.put("Buffalo",70);

        int price=map.get(milkType);
        int total=price*totalQuantity;

        MilkDTO dto=new MilkDTO(name,milkType,totalQuantity);

        req.setAttribute("total",total);
        req.setAttribute("milkdto",dto);

        RequestDispatcher requestDispatcher=
                req.getRequestDispatcher("MilkResult.jsp");
        requestDispatcher.forward(req,resp);

    }
}

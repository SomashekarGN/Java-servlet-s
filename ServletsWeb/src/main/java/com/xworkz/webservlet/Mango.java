package com.xworkz.webservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/mango",loadOnStartup = 1)
public class Mango extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String shopName = req.getParameter("shopName");
        String ownerName = req.getParameter("ownerName");
        String shopAddress = req.getParameter("shopAddress");
        String shopRent = req.getParameter("shopRent");
        String variety = req.getParameter("variety");
        String size = req.getParameter("size");
        String color = req.getParameter("color");
        String weight = req.getParameter("weight");
        String quality = req.getParameter("quality");
        String openTime = req.getParameter("openTime");
        String closeTime = req.getParameter("closeTime");
        String pricePerKg = req.getParameter("pricePerKg");
        String bulkPrice = req.getParameter("bulkPrice");
        String contactNumber = req.getParameter("contactNumber");
        String email = req.getParameter("email");
        String supplierName = req.getParameter("supplierName");
        String supplierContact = req.getParameter("supplierContact");
        String supplierAddress = req.getParameter("supplierAddress");
        String worker1 = req.getParameter("worker1");
        String worker2 = req.getParameter("worker2");
        String worker3 = req.getParameter("worker3");
        String worker4 = req.getParameter("worker4");
        String deliveryArea = req.getParameter("deliveryArea");
        String deliveryTime = req.getParameter("deliveryTime");
        String deliveryCost = req.getParameter("deliveryCost");
        String totalInventory = req.getParameter("totalInventory");
        String availableStock = req.getParameter("availableStock");
        String soldQuantity = req.getParameter("soldQuantity");
        String customerFeedback = req.getParameter("customerFeedback");
        String advertisingChannels = req.getParameter("advertisingChannels");
        String storageLocation = req.getParameter("storageLocation");

        // Set response content type to HTML
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        // Construct HTML content to display the received input values
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<body>");

        printWriter.println("<h2>Received Mango Details</h2>");
        printWriter.println("<table border='1' cellspacing='0' cellpadding='5'>");

        printWriter.println("<tr><th>Field</th><th>Value</th></tr>");
        printWriter.println("<tr><td>Shop Name</td><td>" + shopName + "</td></tr>");
        printWriter.println("<tr><td>Owner Name</td><td>" + ownerName + "</td></tr>");
        printWriter.println("<tr><td>Shop Address</td><td>" + shopAddress + "</td></tr>");
        printWriter.println("<tr><td>Shop Rent</td><td>" + shopRent + "</td></tr>");
        printWriter.println("<tr><td>Variety</td><td>" + variety + "</td></tr>");
        printWriter.println("<tr><td>Size</td><td>" + size + "</td></tr>");
        printWriter.println("<tr><td>Color</td><td>" + color + "</td></tr>");
        printWriter.println("<tr><td>Weight</td><td>" + weight + "</td></tr>");
        printWriter.println("<tr><td>Quality</td><td>" + quality + "</td></tr>");
        printWriter.println("<tr><td>Open Time</td><td>" + openTime + "</td></tr>");
        printWriter.println("<tr><td>Close Time</td><td>" + closeTime + "</td></tr>");
        printWriter.println("<tr><td>Price Per Kg</td><td>" + pricePerKg + "</td></tr>");
        printWriter.println("<tr><td>Bulk Price</td><td>" + bulkPrice + "</td></tr>");
        printWriter.println("<tr><td>Contact Number</td><td>" + contactNumber + "</td></tr>");
        printWriter.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        printWriter.println("<tr><td>Supplier Name</td><td>" + supplierName + "</td></tr>");
        printWriter.println("<tr><td>Supplier Contact</td><td>" + supplierContact + "</td></tr>");
        printWriter.println("<tr><td>Supplier Address</td><td>" + supplierAddress + "</td></tr>");
        printWriter.println("<tr><td>Worker 1</td><td>" + worker1 + "</td></tr>");
        printWriter.println("<tr><td>Worker 2</td><td>" + worker2 + "</td></tr>");
        printWriter.println("<tr><td>Worker 3</td><td>" + worker3 + "</td></tr>");
        printWriter.println("<tr><td>Worker 4</td><td>" + worker4 + "</td></tr>");
        printWriter.println("<tr><td>Delivery Area</td><td>" + deliveryArea + "</td></tr>");
        printWriter.println("<tr><td>Delivery Time</td><td>" + deliveryTime + "</td></tr>");
        printWriter.println("<tr><td>Delivery Cost</td><td>" + deliveryCost + "</td></tr>");
        printWriter.println("<tr><td>Total Inventory</td><td>" + totalInventory + "</td></tr>");
        printWriter.println("<tr><td>Available Stock</td><td>" + availableStock + "</td></tr>");
        printWriter.println("<tr><td>Sold Quantity</td><td>" + soldQuantity + "</td></tr>");
        printWriter.println("<tr><td>Customer Feedback</td><td>" + customerFeedback + "</td></tr>");
        printWriter.println("<tr><td>Advertising Channels</td><td>" + advertisingChannels + "</td></tr>");
        printWriter.println("<tr><td>Storage Location</td><td>" + storageLocation + "</td></tr>");

        printWriter.println("</table>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        //PrintWriter printWriter=resp.getWriter();
        printWriter.println("Send message in Mango resp...!");
    }
}

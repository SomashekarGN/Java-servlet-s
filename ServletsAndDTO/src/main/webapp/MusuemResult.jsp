<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Musuem Tickets</title>
</head>
<body>
<pre>
<h1>Musuem Ticket Details.</h1>
<p>Customer Name : ${dto.customerName}</p>
<p>Number of Adult Tickets  : ${dto.adultTicket}</p>
<p>Number of Child Tickets : ${dto.childTicket}</p>
<p>Mobile Number : ${dto.mobileNum}</p>
<p>Email Id : ${dto.emailId}</p>
<p>Total Amount : ${dto.total}</p>
</pre>
</body>
</html>
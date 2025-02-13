<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Musuem Tickets</title>
</head>
<body>
<h1>Museum Ticket Form</h1>
    <form action="musuemform" method="post">
        <pre>
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" placeholder="Enter your name" required>


        <label for="totalAdults">Total Adult Members:</label>
        <select id="totalAdults" name="totalAdults" required>
            <option value="">-- Select --</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>


        <label for="totalChildren">Total Child Members:</label>
        <select id="totalChildren" name="totalChildren" required>
            <option value="">-- Select --</option>
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>


        <label for="mobileNo">Mobile No:</label>
        <input type="tel" id="mobileNo" name="mobileNo" placeholder="Enter your mobile number" required>


        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder="Enter your email" required>


        <button type="submit">Submit</button>
        </pre>
    </form>
</body>
</html>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sweet Details</title>
</head>
<body>
<p>Sweet Shop Name : ${dto.sweetShopName}</p>
<p>Sweet  : ${dto.sweet}</p>
<p>Is It Special : ${dto.special}</p>
<p>Quantity : ${dto.quantity}</p>
<p>Total Price : ${dto.totalPrice}</p>
    <pre>
     <h1>Sweet Form</h1>
        <form action="sweetform" method="post">
            <label for="shopName">Shop Name:</label>
            <select id="shopName" name="shopName" required>
                <option value="">-- Select Shop --</option>
                <option value="Asha Sweets">Asha Sweets</option>
                <option value="Mishra pedha">Mishra pedha</option>
                <option value="Purohith sweets">Purohith sweets</option>
                <option value="Bangalore sweet Mart">Bangalore sweet Mart</option>
            </select>

            <label for="sweetName">Sweet Name:</label>
            <select id="sweetName" name="sweetName" required>
                <option value="">-- Select Sweet --</option>
                <option value="Gulab Jamun">Gulab Jamun</option>
                <option value="Rasgulla">Rasgulla</option>
                <option value="Barfi">Barfi</option>
                <option value="Jalebi">Jalebi</option>
                <option value="Laddu">Laddu</option>
            </select>


                    <div>
                    <label>Special:</label>
                        <label for="specialYes">
                            <input type="radio" id="specialYes" name="special" value="Yes" required> Yes
                        </label>
                        <label for="specialNo">
                            <input type="radio" id="specialNo" name="special" value="No" required> No
                        </label>
                    </div>

            <label for="quantity">Quantity:</label>
            <select id="quantity" name="quantity" required>
                <option value="">-- Select Quantity --</option>
                <option value="0.5">0.5 kg</option>
                <option value="1">1 kg</option>
                <option value="1.5">1.5 kg</option>
                <option value="2">2 kg</option>
                <option value="5">5 kg</option>
            </select>

            <button type="submit">Submit</button>
        </form>

    </pre>
</body>
</html>
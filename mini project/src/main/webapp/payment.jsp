<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Payment Details</h1>
    <form action="payment" method="post">
        <label for="cardNumber">Card Number:</label>
        <input type="text" id="cardNumber" name="cardNumber" required><br>
        <label for="expiryDate">Expiry Date:</label>
        <input type="text" id="expiryDate" name="expiryDate" placeholder="MM/YYYY" required><br>
        <label for="cvv">CVV:</label>
        <input type="password" id="cvv" name="cvv" maxlength="3" required><br>
        <label for="address">Address:</label>
        <textarea id="address" name="address" required></textarea><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
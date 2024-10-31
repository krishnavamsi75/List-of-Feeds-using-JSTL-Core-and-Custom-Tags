<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="dateFormat" %>
<%@ taglib uri="/WEB-INF/tlds/copyrightTag.tld" prefix="ct" %>
<!DOCTYPE html>
<html>
<head>
    <title>Inventory List</title>
    <link rel="stylesheet" type="text/css" href="styles.css"> 
</head>
<body>
    <!-- Display Current Date and Time -->
    <h2>Inventory List</h2>
    <p class="date-time">Current Date and Time: 
        <dateFormat:formatDate value="<%= new java.util.Date() %>" pattern="MMMM d, yyyy, h:mm a" />
    </p>
    <table>
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.quantity}</td>
                <td>${product.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
<footer>
    <p class="copyright">
    <ct:copyright />
    </p>
</footer>
</html>

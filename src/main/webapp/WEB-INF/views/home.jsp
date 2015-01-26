<%@ include file="include.jsp" %>
<html>
<head>
	<title>Home</title>
<style>
table, th, td {
    border: 1px solid black;
    text-align: left;
}
table#t01 tr:nth-child(even) {
    background-color: #eee;
}
table#t01 tr:nth-child(odd) {
    background-color: #fff;
}
table#t01 th {
    color: white;
    background-color: black;
} 
</style></head>
<body>
<h1>
	Hello world!  
</h1>

	<c:forEach var="book" items="books"><c:out value="${book }"></c:out></c:forEach>
</body>
</html>

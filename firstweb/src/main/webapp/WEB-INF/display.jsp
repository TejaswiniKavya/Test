<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Result is:<%= request.getAttribute("result") %> -->

 <!-- USe EL(Expression Language) to access the data -->
 Result is:  ${result}   <!--  if we are not getting add isELIgnored="false in top" -->
 
 

</body>
</html>
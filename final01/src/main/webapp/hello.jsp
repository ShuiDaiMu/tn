<%@ page import="java.util.*" 
	contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
<html>

	<head></head>
		<body style="font-size:30px;">
		你好！
		
		time:<%
			Date date = new Date();
			out.println(date);
		%>
		
		<br/>
		
		time:<%
		out.println(new Date());
		%>
		
		<br/>		
			
			<%
			out.println("你好！");
			for(int i=0;i < 100;i++){
				out.println("<h1>Hello kitty</h1>");
			}
			%>
		
		</body>


</html>
























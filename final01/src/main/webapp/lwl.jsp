<%@ page import="java.util.*,java.text.*" %>
<html>
	<head></head>
	<body style="font-size:30px;">
		time:<%=new Date() %>
		
		<br/>
		
		<%
		out.println(new Date());
		%>
		<br/>
		<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		%>
		<br/>
		<% out.println(sdf.format(new Date()));%>
		
		
	</body>

</html>














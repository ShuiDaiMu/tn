<%@ page 
		contentType="text/html;charset=utf-8" 
		pageEncoding="utf-8"%>
<%@ page import="dao.*,entity.*,java.util.*"%>	
		
<html>

<head></head>

	<body style="font-size:30px">
	<table border="1" width="60%" cellpadding="0" cellspacing="0" >
	<tr><td>id</td><td>用户名</td><td>密码</td><td>邮箱</td></tr>
	
	<%
			UseDao dao = new UseDao();
				List<Json> users = dao.findAll();
				for(int i = 0;i<users.size();i++){
			Json user = users.get(i);
		%>
			<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getUsername()%></td>
			<td><%=user.getPassword()%></td>
			<td><%=user.getEmail()%></td>
			</tr>
		<% 	
		}
	%>
	
	</table>	
	</body>


</html>
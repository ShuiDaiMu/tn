<%@ page 
		contentType="text/html;charset=utf-8" 
		pageEncoding="utf-8"%>
<%@ page import="dao.*,entity.*,java.util.*"%>	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>listUsers</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								用户
							</td>
							<td>
								Pwd
							</td>
							<td>
								Email
							</td>
							<td>
								Operation
							</td>
						</tr>
						<%
							UseDao userDao = new UseDao();
										List<Json> list = userDao.findAll();
										Json user = null;
										for(int i = 0;i<list.size();i++){
											user = list.get(i);
										}
						%>
						<tr class="row1">
							<td>
								<%=user.getId()
								%>
							</td>
							<td>
								<%=user.getUsername()
								%>
							</td>
							<td>
								<%=user.getPassword()
								%>
							</td>
							<td>
								<%=user.getEmail()
								%>
							</td>
							<td>
								<a href="listUsers.html">delete</a>&nbsp;
							</td>
						</tr>
						<tr class="row2">
							<td>
								2
							</td>
							<td>
								sdd
							</td>
							<td>
								111
							</td>
							<td>
								eric@126.com
							</td>
							<td>
								<a href="listUsers.html">delete</a>&nbsp;
							</td>
						</tr>
					</table>
					<p>
						<input type="button" class="button" value="Add User" onclick="location='addUser.html'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>











<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE HTML >
<html>
	<head>
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv=Content-Type content="text/html; charset=UTF-8">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
	<shiro:principal/>,你无权访问该页面

		<ul>
			<li>
				<h2>
					<a target="_self" href="/user/myjsp">myjsp</a>
				</h2>
			</li>
			<li>
				<h2>
					<a target="_self" href="/login/showlogin">登录</a>
				</h2>
			</li>
			<li>
				<h2>
					<a target="_self" href="/login/logout">注销</a>
				</h2>
			</li>
		</ul>
	</body>
</html>

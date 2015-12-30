<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
  <head>
  </head>
  
  <body>
  <h2>notmyjsp</h2>
  1. Hello, <shiro:principal/>, how are you today?  

  <ul>
			<li>
				<h2>
					<a target="_self" href="/user/myjsp">myjsp</a>
				</h2>
			</li>
			<li>
				<h2>
					<a target="_self" href="/login">登录</a>
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

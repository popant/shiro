<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML>
<html>
  <head>
  </head>
  
  <body>
  Hello, <shiro:principal/>, how are you today?  

  <h2>myjsp</h2>
    <ul>
			<li>
				<h2>
					<a target="_self" href="/user/notmyjsp">无权访问</a>
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

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="<%=basePath%>js/jquery-1.8.3.min.js"></script>
  </head>
  
  <body>
    	<h5><a href="<%=basePath%>user/findAllUser">进入用户管理页</a></h5>
    	<a href="javascript:getJson();">获取json数据</a>
    	<script type="text/javascript">
    	     function getJson(){
    	    	 console.log(12)
    	    	 $.ajax({
    	    		 type:"get",
    	    		 data:{"id":222},
    	    		 url:"<%=basePath%>user/findAllUser",
    	    		 dataType:"json",
    	    		 success:function(data){ 
    	    			 console.log(data);
    	    		     var username = data[0].username;
    	    		     var id = data[0].id;
    	    		     var age = data[0].age;
    	    		     console.log(username);
    	    		 },
    	    		 error:function(e){
    	    			 console.log(e)
    	    		 }
    	    	 })
    	     }
    	</script>
  </body>
</html>

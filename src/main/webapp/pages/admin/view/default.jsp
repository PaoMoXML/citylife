<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台首页</title>
  <script src="../../../js/jquery-3.4.1.min.js"></script>
</head>
<body>
    <center>
    
        <table border="0" cellpadding="0" cellspacing="0" width="650" height="300">
            <tr><td align="center">欢迎登录都市供求信息网后台！</td></tr>
        </table>
<script type="text/javascript">

function adminSearch(){
	
	var infopayfor = window.localStorage.getItem("infopayfor");
	var infocheck = window.localStorage.getItem("infocheck");
	var infotype = window.localStorage.getItem("infotype");
	console.log(infopayfor);
	console.log(infocheck);
	console.log(infotype);
	var search = {"infopayfor":infopayfor,"infocheck":infocheck,"infotype":infotype};
	var jsonData = JSON.stringify(search);
	var url = "${pageContext.request.contextPath}/info/adminSearch"                               	
		$.ajax({
		type:"post",
		url:url,
		data:jsonData,
		dataType:"json",
        contentType : "application/json;charset=UTF-8",
        success: function(result){
            console.log(result);
            return result;
           },
           error: function(result) {
               console.log(result);
           },
	}) 
	
	
	
} 
</script>
        
    </center>
</body>
</html>
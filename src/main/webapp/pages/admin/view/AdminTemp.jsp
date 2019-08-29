<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>都市信息网-后台管理</title>
 <link type="text/css" rel="stylesheet" href="/citylife/css/style.css">
   <script src="../js/jquery-3.4.1.min.js"></script>
</head>
<body >
   
        <table border="0" width="920" cellspacing="0" height="auto" bgcolor="white" align="center" >
			<!-- 页眉 -->
            <tr>
				<td colspan="2">
					<iframe src="/citylife/pages/admin/view/top.jsp" frameBorder="0" width="920" scrolling="no" height="100" ></iframe>
				</td>
			</tr>
			<!-- 分隔行 -->
            <tr height="10" bgcolor="lightgrey">
				<td colspan="2"></td>
			</tr>
			<!-- 内容区域 -->
            <tr>
                <td width="700" align="center" valign="top">
					<!-- main -->
					<iframe src="/citylife/pages/admin/view/main.jsp" frameBorder="0" width="688" scrolling="no" height="550"id = "main" ></iframe>
				</td>
				<td width="200" align="center" valign="top">
					<!-- 右侧栏 -->
					<iframe src="/citylife/pages/admin/view/right.jsp" frameBorder="0" width="240" scrolling="no" height="570" id="rightpage"></iframe>
				</td>
            </tr>
			<!-- 分隔行 -->
			<tr height="10" bgcolor="lightgrey">
				<td colspan="2"></td>
			</tr>
			<!-- 页脚 -->
            <tr>
				<td colspan="2">
					<iframe src="/citylife/pages/admin/view/end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>   
				</td>
			</tr>
			
        </table>        
    
</body>
</html>
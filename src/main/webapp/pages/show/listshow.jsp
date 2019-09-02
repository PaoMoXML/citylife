<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>都市信息网</title>
<link type="text/css" rel="stylesheet" href="../../css/style.css">
  <link rel="stylesheet" type="text/css" href="../../css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="../../css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.min.css" />

<%--js部分--%>
<script src="../../js/jquery-3.4.1.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/bootstrap-table.js"></script>
<script src="../../js/bootstrap-table-zh-CN.js"></script>
<script src="../../js/echarts.min.js"></script>
</head>
<body background="../../images/back.gif">
	<script type="text/javascript">
	 window.onload = function showtype(){
		 
	 }
	</script>
    <center>
        <table border="0" width="920" cellspacing="0" cellpadding="0" bgcolor="white">
            <tr><td colspan="2">
				<!-- 页眉 -->
				<iframe src="../../view/top.jsp" frameBorder="0" width="920" scrolling="no" height="200" ></iframe>
			</td></tr>
<tr>
	<td width="230" valign="top" align="center">
	<!-- 左侧 -->
	<iframe src="../../view/left.jsp" frameBorder="0" width="225" scrolling="no" height="400" ></iframe>
	</td>
   <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5">
            
            
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■推荐信息</b>『缴费专区』</font></td></tr>
                
                     
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     
                     
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                             <c:forEach items="${info0}" var="list0"> 
                                 <tr height="30">
                                     <td colspan="2">【${list0.infotitle }信息】</td>
                                     <td align="right">发布时间：『<fmt:formatDate value="${list0.infodate}" pattern="yyyy-MM-dd HH:mm:ss"/>』&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3">${list0.infotitle }信息内容</td></tr>
                                 <tr height="30" align="center">
                                     <td>联系电话：${list0.infophone }</td>
                                     <td>联 系 人：${list0.infolinkman }</td>
                                     <td>E-mail：${list0.infoemail }</td>
                                 </tr>  
                                 </c:forEach>                               
                             </table>
                         </td>
                     </tr>
                     <tr height="1"><td></td></tr>
                
            
        </table>
        
        <!-- 列表显示免费信息 -->
        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5" rules="rows">
            
            
                <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■最新信息</b>『免费专区』</font></td></tr>
                
                     
                         <tr><td align="center" style="border:1 solid" bgcolor="#F0F0F0">
                     
                     
                             <table border="0" width="655" cellpadding="3" style="word-break:break-all">
                             <c:forEach items="${info1}" var="list1"> 
                                 <tr height="30">
                                     <td colspan="2">【${list1.infotitle }信息】</td>
                                     <td align="right">发布时间：『<fmt:formatDate value="${list1.infodate}" pattern="yyyy-MM-dd HH:mm:ss"/>』&nbsp;</td>
                                 </tr>
                                 <tr height="80"><td colspan="3">${list1.infotitle }信息内容</td></tr>
                                 <tr height="30" align="center">
                                     <td>联系电话：${list1.infophone }</td>
                                     <td>联 系 人：${list1.infolinkman }</td>
                                     <td>E-mail：${list1.infoemail }</td>
                                 </tr>  
                                  </c:forEach>     
                             </table>
                         </td>
                     </tr>
                     <tr height="1"><td></td></tr>
                
                <tr height="30">
				<td align="center">
				<html>
					<head><title>分页导航栏</title></head>
					<body>
						<table border="0" width="100%" cellspacing="0">
							<tr>
								<td width="60%"></td>
								<td align="center" width="40%"></td>
							</tr>
						</table>
					</body>
				</html>
				</td></tr>                
            
        </table>
        
        
        <br>
</td>
            </tr>
           
        </table>
		<!-- 页脚 -->
		<iframe src="../../view/end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>        
    </center>
</body>
</html>
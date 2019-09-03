<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>都市信息网</title>
 <link type="text/css" rel="stylesheet" href="/citylife/css/style.css">
  <script language="javascript" type="text/javascript" src="/citylife/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body background="/citylife/images/back.gif">
	<div align="center">
		<!-- 页眉 -->
		<iframe src="/citylife/view/top.jsp" frameBorder="0" width="920" scrolling="no" height="200" ></iframe>
			
		<table border="0" width="920" cellspacing="0" cellpadding="0" bgcolor="white" style="text-align:center;">
			
			<tr>
				<!-- 左侧 -->
				<td width="230" valign="top" align="center">
					<iframe src="/citylife/view/left.jsp" frameBorder="0" width="225" scrolling="no" height="400" ></iframe>
				</td>
				<td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">        
					<table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5;">
					<c:forEach items="${info}" var="list"> 
						<tr height="30">
							<td style="text-indent:5" valign="bottom"><font color="#004790"><b>■推荐信息</b>『缴费专区』</font></td>
						</tr>
						<tr>
							<td align="center" style="border:0px" bgcolor="#F0F0F0">
								<table border="0" width="655" cellpadding="3" style="word-break:break-all;font-size:14px;">
									<tr height="30">
										<td colspan="2">【${list.infotitle}】</td>
										<td align="right">发布时间：『<fmt:formatDate value="${list.infodate}" pattern="yyyy-MM-dd HH:mm:ss"/>』&nbsp;</td>
									</tr>
									<tr height="20">
										<td colspan="3">${list.infotitle}信息内容</td>
									</tr>
									<tr height="30" align="center">
										<td>联系电话：${list.infophone}</td>
										<td>联 系 人：${list.infolinkman}</td>
										<td>E-mail：${list.infoemail}</td>
									</tr>                                 
								 </table>
							</td>
						</tr>
						<tr height="1">
							<td></td>
						</tr>	
						</c:forEach>
					</table>
					<!-- 列表显示免费信息 -->
					
					<table width="670" border="0" cellspacing="0" cellpadding="0" style="margin-top:5">
					<c:forEach items="${info}" var="list"> 
						<tr height="30">
							<td style="text-indent:5" valign="bottom"><font color="#004790"><b>■查看详细信息</b></font></td>
						</tr>            
						<tr height="1">
							<td></td>
						</tr>
						<tr bgcolor="#FAFCF5">
							<td style="border:1 solid">
								<table border="0" width="100%" cellspacing="0" cellpadding="2" style="font-size:14px;">
									<tr height="30">
										<td width="20%" style="text-indent:20">信息类别：</td>
										<td>${list.infotitle }</td>
									</tr>
									<tr height="30">
										<td style="text-indent:20">发布时间：</td>
										<td><fmt:formatDate value="${list.infodate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									</tr>
									<tr height="30">
										<td style="text-indent:20">信息标题：</td>
										<td>${list.infotitle }</td>
									</tr>
									<tr height="30">
										<td colspan="2" style="text-indent:20">信息内容：</td>
									</tr>
									<tr>
										<td colspan="2" style="text-indent:20">车辆信息内容：</td>
									</tr>
									<tr height="40">
										<td colspan="2" align="left">
											<table border="0" width="630" cellspacing="0" cellpadding="0"  style="word-break:break-all;font-size:14px;" >
												<tr height="20" align="center">
													<td>联系电话：${list.infophone }</td>
													<td>联系人：${list.infolinkman }</td>
													<td>E-mial：${list.infoemail }</td>
												</tr>
											</table>                      
										</td>
									</tr>
									<tr height="40">
										<td align="center" colspan="2" ><a href="javascript:window.history.back(-1)">返回</a></td>
									</tr>                              
								
								</table>
							</td>
						</tr>
						</c:forEach>
					</table>
					<br>
				</td>
			</tr>   
		</table>
	<div style="">
        <a href="?start=0">首 页</a>
        <c:if test="${page.start-page.count>=0}">
            <a href="?start=${page.start-page.count}">上一页</a>
        </c:if>
        <c:if test="${page.start-page.count<0}">
            <a href="javascript:void(0)">上一页</a>
        </c:if>
        <c:if test="${page.start+page.count<=page.last}">
            <a href="?start=${page.start+page.count}">下一页</a>
        </c:if>	
        <c:if test="${page.start+page.count>page.last}">
            <a href="javascript:void(0)">下一页</a>
        </c:if>
        <a href="?start=${page.last}">末页</a>
    </div>
		<!-- 页脚 -->
		<iframe src="/citylife/view/end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>        
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>都市信息网</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />

<%--js部分--%>
<script src="../js/jquery-3.4.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-table.js"></script>
<script src="../js/bootstrap-table-zh-CN.js"></script>
<script src="../js/echarts.min.js"></script>
</head>
<body background="../images/back.gif">
    <center>
        <table border="0" width="920" height="auto" cellspacing="0" cellpadding="0" bgcolor="white">
            <tr><td colspan="2">

			<!-- 页眉 -->
			<iframe src="top.jsp" frameBorder="0" width="920" scrolling="no" height="200" ></iframe>
			</td></tr>
            <tr>
                <td width="230" valign="top" align="center">
				<!-- 左侧 -->
				<iframe src="left.jsp" frameBorder="0" width="225" scrolling="no" height="400" id = "left"></iframe>
				</td>
                <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">


				<html>
				<head><title>首页</title></head>
				<body>
					<center>
						<!-- 缴费专区 -->
								
						<table border="0" width="670" cellspacing="0" cellpadding="5">
							<tr height="35"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■推荐信息</b>『缴费专区』</font></td></tr>
							<tr bgcolor="#FAFCF5">
								<td style="border:1 solid">
									<table border="0" width="100%" cellspacing="0" cellpadding="0">
										 <tr height="23">
											<td width="50%">『<b>招聘信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=1">招聘信息标题</a>
											</td>
											<td width="50%">『<b>培训信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=2">培训信息标题</a>
											</td>
										 </tr>
									
										 <tr height="23">
											<td width="50%">『<b>房屋信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=3">房屋信息标题</a></td>
											<td width="50%">『<b>求购信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=4">求购信息标题</a></td>
										 </tr>
										 
										 <tr height="23">
											<td width="50%">『<b>招商引资</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=5">招商引资标题</a>
											</td>
											<td width="50%">『<b>公寓信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=6">公寓信息标题</a>
											</td>
										 </tr>
									
										 <tr height="23">
											<td width="50%">『<b>求职信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=7">求职信息标题</a></td>
											<td width="50%">『<b>家教信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=8">家教信息标题</a></td>
										 </tr>
										 
										 <tr height="23">
											<td width="50%">『<b>车辆信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=9">车辆信息标题</a></td>
											<td width="50%">『<b>出售信息</b>』
												<a href="${pageContext.request.contextPath}/info/show?infotype=10">出售信息标题</a></td>
										 </tr>
										                
									</table>
								</td>
							</tr>
						</table>
						<!-- 广告 -->
						<table border="0" width="670"cellspacing="0" cellpadding="0" style="margin-top:1">
							<tr><td align="center"><img src="../images/pcard2.jpg"></td></tr>
						</table>        
						<!-- 免费专区 -->
						
						<table border="0" width="670" cellspacing="2" cellpadding="0">
							<tr height="35"><td colspan="2" style="text-indent:5" valign="bottom"><font color="#004790"><b>■最新信息</b>『免费专区』</font></td></tr>            
							 
							<tr>
								<td align="center">
									<table id = "freeshow" border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
									<tr>
										<td>标题</td>
										<td>联系人</td>
										<td>Email</td>
										<td>内容</td>
									</tr>
									</table>
								</td>	
								<td align="center">
									<table id = "payshow" border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
									<tr>
										<td>标题</td>
										<td>联系人</td>
										<td>Email</td>
										<td>内容</td>
									</tr>
									</table>
								</td>															
							</tr>
							
						
							<tr>
								<td align="center">
									<table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
									<tr bgcolor="#00B48F" height="30">
										<td style="text-indent:10"><b><font color="white">培训信息</font></b></td> </tr>
									<tr bgcolor="#FAFCF5"><td style="text-indent:3">★ <a href="${pageContext.request.contextPath}/info/show?infotype=2">培训信息</a></td></tr>
									<tr height="20" bgcolor="#FAFCF5"><td align="right"><a href="${pageContext.request.contextPath}/info/show?infotype=2">更多...</a>&nbsp;&nbsp;</td></tr>	
									
									</table>
								</td>
					 
								<td align="center">
									<table border="1" cellspacing="0" cellpadding="0" width="332" height="160" rules="none" bordercolor="lightgrey" bordercolorlight="lightgrey" bordercolordark="white">
										
										 <tr bgcolor="#00B48F" height="30">
											<td style="text-indent:10"><b><font color="white">求职信息</font></b></td>                                      
										 </tr>
									
										<tr bgcolor="#FAFCF5">
											<td style="text-indent:3">★ <a href="${pageContext.request.contextPath}/info/show?infotype=7">求职信息</a></td>
										</tr>
										<tr height="20" bgcolor="#FAFCF5">
											<td align="right"><a href="${pageContext.request.contextPath}/info/show?infotype=7">更多...</a>&nbsp;&nbsp;</td>
										</tr>                                    
									 
									</table>
								</td>
							</tr>
				  
						</table>
						<br>
					</center>
				</body>

				</html>
			</td>
		</tr>

       </table>
       <script type="text/javascript">
       
       window.onload = function showNew(){
				$.ajax({
					async: false,
					type:"post",
					url:'${pageContext.request.contextPath}/info/showNew?infopayfo=1',
					data:'',
					dataType:"json",
			        contentType : "application/json;charset=UTF-8",
			        success: function(result){
			            console.log(result.key);
			            var free = result.key;
			            var tbBody = "";
		        		tbBody = "<tr>" +
		        				"</tr>"+
		        				"<tr>" + 
		        					"<td>"+free.infotitle +"</td>"+
		        					"<td>"+free.infolinkman+"</td>"+
		        					"<td>"+free.infoemail+"</td>"+
		        					"<td>"+free.infocontent +"</td>"+
		        				"</tr>";
		        		$("#freeshow").append(tbBody);
			            
			           },
			           error: function(result) {
			               console.log(result);
			           },
				});
				
				$.ajax({
					async: false,
					type:"post",
					url:'${pageContext.request.contextPath}/info/showNew2?infopayfo=1',
					data:'',
					dataType:"json",
			        contentType : "application/json;charset=UTF-8",
			        success: function(result){
			            console.log(result.key);
			            var pay = result.key;
			            var tbBody2 = "";
		        		tbBody2 = "<tr>" +
		        				"</tr>"+
		        				"<tr>" + 
		        					"<td>"+pay.infotitle +"</td>"+
		        					"<td>"+pay.infolinkman+"</td>"+
		        					"<td>"+pay.infoemail+"</td>"+
		        					"<td>"+pay.infocontent +"</td>"+
		        				"</tr>";
		        		$("#payshow").append(tbBody2);
			            
			           },
			           error: function(result) {
			               console.log(result);
			           },
				})
       		}
       
/*        window.onload = function showNew2(){
			
			$.ajax({
				type:"post",
				url:'${pageContext.request.contextPath}/info/showNew?infopayfo=1',
				data:'',
				dataType:"json",
		        contentType : "application/json;charset=UTF-8",
		        success: function(result){
		            console.log(result.key);
		            var free = result.key;
		            var tbBody2 = "";
	        		tbBody2 = "<tr>" +
	        				"</tr>"+
	        				"<tr>" + 
	        					"<td>"+free.infotitle +"</td>"+
	        					"<td>"+free.infolinkman+"</td>"+
	        					"<td>"+free.infoemail+"</td>"+
	        					"<td>"+free.infocontent +"</td>"+
	        				"</tr>";
	        		$("#payshow").append(tbBody2);
		            
		           },
		           error: function(result) {
		               console.log(result);
		           },
			})
       } */
       </script>

		<!-- 页脚 -->
		<iframe src="end.jsp" frameBorder="0" width="920" scrolling="no" height="70" style="margin-top:0"></iframe>	   
    </center>
</body>
</html>
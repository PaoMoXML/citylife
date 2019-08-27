<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>侧栏</title>
<link type="text/css" rel="stylesheet" href="../css/style.css">
<script language="javascript" type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
<script src="../js/jquery-3.4.1.min.js"></script>

</head>
<body>

	<table border="0" width="225" height="100%" cellspacing="0" cellpadding="0">
		<tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■日历</b></font></td></tr>            
		<tr height="1"><td></td></tr>
		<!-- 日历 -->
		<tr height="180">
			<td valign="top"  align="center">
				<div id="div1" style="width:210px"></div>
			</td>
		</tr>
	
		<tr height="1"><td></td></tr>
		<tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■信息快速搜索</b></font></td></tr>
		<tr height="1"><td></td></tr>
		<tr height="103">
			<td align="center" valign="top" background="../images/leftS.jpg">
				<table border="0" width="99%" height="100%" cellspacing="0" style="font-size:13px">
<%-- 				<form id="info_SearchShow_action" name="info_SearchShow_action" action="${pageContext.request.contextPath}/info/likeSearch" method="post">                        
 --%>					<tr height="10"><td colspan="3"></td></tr>
					<tr>
						<td align="right" width="70">关键字：</td>
						<td colspan="2" width="200"><input type="text" name="searchInfo.sqlvalue" size="12" value="" id="info_SearchShow_action_searchInfo_sqlvalue"/></td>
					</tr>
					<tr>
						<td align="right">条&nbsp;&nbsp;件：</td>
						<td colspan="2">
							<select name="searchInfo.subsql" id="info_SearchShow_action_searchInfo_subsql" >
								<option value=""></option>
								<option value="infocontent">信息内容</option>
								<option value="infophone">联系电话</option>
								<option value="infoemail">E-mail地址</option>
								<option value="id">ID值</option>
								<option value="infotitle">信息标题</option>
								<option value="infolinkman">联系人</option>
							</select>

						</td>
						
					</tr>
					<tr>
						<td align="right">搜索类型：</td>
						<td width="80px">

							<input type="radio" name="searchInfo.type" id="info_SearchShow_action_searchInfo_typeall" value="all"/>
							<label for="info_SearchShow_action_searchInfo_typeall">全字匹配</label>
							<br>
							<input type="radio" name="searchInfo.type" id="info_SearchShow_action_searchInfo_typelike" checked="checked" value="like"/>
							<label for="info_SearchShow_action_searchInfo_typelike">模糊搜索</label>

						</td>
						<td align="center" >
							<input type="button" id="info_SearchShow_action_0" onclick="search()" value="搜索"/>
							<script type="text/javascript">
							function search(){
								//判断查询类型
								if(document.getElementById('info_SearchShow_action_searchInfo_typeall').checked){
									//全字匹配
									var url = "${pageContext.request.contextPath}/info/search";
								}else if(document.getElementById('info_SearchShow_action_searchInfo_typelike').checked){
									//模糊搜索
									var url = "${pageContext.request.contextPath}/info/likeSearch";
								}
								//获取查询条件
								var x = document.getElementById('info_SearchShow_action_searchInfo_subsql').value;
								console.log(x);
								//判断查询条件
								if(x=='infotitle'){
									var infotitle = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}else if(x == 'infolinkman'){								
									var infolinkman = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}else if(x == 'infophone'){	
									var infophone = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}else if(x == 'infoemail'){
									var infoemail = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}else if(x == 'infocontent'){
									var infocontent = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}else if(x == 'id'){
									var id = document.getElementById('info_SearchShow_action_searchInfo_sqlvalue').value;
								}
								var search = {"infotitle":infotitle,"infolinkman":infolinkman,"infophone":infophone,"infoemail":infoemail,"infocontent":infocontent,"id":id}
								var jsonData = JSON.stringify(search);
								$.ajax({
									type:"post",
									url:url,
									data:jsonData,
									dataType:"json",
							        contentType : "application/json;charset=UTF-8",
							        success: function(result){
							            console.log(result);
							           },
							           error: function(result) {
							               console.log(result);
							           },
								})
							}
							</script>
						</td>
					</tr>
					<tr height="10"><td colspan="3"></td></tr>
<!-- 				</form>
 -->



				</table>
			</td>
		</tr>
		<tr><td></td></tr>
	</table>                

</body>
	<script>
		WdatePicker({eCont:'div1'})

	</script>
</html>
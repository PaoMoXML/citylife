<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
    <center>
        <table border="0" width="920" cellspacing="0" cellpadding="0" bgcolor="white">
            <tr><td colspan="2">
				<!-- 页眉 -->
				<iframe src="../../view/top.jsp" frameBorder="0" width="920" scrolling="no" height="200" ></iframe>
			</td></tr>
<tr>
	<td width="230" valign="top" align="center">
	<!-- 左侧 -->
	<iframe id = "searchPage" src="../../view/left.jsp" frameBorder="0" width="225" scrolling="no" height="400" ></iframe>
	</td>
   <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5">
       
            <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■查询结果</b></td></tr>
            <tr height="1"><td></td></tr>
            <tr>
                <td align="center" style="border:1 solid">
					<table id="showSearch"
							class="table"
							style="margin: 0px auto">
					</table>
                </td>
            </tr>
            <tr height="1"><td></td></tr>
            <tr height="30"><td align="center">
            <script type="text/javascript">
		       
            window.onload = function () {
                // 通过getElementById获取嵌套页面的ID调用嵌套的页面的方法进行参数回填
                
                userSearch();
            };
            
		       function userSearch(){
		    	  	var infotitle = window.localStorage.getItem("infotitle");
					var infolinkman = window.localStorage.getItem("infolinkman");
		    	  	var infophone = window.localStorage.getItem("infophone");
					var infoemail = window.localStorage.getItem("infoemail");
		    	  	var infocontent = window.localStorage.getItem("infocontent");
					var id = window.localStorage.getItem("id");
					var url = window.localStorage.getItem("url");
					var search = {"infotitle":infotitle,"infolinkman":infolinkman,"infophone":infophone,"infoemail":infoemail,"infocontent":infocontent,"id":id}
					var jsonData = JSON.stringify(search);
					
					 $('#showSearch').bootstrapTable('destroy').bootstrapTable({
						 ajax : function(request) {
								$.ajax({
									type:"post",
									url:url,
									data:jsonData,
									dataType:"json",
							        contentType : "application/json;charset=UTF-8",
							        success: function(result){
							            console.log(result);
							            request.success({
						                    row : result
						                });
							            $('#showSearch').bootstrapTable('load', result);
							           },
							           error: function(result) {
							               console.log(result);
							           },
								})
						 },
							striped : true, //是否显示行间隔色
							pageNumber : 1, //初始化加载第一页
							cache : true,//是否缓存数据
							toolbar : '#toolbar', //工具按钮用哪个容器
							buttonsAlign : "right", //按钮位置
							pagination : true,//是否分页
							pageList : [ 2, 5, 10 ],//可选择单页记录数
							sidePagination : 'client',//server:服务器端分页|client：前端分页
							cardView : true,
							pageSize : 2,//单页记录数
							detailView:true,
							columns : [
								{
								title : 'ID:  ',
								field : 'id',
								sortable : true
							}, {
								title : '标题:  ',
								field : 'infotitle',
								sortable : true
							}, {
								title : '联系人:  ',
								field : 'infolinkman',
							}, {
								title : '电话:  ',
								field : 'infophone',
							}, {
								title : '邮箱:  ',
								field : 'infoemail',
							},{
								title : '内容:  ',
								field : 'infocontent',
							} ],
					 })
					
		       }
		       </script>

			
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
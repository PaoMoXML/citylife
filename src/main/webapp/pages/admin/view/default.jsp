<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台首页</title>
 <link rel="stylesheet" type="text/css" href="../../../css/bootstrap-theme.css" />
<link rel="stylesheet" type="text/css" href="../../../css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="../../../css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css" />

<%--js部分--%>
<script src="../../../js/jquery-3.4.1.min.js"></script>
<script src="../../../js/bootstrap.min.js"></script>
<script src="../../../js/bootstrap-table.js"></script>
<script src="../../../js/bootstrap-table-zh-CN.js"></script>
<script src="../../../js/echarts.min.js"></script>
</head>
<body>
    <center>
    
    <label class="col-sm-1 control-label" style="text-align: right; margin-top:5px">查询信息：</label>

        <table id="showSearch"
				class="table"
				style="margin: 0px auto">
		</table>
		
		 <table id="idSearch"
				class="table"
				style="margin: 0px auto">
		</table>
<script type="text/javascript">


function adminSearch(){

 $('#showSearch').bootstrapTable('destroy').bootstrapTable({
	 ajax : function(request) {
		 
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
	sidePagination : 'client',//server:服务器端分页|client：前端分页
	pageSize : 5,//单页记录数
	pageList : [ 5, 10 ],//可选择单页记录数
	showRefresh : true,//刷新按钮
	detailView:true,
	detailFormatter:"detailFormatter",
	columns : [
		{
		title : 'ID',
		field : 'id',
		sortable : true
	}, {
		title : '标题',
		field : 'infotitle',
		sortable : true
	}, {
		title : '联系人',
		field : 'infolinkman',
	}, {
		title : '电话',
		field : 'infophone',
	}, {
		title : '邮箱',
		field : 'infoemail',
	},{
		title : '内容',
		field : 'infocontent',
	},{
		title : '操作',
		field : 'id',
	} ]
}) 
}
function detailFormatter(index, row) {
    var html = [ ]
    $.each(row, function (key, value) {
      html.push('<p><b>' + key + ':</b> ' + value + '</p>')
    })
    return html.join('')
  }
  

function idSearch(){

	 $('#showSearch').bootstrapTable('destroy').bootstrapTable({
		 ajax : function(request) {
			 
			 var id = window.localStorage.getItem("id");
				console.log(id);
				var search = {"id":id};
				var jsonData = JSON.stringify(search);
				var url = "${pageContext.request.contextPath}/info/idSearch"                               	
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
		sidePagination : 'client',//server:服务器端分页|client：前端分页
		pageSize : 5,//单页记录数
		pageList : [ 5, 10, 20, 30 ],//可选择单页记录数
		showRefresh : true,//刷新按钮
		detailView:true,
		detailFormatter:"detailFormatter",
		columns : [
			{
			title : 'ID',
			field : 'id',
			sortable : true
		}, {
			title : '标题',
			field : 'infotitle',
			sortable : true
		}, {
			title : '联系人',
			field : 'infolinkman',
		}, {
			title : '电话',
			field : 'infophone',
		}, {
			title : '邮箱',
			field : 'infoemail',
		},{
			title : '内容',
			field : 'infocontent',
		},{
			title : '是否付费',
			field : 'infopayfor',
			formatter : formatpay,//对返回的数据进行处理再显示
		},{
			title : '是否审核',
			field : 'infocheck',
			formatter : formatcheck,
		},{
			title : '操作',
			field : 'id',
			formatter : operation,//对资源进行操作
		} ]
	}) 
	}
	

	//value代表该列的值，row代表当前对象
	function formatpay(value, row, index) {
		return value == 0 ? "否" : "是";
		//或者 return row.sex == 1 ? "男" : "女";
	}
	
	function formatcheck(value, row, index) {
		return value == 0 ? "否" : "是";
		//或者 return row.sex == 1 ? "男" : "女";
	}
	
	function detailFormatter(index, row) {
	    var html = []
	    $.each(row, function (key, value) {
	      html.push('<p><b>' + key + ':</b> ' + value + '</p>')
	    })
	    return html.join('')
	  }
	
	function operation(value, row, index) {
		var htm = "<button id = 'del' class='btn btn-sm btn-danger' onclick='del(&apos;"
		 	+ row.id
		 	+ "&apos;)'>删除</button>&nbsp;&nbsp;<button class = 'btn btn-sm btn-warning' data-toggle='modal' data-target='#modalTable' onclick = 'showchange(&apos;"
		 	+ row.id
		 	+ "&apos;,&apos;"
		 	+ row.infotitle
		 	+ "&apos;,&apos;"
		 	+ row.infolinkman
		 	+ "&apos;,&apos;"
		 	+ row.infophone
		 	+ "&apos;,&apos;"
		 	+ row.infoemail
		 	+ "&apos;,&apos;"
		 	+ row.infopayfor
		 	+ "&apos;,&apos;"
		 	+ row.infocheck
		 	+ "&apos;,&apos;"
		 	+ row.infocontent
		 	+ "&apos;)'>修改</button>&nbsp;&nbsp;"
		return htm;
		 	}
  
//删除
function del(id){
	var url = "${pageContext.request.contextPath}/info/del";
	var del = {"id":id};
	var jsonData = JSON.stringify(del);
	$.ajax({
			type:"post",
				url:url,
				data:jsonData,
				dataType:"json",
		        contentType : "application/json;charset=UTF-8",
		        success: function(result){
		            console.log(result);
                        if (result.key == "success") {
                            alert("删除成功");
                        } else {
                            alert("删除失败");
                        }
		               $('#showSearch').bootstrapTable('refresh');
		           },
		           error: function(result) {
		               console.log(result);
		           },
	})
}

function showchange(id,infotitle,infolinkman,infophone,infoemail,infopayfor,infocheck,infocontent){
	document.getElementById('id').value=id;
	document.getElementById('infotitle').value=infotitle;
	document.getElementById('infolinkman').value=infolinkman;
	document.getElementById('infophone').value=infophone;
	document.getElementById('infoemail').value=infoemail;
	document.getElementById('infopayfor').value=infopayfor;
	document.getElementById('infocheck').value=infocheck;
	document.getElementById('infocontent').value=infocontent;

}

function change(){
	var url = "${pageContext.request.contextPath}/info/change";
	var id = document.getElementById('id').value;
	var infotitle = document.getElementById('infotitle').value;
	var infolinkman = document.getElementById('infolinkman').value;
	var infophone = document.getElementById('infophone').value;
	var infoemail = document.getElementById('infoemail').value;
	var infocontent = document.getElementById('infocontent').value;
	var infocheck = document.getElementById('infocheck').value;
	var infopayfor = document.getElementById('infopayfor').value;
	var del = {"id":id,"infotitle":infotitle,"infolinkman":infolinkman,"infophone":infophone,"infoemail":infoemail,"infocontent":infocontent,"infopayfor":infopayfor,"infocheck":infocheck};
	var jsonData = JSON.stringify(del);
	$.ajax({
			type:"post",
				url:url,
				data:jsonData,
				dataType:"json",
		        contentType : "application/json;charset=UTF-8",
		        success: function(result){
		            console.log(result);
                        if (result.key == "success") {
                            alert("修改成功");
                        } else {
                            alert("修改失败");
                        }
		               $('#showSearch').bootstrapTable('refresh');
		           },
		           error: function(result) {
		               console.log(result);
		           },
	})
}

  
</script>







        
    </center>
<div id="modalTable" class="modal fade" tabindex="-1" role="dialog">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal table</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      	<input type = "hidden" id = "id" name = id>
		infotitle<input class = "form-control" id = "infotitle">
		infolinkman<input class = "form-control" id = "infolinkman">
		infophone<input class = "form-control" id = "infophone">
		infoemail<input class = "form-control" id = "infoemail">
		infocontent<input class = "form-control" id = "infocontent">
		是否付款<select  id="infopayfor">
			<option value="0" >否</option>
			<option value="1" >是</option>
		</select>
		是否审查<select  id="infocheck">
			<option value="0" >否</option>
			<option value="1" >是</option>
		</select>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick = "change()">修改</button>
      </div>
    </div>
  </div>
</div>
</body>
</html>
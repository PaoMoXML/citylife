<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>都市信息网</title>
<link type="text/css" rel="stylesheet" href="../../css/style.css">
  <script src="../../../js/jquery-3.4.1.min.js"></script>
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
	<iframe src="../../view/left.jsp" frameBorder="0" width="225" scrolling="no" height="400" ></iframe>
	</td>
   <td width="690" height="400" align="center" valign="top" bgcolor="#FFFFFF">        
        <table border="0" width="670" cellspacing="0" cellpadding="0" style="margin-top:5">
       
            <tr height="30"><td style="text-indent:5" valign="bottom"><font color="#004790"><b>■查询结果</b></td></tr>
            <tr height="1"><td></td></tr>
            <tr>
                <td align="center" style="border:1 solid">
                    <table border="0" width="100%" rules="rows" cellspacing="0">
                    
                        <tr align="center" height="30" bgcolor="#F0F0F0">
                            <td width="6%"><b>序号</b></td>
                            <td width="11%"><b>信息类别</b></td>                            
                            <td width="8%"><b>ID值</b></td>
                            <td width="38%"><b>信息标题</b></td>
                            <td width="22%"><b>发布时间</b></td>
                            <td width="15%"><b>联系人</b></td>
                        </tr>
  
						<tr height="30">
							<td align="center"><b>1</b></td>
							<td align="center">招聘信息</td>
							<td style="text-indent:10">134</td>
							<td style="text-indent:5"><a href="info_SingleShow.action?id=134">发布招聘信息标题</a></td>
							<td align="center">2007-12-26 13:58:53</td>                                    
							<td style="text-indent:10">小免</td>
						</tr>
						
						<tr height="30" bgcolor="#F9F9F9">
						
							<td align="center"><b>2</b></td>
							<td align="center">寻找启示</td>
							<td style="text-indent:10">133</td>
							<td style="text-indent:5"><a href="info_SingleShow.action?id=133">发布寻找启示标题</a></td>
							<td align="center">2007-12-26 13:56:49</td>                                    
							<td style="text-indent:10">小免</td>
						</tr>
          
                        
                    </table>
                </td>
            </tr>
            <tr height="1"><td></td></tr>
            <tr height="30"><td align="center">

			
<html>
<head><title>分页导航栏</title></head>
<body>

    <table border="0" width="100%" cellspacing="0">
        <tr>
            <td width="60%"><table border='0' cellpadding='3'><tr><td>每页显示：8/22 条记录！当前页：1/3 页！</td></tr></table></td>
            <td align="center" width="40%"><table border='0' cellpadding='3'><tr><td><a href='info_SearchShow.action?searchInfo.subsql=info_phone&searchInfo.sqlvalue=1&searchInfo.type=like&showType=link&showpage=2'>下一页</a>&nbsp;<a href='info_SearchShow.action?searchInfo.subsql=info_phone&searchInfo.sqlvalue=1&searchInfo.type=like&showType=link&showpage=3'>尾页</a></td></tr></table></td>
        </tr>
    </table>

</body>
</html></td></tr>
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
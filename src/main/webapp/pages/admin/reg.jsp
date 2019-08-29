<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
  <link type="text/css" rel="stylesheet" href="../../css/style.css;">
</head>
<body bgcolor="#E7ECEF">
    <center>
        <form id="log_Login_action" name="log_Login_action" action="${pageContext.request.contextPath}/user/reg" method="get">
            <table border="0" cellspacing="0" cellpadding="0" style="margin-top:130">
                <tr><td><img src="../../images/logon_top.gif"></td></tr>                
                <tr height="180">
                    <td background="../../images/logon_middle.gif" align="center" valign="top">
                         <table border="0" width="90%" cellspacing="0" cellpadding="0">
                             <tr height="50"><td colspan="2"></td></tr>
                             <tr height="30">
                                 <td align="right" width="40%">用户名：&nbsp;&nbsp;</td>
                                 <td style="text-indent:5"><input type="text" name="username" size="30" value="" id="log_Login_action_user_userName"/></td>
                             </tr>                
                             <tr height="30">
                                 <td align="right">密&nbsp;&nbsp;码：&nbsp;&nbsp;</td>
                                 <td style="text-indent:5"><input type="password" name="userpassword" size="30" id="log_Login_action_user_userPassword"/></td>
                             </tr>
                              <tr height="30">
                                 <td align="right">重&nbsp;&nbsp;复&nbsp;&nbsp;密&nbsp;&nbsp;码：&nbsp;&nbsp;</td>
                                 <td style="text-indent:5"><input type="password" name="userpassword2" size="30" id="log_Login_action_user_userPassword"/></td>
                             </tr>
                             <tr height="60">
                                 <td></td>
                                 <td>
								
                                     <input type="submit" id="" value="注册" />

                                     <input type="reset" value="重置"/>

                                     <a id="log_Login_action_" href="../../view/indextemp.jsp">[返回首页]</a>
                                 </td>
                             </tr>
                         </table>
                    </td>
                </tr>
                <tr><td><img src="../../images/logon_end.gif"></td></tr>
            </table>
        </form>



     
    </center>
</body>
</html>
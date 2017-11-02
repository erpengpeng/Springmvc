<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.net.URLDecoder"%>


<html>
<head>
    <title>test</title>
</head>
<body background="../resources/policeLogin.png">

<table>
    <tr height="170">
        <td width="570px"> </td>
        <td> </td>
    </tr>
    <tr>
        <td> </td>
        <td>
            <table>
                <h1 align="center">证书信息</h1><hr />

                <tr>
                    <td>PKI：</td>
                    <td><input id="cookieName" type="text" name="username" value=""  size="21" maxlength="20" /></td>
                    <td > </td>
                    <td> </td>
                </tr>

                </tr>
                <tr>

                </tr>
            </table>
        </td>
    <tr>
        <td> </td>
        <td><table>
            <tr>

                <div style="margin-top:10px;margin-left:48px">
                    <input type="button"  id="police_PKI"   class="btn"  onclick='loadingPolice1()' value="公安PKI登录">
                </div>

            </tr>
            </tr>
        </table>
        </td>
</table>

</form>
</body>
</html>


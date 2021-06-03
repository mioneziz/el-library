<%--
  Created by IntelliJ IDEA.
  User: ivank
  Date: 30.05.2021
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>

</head>
<body>
<div align="center">
    <h1>Login</h1>
    <form action="<%= request.getContextPath()%>/login" method="post">
        <table style="with: 80%">

                <td>Username</td>
                <td><input type="text" name="login" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>


        </table>
        <input type="submit" value="Join"   />
        <input  type="button" value="Sign In" onClick='location.href="/view/registrationForm.jsp"'/>


    </form>
</div>
</body>
</html>
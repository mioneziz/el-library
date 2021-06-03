<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

    <title>el-library</title>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
    <div align="center">
        <h1> Registration form</h1>
        <form action="<%= request.getContextPath()%>/register" method="post">
            <table style="with: 80%">
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstname" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastname" /></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>


            </table>
            <input type="submit" value="Submit" onСlick='location.href="/view/Details.jsp"' />
        </form>
    </div>
    </body>
    </html>
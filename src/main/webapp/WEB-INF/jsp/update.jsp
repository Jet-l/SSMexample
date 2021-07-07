<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html">
    <title>更新</title>
</head>
<body>
<form action="update.do" method="post">
    姓名：<input type="text" name="ename" value="${emp.ename}"><br>
    密码：<input type="password" name="password" value="${emp.password}"><br>
    薪水：<input type="text" name="sal" value="${emp.sal}"><br>
    部门：<input type="text" name="deptName" value="${emp.deptName}"><br>
    <input type="hidden" name="empno" value="${emp.empno}">
    <input type="submit" value="提交">
</form>
</body>
</html>

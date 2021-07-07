<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
        uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>列表</title>
</head>
<body>
    <table border="1" cellspacing="0" width="60%" >
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>薪水</th>
            <th>部门</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="emp">
            <tr>
                <td>${emp.empno}</td>
                <td>${emp.ename}</td>
                <td>${emp.password}</td>
                <td>${emp.sal}</td>
                <td>${emp.deptName}</td>
                <td>删除|<a href="toUpdate.do?empno=${emp.empno }">修改</a></td>
            </tr>
        </c:forEach>

    </table>
    <c:if test="${pageInfo.isFirstPage}">
        上一页
    </c:if>
    <c:if test="${!pageInfo.isFirstPage}">
        <a href="list.do?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>
    总页数:${pageInfo.pages}
    总条数:${pageInfo.total}
    当前页:${pageInfo.pageNum}
    <c:if test="${pageInfo.isLastPage}">
        下一页
    </c:if>
    <c:if test="${!pageInfo.isLastPage}">
        <a href="list.do?pageNum=${pageInfo.nextPage }">下一页</a>
    </c:if>




</body>
</html>

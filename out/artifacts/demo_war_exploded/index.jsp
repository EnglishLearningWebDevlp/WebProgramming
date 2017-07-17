<%--
  Created by IntelliJ IDEA.
  User: 2089769600
  Date: 2017/7/16
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h4>List Page</h4>

  <s:if test="#request.address==null||#request.address.size()==0">
       没有任何信息
  </s:if>
  <s:else>
    <table border="1" cellpadding="2" cellspacing="0">

      <tr>
        <td>ID</td>
        <td>NAME</td>
       <td>PHONE</td>
      </tr>
      <s:iterator value="#request.address">
        <tr>
          <td>${id}</td>
          <td>${name}</td>
          <td>${phone}</td>
        </tr>
      </s:iterator>
    </table>
  </s:else>
  </body>
</html>

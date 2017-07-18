<%--
  Created by IntelliJ IDEA.
  User: 2089769600
  Date: 2017/7/18
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Delete By Id</h4>
<s:form action="delete" namespace="/">
    <s:textfield name="id" label="ID"></s:textfield>

    <div id="delete_button">
        <input type="submit" value="Delete"/>
    </div>
</s:form>
</body>
</html>

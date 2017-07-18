<%--
  Created by IntelliJ IDEA.
  User: 2089769600
  Date: 2017/7/18
  Time: 8:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="insert" namespace="/">
    <s:textfield name="name" label="Name"></s:textfield>
    <s:textfield name="phone" label="Phone"></s:textfield>
    <div id="login_button">
        <input type="submit" value="Insert"/>
    </div>
</s:form>
</body>
</html>

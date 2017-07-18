<%--
  Created by IntelliJ IDEA.
  User: 2089769600
  Date: 2017/7/18
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="update" namespace="/">
    <s:div>Please Input Id Of Row To Be Updated</s:div>
    <s:textfield name="id" label="ID"></s:textfield>
    <s:div>Please Input Name & Phone To Be Revised</s:div>
    <s:textfield name="name" label="NAME"></s:textfield>
    <s:textfield name="phone" label="PHONE"></s:textfield>
    <div id="login_button">
        <input type="submit" value="Update"/>
    </div>
</s:form>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="customer" class="com.fashion.model.domain.Customer"/>
<jsp:setProperty property="*" name="customer"/>

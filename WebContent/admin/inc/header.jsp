<%@page import="com.fashion.model.domain.Admin"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	//로그인에 성공한 사람이라면, 세션에 무언가 담은 사람이다.
	//따라서 이 요청과 관련된 세션을 세션을 얻어와 그 안에 있는
	//데이터를 끄집어 내서, 로그인 서비스를 제공하자!!
	Admin admin=(Admin)session.getAttribute("admin");
	//out.print("반갑습니다 "+admin.getName()+"님");
%>
<div class="subnav">
	<%=admin.getName()%>님 반갑습니다
	<a href="/admin/login/logout.jsp">로그아웃</a>
</div>
<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href="/admin/store">상점관리</a>
  <a href="/admin/sales">매출관리</a>
  <a href="/admin/product">상품관리</a>
  <a href="/admin/member">회원관리</a>
  <a href="/admin/cs">고객센터</a>
</div>









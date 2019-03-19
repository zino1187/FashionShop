<%@ page contentType="text/html; charset=UTF-8"%>
<%
	//배열로 넘어오는 파라미터값들을 받아서 장바구니 1개이상 삭제!!
	String[] cart_id=request.getParameterValues("cart_id");
	
	for(int i=0;i<cart_id.length;i++){
		out.print(cart_id[i]+"<br>");
	}
	
%>
<%@page import="com.fashion.model.domain.Customer"%>
<%@page import="com.fashion.common.Formatter"%>
<%@page import="com.fashion.model.domain.Paymethod"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//상품, 갯수  히든으로 넘어옴
	String[] product_id=request.getParameterValues("product_id");
	String[] ea=request.getParameterValues("ea");
	String total_buy=request.getParameter("total_buy");
	String total_pay=request.getParameter("total_pay");
	String paymethod_id=request.getParameter("paymethod_id");
	Customer cs=(Customer)session.getAttribute("customer");
	//입금자 정보
	String sender=request.getParameter("sender");
	String bank=request.getParameter("bank");
	String email=request.getParameter("email");
	
	
	for(int i=0;i<product_id.length;i++){
		System.out.println("product_id["+i+"]  값은 "+product_id[i]+", ea["+i+"]값은 "+ea[i]);
	}
	System.out.println("total_buy"+total_buy);
	System.out.println("total_pay"+total_pay);
	System.out.println("paymethod_id"+paymethod_id);
	System.out.println("customer_id"+cs.getCustomer_id());
	System.out.println("sender"+sender);
	System.out.println("bank"+bank);
	System.out.println("email"+email);

%>
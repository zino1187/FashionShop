<%@page import="com.fashion.model.domain.Product"%>
<%@page import="com.fashion.model.domain.Customer"%>
<%@page import="com.fashion.model.domain.Cart"%>
<%@page import="com.fashion.model.repository.CartDAO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%! CartDAO cartDAO = new CartDAO(); %>
<%
	//클라이언트의 장바구니 담기 요청을 처리한다!!
	
	String product_id=request.getParameter("product_id");//what
	String ea=request.getParameter("ea");//how much
		
	System.out.println("넘겨받은 상품 id는 "+product_id);
	System.out.println("넘겨받은 갯수는 "+ea);
	
	Cart cart=new Cart();
	Customer customer =new Customer();
	Product product = new Product();
	
	customer.setCustomer_id(1); //추후 변경 예정 
	product.setProduct_id(Integer.parseInt(product_id));
	cart.setEa(Integer.parseInt(ea));
	cart.setCustomer(customer);
	cart.setProduct(product);
	
	int result=cartDAO.insert(cart);
	out.print(result);
%>

















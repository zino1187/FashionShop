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
	Product product = new Product();
	
	//로그인 한 유저로부터 customer_id 추출한다 (retrieve)
	Customer customer=(Customer)session.getAttribute("customer");
	product.setProduct_id(Integer.parseInt(product_id));
	cart.setEa(Integer.parseInt(ea));
	cart.setCustomer(customer);
	cart.setProduct(product);
	
	//장바구니에 이미 동일한 제품이 담겨 있을 경우, 레코드를 증가시키면 안되고
	//갯수를 증가시키자!!
	Cart ct=cartDAO.selectByProductId(cart);
	
	int result=0;
	
	if(ct!=null){ //이미 등록된 상품이 있다면...갯수를 update 해줘야 함
		result=cartDAO.updateCart(ct.getCart_id());
	}else{
		result=cartDAO.insert(cart);
	}	
	out.print(result);
%>

















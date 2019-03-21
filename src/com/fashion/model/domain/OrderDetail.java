package com.fashion.model.domain;

public class OrderDetail {
	private int order_detail_id;
	private OrderSummary orderSummary; //ass
	private Product product;//ass
	private int ea;
	
	public int getOrder_detail_id() {
		return order_detail_id;
	}
	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}
	public OrderSummary getOrderSummary() {
		return orderSummary;
	}
	public void setOrderSummary(OrderSummary orderSummary) {
		this.orderSummary = orderSummary;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	
}

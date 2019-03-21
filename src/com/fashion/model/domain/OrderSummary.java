package com.fashion.model.domain;

public class OrderSummary {
	private int order_summary_id;
	private Customer customer; //ass
	private int total_buy;
	private int total_pay;
	private String order_date;
	private Paymethod paymethod; //ass
	
	public int getOrder_summary_id() {
		return order_summary_id;
	}
	public void setOrder_summary_id(int order_summary_id) {
		this.order_summary_id = order_summary_id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getTotal_buy() {
		return total_buy;
	}
	public void setTotal_buy(int total_buy) {
		this.total_buy = total_buy;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public Paymethod getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(Paymethod paymethod) {
		this.paymethod = paymethod;
	}
	
	
	
}

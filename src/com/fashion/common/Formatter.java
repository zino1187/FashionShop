package com.fashion.common;

import java.text.NumberFormat;

//통화표시 등을 처리해 주는 클래스 
public class Formatter {
	//원 표시를 포함한 통화표시 반환 메서드 
	public static String getCurrency(int num){
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		return nf.format(num);
	}
	/*
	 * public static void main(String[] args) {
	 * System.out.println(getCurrency(50000)); }
	 * 
	 */
}







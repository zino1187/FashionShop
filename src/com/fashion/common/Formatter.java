package com.fashion.common;

import java.text.NumberFormat;

//��ȭǥ�� ���� ó���� �ִ� Ŭ���� 
public class Formatter {
	//�� ǥ�ø� ������ ��ȭǥ�� ��ȯ �޼��� 
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







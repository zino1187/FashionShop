package com.fashion.common;

//예외 객체를 개발자가 정의할 수도 있다!!
// 예외)  1) catched Exception(강요된 예외)  2) Runtime Exception    
public class DuplicatedException extends RuntimeException{
	public DuplicatedException(String msg) {
		super(msg);
	}
}












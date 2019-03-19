package com.fashion.common;

public class FileManager{
	/*확장자를 반환하는 메서드*/
	public static String getExt(String path){
		int lastIndex=path.lastIndexOf(".");
		return path.substring(lastIndex+1, path.length());
	}
}
package com.fashion.mybatis.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//SqlSession 을 얻어갈 수 있도록 SqlSessionFactory 의 인스턴스를 
//얻기 위한 설정객체
public class ConfigManager {
	private static ConfigManager instance=new ConfigManager();
	//factory 메서드 패턴 ? 인스턴스를 자바 클래스내에서 생성하지말고
	//제3의 외부 클래스에서 인스턴스를 생성하는 객체 정의 기법
	SqlSessionFactory factory;
	InputStream is;
	
	private ConfigManager() {
		try {
			is=Resources.getResourceAsStream("com/fashion/mybatis/config/config.xml");
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ConfigManager getInstance() {
		return instance;
	}
	
	//SqlSession 얻기 
	public SqlSession getSqlSession() {
		return factory.openSession();
	}
	//SqlSession 닫기 
	public void release(SqlSession sqlSession) {
		sqlSession.close();
	}
	
}














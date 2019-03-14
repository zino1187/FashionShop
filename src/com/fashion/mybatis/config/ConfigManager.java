package com.fashion.mybatis.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//SqlSession �� �� �� �ֵ��� SqlSessionFactory �� �ν��Ͻ��� 
//��� ���� ������ü
public class ConfigManager {
	private static ConfigManager instance=new ConfigManager();
	//factory �޼��� ���� ? �ν��Ͻ��� �ڹ� Ŭ���������� ������������
	//��3�� �ܺ� Ŭ�������� �ν��Ͻ��� �����ϴ� ��ü ���� ���
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
	
	//SqlSession ��� 
	public SqlSession getSqlSession() {
		return factory.openSession();
	}
	//SqlSession �ݱ� 
	public void release(SqlSession sqlSession) {
		sqlSession.close();
	}
	
}














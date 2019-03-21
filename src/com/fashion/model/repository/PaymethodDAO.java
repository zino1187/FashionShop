package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.mybatis.config.ConfigManager;

public class PaymethodDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	public List selectAll() {
		SqlSession sqlSession=manager.getSqlSession();
		List list=sqlSession.selectList("Paymethod.selectAll");
		manager.release(sqlSession);
		return list;
	}
}











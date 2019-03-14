package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.mybatis.config.ConfigManager;

public class TopcategoryDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//모든 카테고리 가져오기!!
	public List selectAll() {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Topcategory.selectAll");
		manager.release(sqlSession);
		return list;
	}
	
}











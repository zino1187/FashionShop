package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.mybatis.config.ConfigManager;

public class SubcategoryDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//�μ��� �ѱ� ����id�� �Ҽӵ� ����ī�װ� ��������!!
	public List selectAllByFk(int topcategory_id){
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Subcategory.selectAllByFk", topcategory_id);
		manager.release(sqlSession);
		return list;
	}
	
}









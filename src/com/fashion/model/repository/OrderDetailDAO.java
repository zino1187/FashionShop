package com.fashion.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.OrderDetail;
import com.fashion.mybatis.config.ConfigManager;

public class OrderDetailDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	public int insert(OrderDetail orderDetail){
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("OrderDetail.insert", orderDetail);
		sqlSession.commit();
		manager.release(sqlSession);
		return result;
	}
}







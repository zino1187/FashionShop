package com.fashion.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.OrderSummary;
import com.fashion.mybatis.config.ConfigManager;

public class OrderSummaryDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//주문 요약 insert 
	public int insert(OrderSummary orderSummary) {
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("OrderSummary.insert", orderSummary);
		sqlSession.commit();
		manager.release(sqlSession);
		return result;
	}
}











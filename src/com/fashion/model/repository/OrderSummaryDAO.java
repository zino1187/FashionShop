package com.fashion.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.OrderSummary;
import com.fashion.mybatis.config.ConfigManager;

public class OrderSummaryDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//�ֹ� ��� insert 
	public int insert(OrderSummary orderSummary) {
		SqlSession sqlSession=manager.getSqlSession();
		sqlSession.insert("OrderSummary.insert", orderSummary);
		sqlSession.commit();
		manager.release(sqlSession);
		return orderSummary.getOrder_summary_id();
	}
}











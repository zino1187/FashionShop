package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.Cart;
import com.fashion.mybatis.config.ConfigManager;

public class CartDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	public int insert(Cart cart) {
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("Cart.insert", cart);
		sqlSession.commit();
		manager.release(sqlSession);
		return result;
	}
	
	//회원의 장바구니 목록 가져오기 
	public List selectByCustomer(int customer_id) {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Cart.selectByCustomer", customer_id);
		manager.release(sqlSession);
		return list;
	}
	
	//삭제 
	public int delete(int cart_id) {
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.delete("Cart.delete", cart_id);
		sqlSession.commit();
		manager.release(sqlSession);
		return result;
	}
}









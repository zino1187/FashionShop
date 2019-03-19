package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.Product;
import com.fashion.mybatis.config.ConfigManager;

public class ProductDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//상품 1건 등록 
	public int insert(Product product){
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("Product.insert", product);
		sqlSession.commit();//DML 인 경우 트랜잭션 처리해줘야 함!!
		manager.release(sqlSession);
		return result;
	}
	//모든 상품 가져오기 
	public List selectAll() {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Product.selectAll");
		manager.release(sqlSession);
		return list;
	}
	//하위카테고리에 소속된 상품 가져오기 
	public List selectAllByFkey(int subcategory_id) {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Product.selectAllByFkey",subcategory_id);
		manager.release(sqlSession);
		return list;
	}
	
	//상품 한건 가져오기 
	public Product select(int product_id) {
		SqlSession sqlSession=manager.getSqlSession();
		Product product=sqlSession.selectOne("Product.select", product_id);
		manager.release(sqlSession);
		return product;		
	}
}














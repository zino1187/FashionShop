package com.fashion.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.Product;
import com.fashion.mybatis.config.ConfigManager;

public class ProductDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//��ǰ 1�� ��� 
	public int insert(Product product){
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("Product.insert", product);
		sqlSession.commit();//DML �� ��� Ʈ����� ó������� ��!!
		manager.release(sqlSession);
		return result;
	}
	//��� ��ǰ �������� 
	public List selectAll() {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Product.selectAll");
		manager.release(sqlSession);
		return list;
	}
	//����ī�װ��� �Ҽӵ� ��ǰ �������� 
	public List selectAllByFkey(int subcategory_id) {
		List list=null;
		SqlSession sqlSession=manager.getSqlSession();
		list=sqlSession.selectList("Product.selectAllByFkey",subcategory_id);
		manager.release(sqlSession);
		return list;
	}
	
	//��ǰ �Ѱ� �������� 
	public Product select(int product_id) {
		SqlSession sqlSession=manager.getSqlSession();
		Product product=sqlSession.selectOne("Product.select", product_id);
		manager.release(sqlSession);
		return product;		
	}
}














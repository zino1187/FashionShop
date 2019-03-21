package com.fashion.model.repository;

import java.util.List;

import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import com.fashion.common.DuplicatedException;
import com.fashion.model.domain.Customer;
import com.fashion.mybatis.config.ConfigManager;

public class CustomerDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//중복 아이디 체크
	public void checkId(Customer customer) throws DuplicatedException{
		SqlSession sqlSession=manager.getSqlSession();
		List cs=sqlSession.selectList("Customer.checkId", customer);
		
		if(cs.size() > 0) {
			//문제...
			//예외발생 시키기!!
			throw new DuplicatedException("이미 존재하는 ID입니다");
		}
	}
	
	//회원가입 
	public int insert(Customer customer){
		int result=0;
		SqlSession sqlSession=manager.getSqlSession();
		result=sqlSession.insert("Customer.insert", customer);
		sqlSession.commit();
		manager.release(sqlSession);
		return result;
	}
	
	public Customer login(Customer customer) {
		SqlSession sqlSession=manager.getSqlSession();
		Customer cs=sqlSession.selectOne("Customer.login", customer);
		manager.release(sqlSession);
		return cs; 
	}
}












package com.fashion.model.repository;

import org.apache.ibatis.session.SqlSession;

import com.fashion.model.domain.Admin;
import com.fashion.mybatis.config.ConfigManager;

public class AdminDAO {
	ConfigManager manager=ConfigManager.getInstance();
	
	//�α��� üũ 
	public Admin loginCheck(Admin admin) {
		SqlSession sqlSession=manager.getSqlSession();
		Admin obj=sqlSession.selectOne("Admin.loginCheck", admin);
		return obj;
	}
}










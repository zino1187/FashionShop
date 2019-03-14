package com.itbank.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.itbank.db.pool.MybatisOracleManager;
import com.itbank.model.domain.Member;

//�� Ŭ������ ������ DAO �̴�, �� CRUD�� jdbc�� �ƴ� mybatis��
//����� ���̴�..
public class OracleMybatisMemberDAO implements MemberDAO{
	MybatisOracleManager manager=MybatisOracleManager.getInstance();
	
	public int insert(Member member) {
		int result=0;
		//�Ŵ����κ��� ������ ��´�?? SqlSession �� ����? ���� ���ఴü
		SqlSession sqlSession=manager.getSession();
		result=sqlSession.insert("Member.insert", member);
		sqlSession.commit();//Ʈ����� Ȯ�� DML(insert, update, delete)
		manager.release(sqlSession);
		return result;
	}
	public List selectAll(){
		List list=null;
		SqlSession sqlSession=manager.getSession();
		list=sqlSession.selectList("Member.selectAll");
		manager.release(sqlSession);
		return list;
	}
	@Override
	public Member select(int member_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(int member_id) {
		// TODO Auto-generated method stub
		return 0;
	}
}














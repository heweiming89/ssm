package cn.heweiming.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.heweiming.ssm.model.User;
import cn.heweiming.ssm.service.BaseService;

public class BaseServiceImpl<R, E, M> implements BaseService<R, E> {

	@Override
	public long countByExample(E example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(E example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(R record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(R record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<R> selectByExample(E example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(R record, E example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(R record, E example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(R record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(R record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

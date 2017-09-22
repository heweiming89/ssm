package cn.heweiming.ssm.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import cn.heweiming.ssm.model.User;

public interface BaseService<R, E> {

	long countByExample(E example);

	int deleteByExample(E example);

	int deleteByPrimaryKey(Integer id);

	int insert(R record);

	int insertSelective(R record);

	List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds);

	List<R> selectByExample(E example);

	User selectByPrimaryKey(Integer id);

	int updateByExampleSelective(R record, E example);

	int updateByExample(R record, E example);

	int updateByPrimaryKeySelective(R record);

	int updateByPrimaryKey(R record);

}

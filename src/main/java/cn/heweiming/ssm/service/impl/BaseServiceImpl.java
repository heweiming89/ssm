package cn.heweiming.ssm.service.impl;

import cn.heweiming.ssm.mybatis.base.BaseMapper;
import cn.heweiming.ssm.service.BaseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<R, E, M extends BaseMapper<R, E>> implements BaseService<R, E> {

    @Autowired
    protected M mapper;

    @Override
    public long countByExample(E example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(E example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(R record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(R record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds) {
        return mapper.selectByExampleWithRowbounds(example, rowBounds);
    }

    @Override
    public List<R> selectByExample(E example) {
        return mapper.selectByExample(example);
    }

    @Override
    public R selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(R record, E example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(R record, E example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(R record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(R record) {
        return mapper.updateByPrimaryKey(record);
    }

}

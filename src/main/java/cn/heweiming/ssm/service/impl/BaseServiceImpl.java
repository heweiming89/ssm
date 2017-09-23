package cn.heweiming.ssm.service.impl;

import cn.heweiming.ssm.mybatis.base.BaseMapper;
import cn.heweiming.ssm.service.BaseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author heweiming  2017年9月23日 下午5:18:11
 * @version 1.0.0
 * @description 
 */
public class BaseServiceImpl<R, E, M extends BaseMapper<R, E>> implements BaseService<R, E> {

    @Autowired
    protected M mapper;

    @Override
    public long countByExample(E example) {
        return mapper.countByExample(example);
    }

    @Override
    @Transactional
    public int deleteByExample(E example) {
        return mapper.deleteByExample(example);
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(R record) {
        return mapper.insert(record);
    }

    @Override
    @Transactional
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
    @Transactional
    public int updateByExampleSelective(R record, E example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    @Transactional
    public int updateByExample(R record, E example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(R record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(R record) {
        return mapper.updateByPrimaryKey(record);
    }

}

package cn.heweiming.ssm.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface BaseMapper<R, E> {

    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Integer id);

    int insert(R record);

    int insertSelective(R record);

    List<R> selectByExampleWithRowbounds(E example, RowBounds rowBounds);

    List<R> selectByExample(E example);

    R selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") R record, @Param("example") E example);

    int updateByExample(@Param("record") R record, @Param("example") E example);

    int updateByPrimaryKeySelective(R record);

    int updateByPrimaryKey(R record);

}

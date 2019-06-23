package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Shangjia;
import org.mypro.entity.ShangjiaExample;

public interface ShangjiaMapper {
    long countByExample(ShangjiaExample example);

    int deleteByExample(ShangjiaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shangjia record);

    int insertSelective(Shangjia record);

    List<Shangjia> selectByExample(ShangjiaExample example);

    Shangjia selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shangjia record, @Param("example") ShangjiaExample example);

    int updateByExample(@Param("record") Shangjia record, @Param("example") ShangjiaExample example);

    int updateByPrimaryKeySelective(Shangjia record);

    int updateByPrimaryKey(Shangjia record);
}
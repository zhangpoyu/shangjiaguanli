package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Dingdan;
import org.mypro.entity.DingdanExample;

public interface DingdanMapper {
    long countByExample(DingdanExample example);

    int deleteByExample(DingdanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dingdan record);

    int insertSelective(Dingdan record);

    List<Dingdan> selectByExample(DingdanExample example);

    Dingdan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dingdan record, @Param("example") DingdanExample example);

    int updateByExample(@Param("record") Dingdan record, @Param("example") DingdanExample example);

    int updateByPrimaryKeySelective(Dingdan record);

    int updateByPrimaryKey(Dingdan record);
}
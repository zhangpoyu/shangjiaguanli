package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Pingjia;
import org.mypro.entity.PingjiaExample;

public interface PingjiaMapper {
    long countByExample(PingjiaExample example);

    int deleteByExample(PingjiaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pingjia record);

    int insertSelective(Pingjia record);

    List<Pingjia> selectByExample(PingjiaExample example);

    Pingjia selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pingjia record, @Param("example") PingjiaExample example);

    int updateByExample(@Param("record") Pingjia record, @Param("example") PingjiaExample example);

    int updateByPrimaryKeySelective(Pingjia record);

    int updateByPrimaryKey(Pingjia record);
}
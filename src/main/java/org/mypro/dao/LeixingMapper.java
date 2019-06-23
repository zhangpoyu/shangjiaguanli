package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Leixing;
import org.mypro.entity.LeixingExample;

public interface LeixingMapper {
    long countByExample(LeixingExample example);

    int deleteByExample(LeixingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leixing record);

    int insertSelective(Leixing record);

    List<Leixing> selectByExample(LeixingExample example);

    Leixing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leixing record, @Param("example") LeixingExample example);

    int updateByExample(@Param("record") Leixing record, @Param("example") LeixingExample example);

    int updateByPrimaryKeySelective(Leixing record);

    int updateByPrimaryKey(Leixing record);
}
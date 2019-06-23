package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Gouwuche;
import org.mypro.entity.GouwucheExample;

public interface GouwucheMapper {
    long countByExample(GouwucheExample example);

    int deleteByExample(GouwucheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Gouwuche record);

    int insertSelective(Gouwuche record);

    List<Gouwuche> selectByExample(GouwucheExample example);

    Gouwuche selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Gouwuche record, @Param("example") GouwucheExample example);

    int updateByExample(@Param("record") Gouwuche record, @Param("example") GouwucheExample example);

    int updateByPrimaryKeySelective(Gouwuche record);

    int updateByPrimaryKey(Gouwuche record);
}
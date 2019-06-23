package org.mypro.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mypro.entity.Shangping;
import org.mypro.entity.ShangpingExample;

public interface ShangpingMapper {
    long countByExample(ShangpingExample example);

    int deleteByExample(ShangpingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shangping record);

    int insertSelective(Shangping record);

    List<Shangping> selectByExample(ShangpingExample example);

    Shangping selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shangping record, @Param("example") ShangpingExample example);

    int updateByExample(@Param("record") Shangping record, @Param("example") ShangpingExample example);

    int updateByPrimaryKeySelective(Shangping record);

    int updateByPrimaryKey(Shangping record);

	List<Shangping> cainixihuan(Shangping shangping1);
}
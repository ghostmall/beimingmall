package cn.ptms.tike.mapper;

import cn.ptms.tike.entity.RunOrderForm;
import cn.ptms.tike.entity.RunOrderFormExample;
import cn.ptms.tike.entity.RunOrderFormKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RunOrderFormMapper {
    int countByExample(RunOrderFormExample example);

    int deleteByExample(RunOrderFormExample example);

    int deleteByPrimaryKey(RunOrderFormKey key);

    int insert(RunOrderForm record);

    int insertSelective(RunOrderForm record);

    List<RunOrderForm> selectByExample(RunOrderFormExample example);

    RunOrderForm selectByPrimaryKey(RunOrderFormKey key);

    int updateByExampleSelective(@Param("record") RunOrderForm record, @Param("example") RunOrderFormExample example);

    int updateByExample(@Param("record") RunOrderForm record, @Param("example") RunOrderFormExample example);

    int updateByPrimaryKeySelective(RunOrderForm record);

    int updateByPrimaryKey(RunOrderForm record);
}
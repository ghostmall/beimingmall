package cn.ptms.tike.mapper;

import cn.ptms.tike.entity.SubOrderForm;
import cn.ptms.tike.entity.SubOrderFormExample;
import cn.ptms.tike.entity.SubOrderFormKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubOrderFormMapper {
    int countByExample(SubOrderFormExample example);

    int deleteByExample(SubOrderFormExample example);

    int deleteByPrimaryKey(SubOrderFormKey key);

    int insert(SubOrderForm record);

    int insertSelective(SubOrderForm record);

    List<SubOrderForm> selectByExample(SubOrderFormExample example);

    SubOrderForm selectByPrimaryKey(SubOrderFormKey key);

    int updateByExampleSelective(@Param("record") SubOrderForm record, @Param("example") SubOrderFormExample example);

    int updateByExample(@Param("record") SubOrderForm record, @Param("example") SubOrderFormExample example);

    int updateByPrimaryKeySelective(SubOrderForm record);

    int updateByPrimaryKey(SubOrderForm record);
}
package cn.ptms.tike.mapper;

import cn.ptms.tike.entity.SecInfoSheet;
import cn.ptms.tike.entity.SecInfoSheetExample;
import cn.ptms.tike.entity.SecInfoSheetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecInfoSheetMapper {
    int countByExample(SecInfoSheetExample example);

    int deleteByExample(SecInfoSheetExample example);

    int deleteByPrimaryKey(SecInfoSheetKey key);

    int insert(SecInfoSheet record);

    int insertSelective(SecInfoSheet record);

    List<SecInfoSheet> selectByExample(SecInfoSheetExample example);

    SecInfoSheet selectByPrimaryKey(SecInfoSheetKey key);

    int updateByExampleSelective(@Param("record") SecInfoSheet record, @Param("example") SecInfoSheetExample example);

    int updateByExample(@Param("record") SecInfoSheet record, @Param("example") SecInfoSheetExample example);

    int updateByPrimaryKeySelective(SecInfoSheet record);

    int updateByPrimaryKey(SecInfoSheet record);
}
package cn.art.dao;

import cn.art.model.OutLineType;

public interface OutLineTypeMapper {
    int deleteByPrimaryKey(Integer otid);

    int insert(OutLineType record);

    int insertSelective(OutLineType record);

    OutLineType selectByPrimaryKey(Integer otid);

    int updateByPrimaryKeySelective(OutLineType record);

    int updateByPrimaryKey(OutLineType record);
}
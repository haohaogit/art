package cn.art.dao;

import java.util.List;
import java.util.Map;

import cn.art.model.OutLine;

public interface OutLineMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);
    List<OutLine> selectByTIDandOTID(Map map);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);
}
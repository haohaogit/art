package cn.art.dao;

import cn.art.model.OutLine;

public interface OutLineMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);
}
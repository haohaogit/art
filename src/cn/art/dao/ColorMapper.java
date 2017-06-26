package cn.art.dao;

import cn.art.model.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}
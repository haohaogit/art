package cn.art.dao;

import java.util.List;

import cn.art.model.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer cid);
    List<Color> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}
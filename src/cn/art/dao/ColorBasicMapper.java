package cn.art.dao;

import cn.art.model.ColorBasic;

public interface ColorBasicMapper {
    int deleteByPrimaryKey(Integer cbid);

    int insert(ColorBasic record);

    int insertSelective(ColorBasic record);

    ColorBasic selectByPrimaryKey(Integer cbid);

    int updateByPrimaryKeySelective(ColorBasic record);

    int updateByPrimaryKey(ColorBasic record);
}
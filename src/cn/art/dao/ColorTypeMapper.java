package cn.art.dao;

import cn.art.model.ColorType;

public interface ColorTypeMapper {
    int deleteByPrimaryKey(Integer cbid);

    int insert(ColorType record);

    int insertSelective(ColorType record);

    ColorType selectByPrimaryKey(Integer cbid);

    int updateByPrimaryKeySelective(ColorType record);

    int updateByPrimaryKey(ColorType record);
}
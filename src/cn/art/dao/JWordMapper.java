package cn.art.dao;

import cn.art.model.JWord;

public interface JWordMapper {
    int deleteByPrimaryKey(Integer jwid);

    int insert(JWord record);

    int insertSelective(JWord record);

    JWord selectByPrimaryKey(Integer jwid);

    int updateByPrimaryKeySelective(JWord record);

    int updateByPrimaryKey(JWord record);
}
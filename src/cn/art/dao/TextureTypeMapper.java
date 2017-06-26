package cn.art.dao;

import cn.art.model.TextureType;

public interface TextureTypeMapper {
    int deleteByPrimaryKey(Integer ttid);

    int insert(TextureType record);

    int insertSelective(TextureType record);

    TextureType selectByPrimaryKey(Integer ttid);

    int updateByPrimaryKeySelective(TextureType record);

    int updateByPrimaryKey(TextureType record);
}
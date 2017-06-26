package cn.art.dao;

import cn.art.model.Texture;

public interface TextureMapper {
    int deleteByPrimaryKey(Integer textureid);

    int insert(Texture record);

    int insertSelective(Texture record);

    Texture selectByPrimaryKey(Integer textureid);

    int updateByPrimaryKeySelective(Texture record);

    int updateByPrimaryKey(Texture record);
}
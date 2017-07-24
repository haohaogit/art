package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Texture;

public interface TextureService {
	int deleteByPrimaryKey(Integer textureid);

    int insert(Texture record);

    int insertSelective(Texture record);

    Texture selectByPrimaryKey(Integer textureid);
    List<Texture> selectByTIDandTTID(Map map);

    int updateByPrimaryKeySelective(Texture record);

    int updateByPrimaryKey(Texture record);

}

package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Texture;
import cn.art.util.pojo.textureB;

public interface TextureService {
	int deleteByPrimaryKey(Integer textureid);

    int insert(Texture record);

    int insertSelective(Texture record);

    Texture selectByPrimaryKey(Integer textureid);
    List<Texture> selectByTIDandTTID(Map map);
    List<Texture> selectByTID(Integer tid);
    
    List<Texture> selectByName1(String tdescription);
    String selectByName(String tdescription);
    int CountNumByName(String tdescription);

    int updateByPrimaryKeySelective(Texture record);

    int updateByPrimaryKey(Texture record);
    
    String selectTextureD(Integer textureid);
    int update(Integer textureid,String tdescription,String ttname,
    		String timg,String timg1,String timg2,String timg3,String timg4);
    int insertSelect(Integer tid,String tdescription,String ttname,
    		String timg,String timg1,String timg2,String timg3,String timg4);
    
    String getTextureBasic(Integer tid);
    List<textureB> getTextureBasic1(Integer tid);
    String getTextureBasic4(Integer tid);

}

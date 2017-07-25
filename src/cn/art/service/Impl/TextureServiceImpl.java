package cn.art.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.TextureMapper;
import cn.art.model.Texture;
import cn.art.service.TextureService;

@Service("TextureService")
public class TextureServiceImpl implements TextureService {
	private TextureMapper textureMapper;

	public TextureMapper getTextureMapper() {
		return textureMapper;
	}
	@Autowired
	public void setTextureMapper(TextureMapper textureMapper) {
		this.textureMapper = textureMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer textureid) {
		// TODO Auto-generated method stub
		return textureMapper.deleteByPrimaryKey(textureid);
	}

	@Override
	public int insert(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.insert(record);
	}

	@Override
	public int insertSelective(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.insertSelective(record);
	}

	@Override
	public Texture selectByPrimaryKey(Integer textureid) {
		// TODO Auto-generated method stub
		return textureMapper.selectByPrimaryKey(textureid);
	}

	@Override
	public List<Texture> selectByTIDandTTID(Map map) {
		// TODO Auto-generated method stub
		return textureMapper.selectByTIDandTTID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Texture record) {
		// TODO Auto-generated method stub
		return textureMapper.updateByPrimaryKey(record);
	}

}

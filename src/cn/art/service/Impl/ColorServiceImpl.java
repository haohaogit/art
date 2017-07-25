package cn.art.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.ColorMapper;
import cn.art.model.Color;
import cn.art.service.ColorService;
@Service("ColorService")
public class ColorServiceImpl implements ColorService {
	private ColorMapper colorMapper;

	public ColorMapper getColorMapper() {
		return colorMapper;
	}
	@Autowired
	public void setColorMapper(ColorMapper colorMapper) {
		this.colorMapper = colorMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return colorMapper.deleteByPrimaryKey(cid);
	}

	@Override
	public int insert(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.insert(record);
	}

	@Override
	public int insertSelective(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.insertSelective(record);
	}

	@Override
	public Color selectByPrimaryKey(Integer cid) {
		// TODO Auto-generated method stub
		return colorMapper.selectByPrimaryKey(cid);
	}

	@Override
	public List<Color> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return colorMapper.selectByTID(tid);
	}

	@Override
	public List<Color> selectByTIDandCBID(Map map) {
		// TODO Auto-generated method stub
		return colorMapper.selectByTIDandCBID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Color record) {
		// TODO Auto-generated method stub
		return colorMapper.updateByPrimaryKey(record);
	}

}

package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.art.dao.OutLineMapper;
import cn.art.model.OutLine;
import cn.art.service.OutLineService;

public class OutLineServiceImpl implements OutLineService {
	private OutLineMapper outLineMapper;

	public OutLineMapper getOutLineMapper() {
		return outLineMapper;
	}
	@Autowired
	public void setOutLineMapper(OutLineMapper outLineMapper) {
		this.outLineMapper = outLineMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return outLineMapper.deleteByPrimaryKey(oid);
	}

	@Override
	public int insert(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.insert(record);
	}

	@Override
	public int insertSelective(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.insertSelective(record);
	}

	@Override
	public OutLine selectByPrimaryKey(Integer oid) {
		// TODO Auto-generated method stub
		return outLineMapper.selectByPrimaryKey(oid);
	}

	@Override
	public List<OutLine> selectByTIDandOTID(Integer oid, Integer otid) {
		// TODO Auto-generated method stub
		return outLineMapper.selectByTIDandOTID(oid, otid);
	}

	@Override
	public int updateByPrimaryKeySelective(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OutLine record) {
		// TODO Auto-generated method stub
		return outLineMapper.updateByPrimaryKey(record);
	}

}

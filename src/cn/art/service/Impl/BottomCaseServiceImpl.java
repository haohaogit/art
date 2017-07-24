package cn.art.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.art.dao.BottomCaseMapper;
import cn.art.model.BottomCase;
import cn.art.service.BottomCaseService;

public class BottomCaseServiceImpl implements BottomCaseService {
	private BottomCaseMapper bottomCaseMapper;

	public BottomCaseMapper getBottomCaseMapper() {
		return bottomCaseMapper;
	}
	@Autowired
	public void setBottomCaseMapper(BottomCaseMapper bottomCaseMapper) {
		this.bottomCaseMapper = bottomCaseMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.deleteByPrimaryKey(bcid);
	}

	@Override
	public int insert(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insertSelective(record);
	}

	@Override
	public BottomCase selectByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByPrimaryKey(bcid);
	}

	@Override
	public List<BottomCase> selectByTIDandBCTID(Map map) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByTIDandBCTID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKey(record);
	}

}

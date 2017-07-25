package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.NewCaseMapper;
import cn.art.model.NewCase;
import cn.art.service.NewCaseService;


@Service("NewCaseService")
public class NewCaseServiceImpl implements NewCaseService {
	private NewCaseMapper newCaseMapper;

	public NewCaseMapper getNewCaseMapper() {
		return newCaseMapper;
	}
	@Autowired
	public void setNewCaseMapper(NewCaseMapper newCaseMapper) {
		this.newCaseMapper = newCaseMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer newcaseid) {
		// TODO Auto-generated method stub
		return newCaseMapper.deleteByPrimaryKey(newcaseid);
	}

	@Override
	public int insert(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insertSelective(record);
	}

	@Override
	public NewCase selectByPrimaryKey(Integer newcaseid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByPrimaryKey(newcaseid);
	}

	@Override
	public List<NewCase> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKey(record);
	}

}

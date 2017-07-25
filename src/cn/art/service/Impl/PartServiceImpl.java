package cn.art.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.PartMapper;
import cn.art.model.Part;
import cn.art.service.PartService;

@Service("PartService")
public class PartServiceImpl implements PartService {
	private PartMapper partMapper;

	public PartMapper getPartMapper() {
		return partMapper;
	}
	@Autowired
	public void setPartMapper(PartMapper partMapper) {
		this.partMapper = partMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return partMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public int insert(Part record) {
		// TODO Auto-generated method stub
		return partMapper.insert(record);
	}

	@Override
	public int insertSelective(Part record) {
		// TODO Auto-generated method stub
		return partMapper.insertSelective(record);
	}

	@Override
	public Part selectByPrimaryKey(Integer pid) {
		// TODO Auto-generated method stub
		return partMapper.selectByPrimaryKey(pid);
	}

	@Override
	public List<Part> selectByTIDandPBID(Map map) {
		// TODO Auto-generated method stub
		return partMapper.selectByTIDandPBID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(Part record) {
		// TODO Auto-generated method stub
		return partMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Part record) {
		// TODO Auto-generated method stub
		return partMapper.updateByPrimaryKey(record);
	}

}

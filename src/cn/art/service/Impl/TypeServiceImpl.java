package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.art.dao.TypeMapper;
import cn.art.model.Type;
import cn.art.service.TypeService;

public class TypeServiceImpl implements TypeService {
	private TypeMapper typeMapper;

	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return typeMapper.deleteByPrimaryKey(tid);
	}

	@Override
	public int insert(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insert(record);
	}

	@Override
	public int insertSelective(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.insertSelective(record);
	}

	@Override
	public Type selectByPrimaryKey(Integer tid) {
		// TODO Auto-generated method stub
		return typeMapper.selectByPrimaryKey(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Type record) {
		// TODO Auto-generated method stub
		return typeMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<Type> selectAll() {
		// TODO Auto-generated method stub
		return typeMapper.selectAll();
	}
	@Override
	public Type selectAllByName(String tname) {
		// TODO Auto-generated method stub
		return typeMapper.selectAllByName(tname);
	}

}

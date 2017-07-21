package cn.art.service;

import java.util.List;

import cn.art.model.Type;

public interface TypeService {
	
	public int deleteByPrimaryKey(Integer tid);

    public int insert(Type record);

    public int insertSelective(Type record);

    public Type selectByPrimaryKey(Integer tid);
    public List<Type> selectAll();
    public Type selectAllByName(String tname);

    public int updateByPrimaryKeySelective(Type record);

    public int updateByPrimaryKey(Type record);

}

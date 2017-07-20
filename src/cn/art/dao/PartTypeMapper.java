package cn.art.dao;

import java.util.List;

import cn.art.model.PartType;

public interface PartTypeMapper {
    int deleteByPrimaryKey(Integer pbid);

    int insert(PartType record);

    int insertSelective(PartType record);

    PartType selectByPrimaryKey(Integer pbid);
    List<PartType> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(PartType record);

    int updateByPrimaryKey(PartType record);
}
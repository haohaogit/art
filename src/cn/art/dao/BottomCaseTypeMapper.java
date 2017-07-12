package cn.art.dao;

import cn.art.model.BottomCaseType;

public interface BottomCaseTypeMapper {
    int deleteByPrimaryKey(Integer bctid);

    int insert(BottomCaseType record);

    int insertSelective(BottomCaseType record);

    BottomCaseType selectByPrimaryKey(Integer bctid);

    int updateByPrimaryKeySelective(BottomCaseType record);

    int updateByPrimaryKey(BottomCaseType record);
}
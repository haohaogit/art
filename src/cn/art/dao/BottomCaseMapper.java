package cn.art.dao;

import cn.art.model.BottomCase;

public interface BottomCaseMapper {
    int deleteByPrimaryKey(Integer caseid);

    int insert(BottomCase record);

    int insertSelective(BottomCase record);

    BottomCase selectByPrimaryKey(Integer caseid);

    int updateByPrimaryKeySelective(BottomCase record);

    int updateByPrimaryKey(BottomCase record);
}
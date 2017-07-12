package cn.art.dao;

import cn.art.model.BottomCase;

public interface BottomCaseMapper {
    int deleteByPrimaryKey(Integer bcid);

    int insert(BottomCase record);

    int insertSelective(BottomCase record);

    BottomCase selectByPrimaryKey(Integer bcid);

    int updateByPrimaryKeySelective(BottomCase record);

    int updateByPrimaryKey(BottomCase record);
}
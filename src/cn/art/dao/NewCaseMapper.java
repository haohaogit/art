package cn.art.dao;

import cn.art.model.NewCase;

public interface NewCaseMapper {
    int deleteByPrimaryKey(Integer newcaseid);

    int insert(NewCase record);

    int insertSelective(NewCase record);

    NewCase selectByPrimaryKey(Integer newcaseid);

    int updateByPrimaryKeySelective(NewCase record);

    int updateByPrimaryKey(NewCase record);
}
package cn.art.dao;

import java.util.List;

import cn.art.model.NewCase;

public interface NewCaseMapper {
    int deleteByPrimaryKey(Integer newcaseid);

    int insert(NewCase record);

    int insertSelective(NewCase record);

    NewCase selectByPrimaryKey(Integer newcaseid);
    List<NewCase> selectByTID(Integer tid);

    int updateByPrimaryKeySelective(NewCase record);

    int updateByPrimaryKey(NewCase record);
}
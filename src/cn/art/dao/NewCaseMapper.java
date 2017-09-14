package cn.art.dao;

import java.util.List;

import cn.art.model.NewCase;
import cn.art.util.pojo.newcaseB;

public interface NewCaseMapper {
    int deleteByPrimaryKey(Integer nid);

    int insert(NewCase record);

    int insertSelective(NewCase record);

    NewCase selectByPrimaryKey(Integer nid);
    List<NewCase> selectByTID(Integer tid);
    List<newcaseB> selectNewcaseBByTID(Integer tid);
    
    List<NewCase> selectByName(String newcasename);
    int CountNumByName(String newcasename);

    int updateByPrimaryKeySelective(NewCase record);

    int updateByPrimaryKey(NewCase record);

}
package cn.art.dao;

import cn.art.model.PartBasic;

public interface PartBasicMapper {
    int deleteByPrimaryKey(Integer pbid);

    int insert(PartBasic record);

    int insertSelective(PartBasic record);

    PartBasic selectByPrimaryKey(Integer pbid);

    int updateByPrimaryKeySelective(PartBasic record);

    int updateByPrimaryKey(PartBasic record);
}
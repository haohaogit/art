package cn.art.dao;

import cn.art.model.Word;

public interface WordMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Word record);

    int insertSelective(Word record);

    Word selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Word record);

    int updateByPrimaryKey(Word record);
}
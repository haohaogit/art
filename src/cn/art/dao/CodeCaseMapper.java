package cn.art.dao;

import cn.art.model.CodeCase;

public interface CodeCaseMapper {
    int deleteByPrimaryKey(Integer codecaseid);

    int insert(CodeCase record);

    int insertSelective(CodeCase record);

    CodeCase selectByPrimaryKey(Integer codecaseid);

    int updateByPrimaryKeySelective(CodeCase record);

    int updateByPrimaryKey(CodeCase record);
}
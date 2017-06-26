package cn.art.dao;

import cn.art.model.Survey;

public interface SurveyMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Survey record);

    int insertSelective(Survey record);

    Survey selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Survey record);

    int updateByPrimaryKey(Survey record);
}
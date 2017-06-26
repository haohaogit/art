package cn.art.dao;

import cn.art.model.Part;

public interface PartMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}
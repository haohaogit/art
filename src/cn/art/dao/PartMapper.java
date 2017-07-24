package cn.art.dao;

import java.util.List;
import java.util.Map;

import cn.art.model.Part;

public interface PartMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer pid);
    List<Part> selectByTIDandPBID(Map map);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}
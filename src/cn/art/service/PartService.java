package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Part;

public interface PartService {
	int deleteByPrimaryKey(Integer pid);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(Integer pid);
    List<Part> selectByTIDandPBID(Map map);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);

}

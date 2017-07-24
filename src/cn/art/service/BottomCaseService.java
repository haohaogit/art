package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.BottomCase;

public interface BottomCaseService {
	int deleteByPrimaryKey(Integer bcid);

    int insert(BottomCase record);

    int insertSelective(BottomCase record);

    BottomCase selectByPrimaryKey(Integer bcid);
    List<BottomCase> selectByTIDandBCTID(Map map);

    int updateByPrimaryKeySelective(BottomCase record);

    int updateByPrimaryKey(BottomCase record);

}

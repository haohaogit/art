package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.OutLine;

public interface OutLineService {
	int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);
    List<OutLine> selectByTIDandOTID(Map<String, Integer> map);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);

}

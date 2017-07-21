package cn.art.service;

import java.util.List;

import cn.art.model.OutLine;

public interface OutLineService {
	int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);
    List<OutLine> selectByTIDandOTID(Integer oid,Integer otid);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);

}

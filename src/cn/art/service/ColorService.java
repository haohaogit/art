package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.Color;

public interface ColorService {
	int deleteByPrimaryKey(Integer cid);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer cid);
    List<Color> selectByTID(Integer tid);
    List<Color> selectByTIDandCBID(Map map);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);

}

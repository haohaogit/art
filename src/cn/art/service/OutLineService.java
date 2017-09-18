package cn.art.service;

import java.util.List;
import java.util.Map;

import cn.art.model.OutLine;
import cn.art.util.pojo.outlineB;

public interface OutLineService {
	int deleteByPrimaryKey(Integer oid);

    int insert(OutLine record);

    int insertSelective(OutLine record);

    OutLine selectByPrimaryKey(Integer oid);
    List<OutLine> selectByTIDandOTID(Map<String, Integer> map);
    
    List<OutLine> selectByTID(Integer tid);
    List<outlineB> selectByTID1(Integer tid);
    
    List<OutLine> selectByName1(String odescription);
    String selectByName(String odescription);
    int CountNumByName(String odescription);

    int updateByPrimaryKeySelective(OutLine record);

    int updateByPrimaryKey(OutLine record);
    
    String selectD(Integer oid);
    int update(Integer oid,String odescription,String oname,String odata,
    		String oimg1,String oimg2,String oimg3,String oimg4);
    int insertSelect(Integer tid,String odescription,String oname,String odata,
    		String oimg1,String oimg2,String oimg3,String oimg4);
    
    String selectOutlinetypeD(Integer tid);
    String getOutlineB(Integer tid);
    String selectOutlineB4(Integer tid);

}

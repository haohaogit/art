package cn.art.service;

import java.util.List;

import cn.art.model.NewCase;
import cn.art.util.pojo.newcaseB;

public interface NewCaseService {
	 int deleteByPrimaryKey(Integer nid);

	    int insert(NewCase record);

	    int insertSelective(NewCase record);

	    NewCase selectByPrimaryKey(Integer nid);
	    String getNewCaseByPrimaryKey(Integer nid);
	    List<NewCase> selectByTID(Integer tid);
	    
	    List<NewCase> selectByName1(String newcasename);
	    String selectNewcaseByTID(Integer tid);
	    List<newcaseB> selectNewcaseBByTID(Integer tid);
	    String selectByName(String newcasename);
	    int CountNumByName(String newcasename);

	    int updateByPrimaryKeySelective(NewCase record);

	    int updateByPrimaryKey(NewCase record);
	    int update(Integer nid,String newcasename,String newcaseRtotal,String newcaseRoutline,String newcaseRcolor,String newcaseRtexture
	    		,String newcaseAtotal,String newcaseAoutline,String newcaseAcolor,String newcaseAtexture);
	    int insertSelect(Integer tid,String newcasename,String newcaseRtotal,String newcaseRoutline,String newcaseRcolor,String newcaseRtexture
	    		,String newcaseAtotal,String newcaseAoutline,String newcaseAcolor,String newcaseAtexture);
	    
	    int SaveRecommend(Integer nid,Integer tid,String newcaseimg,String newcasercolor,String newcasertexture);
	    int InsertRecommendAdjust(Integer tid,String NewCaseArg,String recommendRtotal,String recommendRoutline,Integer recommendRcolorID,
	    		Integer recommendRtextureID,String recommendAtotal,String recommendAoutline,Integer recommendAcolorID,Integer recommendAtextureID);

}

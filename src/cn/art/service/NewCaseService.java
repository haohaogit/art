package cn.art.service;

import java.util.List;

import cn.art.model.NewCase;

public interface NewCaseService {
	 int deleteByPrimaryKey(Integer nid);

	    int insert(NewCase record);

	    int insertSelective(NewCase record);

	    NewCase selectByPrimaryKey(Integer nid);
	    List<NewCase> selectByTID(Integer tid);

	    int updateByPrimaryKeySelective(NewCase record);

	    int updateByPrimaryKey(NewCase record);
	    int update(Integer nid,String newcasename,String newcaseRtotal,String newcaseRoutline,String newcaseRcolor,String newcaseRtexture
	    		,String newcaseAtotal,String newcaseAoutline,String newcaseAcolor,String newcaseAtexture);
	    int insertSelect(Integer tid,Integer nid,String newcasename,String newcaseRtotal,String newcaseRoutline,String newcaseRcolor,String newcaseRtexture
	    		,String newcaseAtotal,String newcaseAoutline,String newcaseAcolor,String newcaseAtexture);

}

package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.NewCaseMapper;
import cn.art.model.NewCase;
import cn.art.service.NewCaseService;


@Service("NewCaseService")
public class NewCaseServiceImpl implements NewCaseService {
	private NewCaseMapper newCaseMapper;

	public NewCaseMapper getNewCaseMapper() {
		return newCaseMapper;
	}
	@Autowired
	public void setNewCaseMapper(NewCaseMapper newCaseMapper) {
		this.newCaseMapper = newCaseMapper;
	}


	@Override
	public int insert(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.insertSelective(record);
	}

	@Override
	public List<NewCase> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(NewCase record) {
		// TODO Auto-generated method stub
		return newCaseMapper.updateByPrimaryKey(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		return newCaseMapper.deleteByPrimaryKey(nid);
	}
	@Override
	public NewCase selectByPrimaryKey(Integer nid) {
		// TODO Auto-generated method stub
		return newCaseMapper.selectByPrimaryKey(nid);
	}
	@Override
	public int update(Integer nid, String newcasename, String newcaseRtotal,
			String newcaseRoutline, String newcaseRcolor,
			String newcaseRtexture, String newcaseAtotal,
			String newcaseAoutline, String newcaseAcolor, String newcaseAtexture) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		newCase.setNid(nid);
		newCase.setNewcasename(newcasename);
		newCase.setNewcasertotal(newcaseRtotal);
		newCase.setNewcaseroutline(newcaseRoutline);
		newCase.setNewcasercolor(newcaseRcolor);
		newCase.setNewcasertexture(newcaseRtexture);
		
		newCase.setNewcaseatotal(newcaseAtotal);
		newCase.setNewcaseaoutline(newcaseAoutline);
		newCase.setNewcaseacolor(newcaseAcolor);
		newCase.setNewcaseatexture(newcaseAtexture);
		
		return newCaseMapper.updateByPrimaryKeySelective(newCase);
	}
	@Override
	public int insertSelect(Integer tid, Integer nid, String newcasename,
			String newcaseRtotal, String newcaseRoutline, String newcaseRcolor,
			String newcaseRtexture, String newcaseAtotal,
			String newcaseAoutline, String newcaseAcolor, String newcaseAtexture) {
		// TODO Auto-generated method stub
		NewCase newCase = new NewCase();
		newCase.setNid(nid);
		newCase.setTid(tid);
		newCase.setNewcasename(newcasename);
		newCase.setNewcasertotal(newcaseRtotal);
		newCase.setNewcaseroutline(newcaseRoutline);
		newCase.setNewcasercolor(newcaseRcolor);
		newCase.setNewcasertexture(newcaseRtexture);
		
		newCase.setNewcaseatotal(newcaseAtotal);
		newCase.setNewcaseaoutline(newcaseAoutline);
		newCase.setNewcaseacolor(newcaseAcolor);
		newCase.setNewcaseatexture(newcaseAtexture);
		
		return newCaseMapper.insertSelective(newCase);
	}

}

package cn.art.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.BottomCaseMapper;
import cn.art.dao.BottomCaseTypeMapper;
import cn.art.model.BottomCase;
import cn.art.model.BottomCaseType;
import cn.art.service.BottomCaseService;
@Service("BottomCaseService")
public class BottomCaseServiceImpl implements BottomCaseService {
	private BottomCaseMapper bottomCaseMapper;
	private BottomCaseTypeMapper bottomCaseTypeMapper;

	public BottomCaseTypeMapper getBottomCaseTypeMapper() {
		return bottomCaseTypeMapper;
	}
	@Autowired
	public void setBottomCaseTypeMapper(BottomCaseTypeMapper bottomCaseTypeMapper) {
		this.bottomCaseTypeMapper = bottomCaseTypeMapper;
	}
	public BottomCaseMapper getBottomCaseMapper() {
		return bottomCaseMapper;
	}
	@Autowired
	public void setBottomCaseMapper(BottomCaseMapper bottomCaseMapper) {
		this.bottomCaseMapper = bottomCaseMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.deleteByPrimaryKey(bcid);
	}

	@Override
	public int insert(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insert(record);
	}

	@Override
	public int insertSelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.insertSelective(record);
	}

	@Override
	public BottomCase selectByPrimaryKey(Integer bcid) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByPrimaryKey(bcid);
	}

	@Override
	public List<BottomCase> selectByTIDandBCTID(Map map) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.selectByTIDandBCTID(map);
	}

	@Override
	public int updateByPrimaryKeySelective(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BottomCase record) {
		// TODO Auto-generated method stub
		return bottomCaseMapper.updateByPrimaryKey(record);
	}
	@Override
	public int update(Integer bcid, String casename, String casebrand,
			String bctname, String caseimg, String caseimg1, String caseimg2,
			String caseimg3) {
		// TODO Auto-generated method stub
		//更新底层案例类型名称
		int bctid = bottomCaseMapper.selectByPrimaryKey(bcid).getBctid();
		BottomCaseType bottomCaseType = new BottomCaseType();
		//如果底层案例类型名称 已编辑修改，则更新
		if(!bctname.equals(bottomCaseType.getBctname())){
			bottomCaseType.setBctname(bctname);
			bottomCaseType.setBctid(bctid);
			int isok = bottomCaseTypeMapper.updateByPrimaryKeySelective(bottomCaseType);
		}
		BottomCase bottomCase = new BottomCase();
		bottomCase.setBcid(bcid);
		bottomCase.setCasebrand(casebrand);
		bottomCase.setCaseimg(caseimg);
		bottomCase.setCaseimg1(caseimg1);
		bottomCase.setCaseimg2(caseimg2);
		bottomCase.setCaseimg3(caseimg3);
		bottomCase.setCasename(casename);
		return bottomCaseMapper.updateByPrimaryKeySelective(bottomCase);
		

	}
	@Override
	public int insertselect(Integer tid, String casename, String casebrand,
			String bctname, String caseimg, String caseimg1, String caseimg2,
			String caseimg3) {
		// TODO Auto-generated method stub
		int bctid = 1;
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(tid);
		for (BottomCaseType bottomCaseType : bottomCaseTypes) {
			if(bctname.equals(bottomCaseType.getBctname())){
				bctid = bottomCaseType.getBctid();
				break;
			}
		}
		BottomCase bottomCase = new BottomCase();
		bottomCase.setTid(tid);
		bottomCase.setBctid(bctid);
		bottomCase.setCasebrand(casebrand);
		bottomCase.setCaseimg(caseimg);
		bottomCase.setCaseimg1(caseimg1);
		bottomCase.setCaseimg2(caseimg2);
		bottomCase.setCaseimg3(caseimg3);
		bottomCase.setCasename(casename);
		return bottomCaseMapper.insertSelective(bottomCase);
		
	}
	

}

package cn.art.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.dao.BottomCaseMapper;
import cn.art.dao.BottomCaseTypeMapper;
import cn.art.dao.TypeMapper;
import cn.art.model.BottomCase;
import cn.art.model.BottomCaseType;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.codecase;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("manager/bottom")
public class M_bottomController {
	private BottomCaseTypeMapper bottomCaseTypeMapper;
	private BottomCaseMapper bottomCaseMapper;
	private TypeMapper typeMapper;
	
	private JsonConvert jsonConvert ;
	public M_bottomController(){
		jsonConvert = new JsonConvert();
	}
	
	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

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
	
	//底层案例库 (外观库默认接口  )
	@RequestMapping("")
	public String facadeBottom(HttpServletRequest request){
		List<typeIdName> type1 = typeMapper.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(type1));
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<BottomCaseType> bottomCaseTypes = bottomCaseTypeMapper.selectByTID(tid);
		request.setAttribute("bottomtypes", jsonConvert.list2json(bottomCaseTypes));
		//确认默认的底层类型ID
		int bctid = 1;
		for (BottomCaseType bottomCaseType:bottomCaseTypes) {
			bctid = bottomCaseType.getBctid();
			break;
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tid", tid);
		map.put("bctid", bctid);
		
		List<BottomCase> bottomCases = bottomCaseMapper.selectByTIDandBCTID(map);
		
		codecase code;
		List<codecase> codes = new LinkedList<>();
		for(BottomCase bottomCase:bottomCases){
			code = new codecase();
			code.setCaseName(bottomCase.getCasename());
			code.setCodeID(bottomCase.getBcid());
			code.setCodeTypeID(bctid);
			code.setTID(tid);
			codes.add(code);
		}
		request.setAttribute("codecases", jsonConvert.list2json(codes));
		
		return "manager/testlogin";
	}
	
	
	//底层案例库 底层案例明细接口
	@RequestMapping("{tid}/{bctid}")
	public String facadeBottomDetail(@PathVariable int tid,@PathVariable int bctid,HttpServletRequest request){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("tid", tid);
		map.put("bctid", bctid);
		List<BottomCase> bottomCases = bottomCaseMapper.selectByTIDandBCTID(map);
		
		codecase code = new codecase();
		List<codecase> codecases = new LinkedList<>();
		for(BottomCase bottomCase:bottomCases){
			code.setCaseName(bottomCase.getCasename());
			code.setCodeID(bottomCase.getBcid());
			code.setCodeTypeID(bottomCase.getBctid());
			code.setTID(bottomCase.getTid());
			codecases.add(code);
		}
		request.setAttribute("codecases", jsonConvert.list2json(codecases));
		
		
		return "manager/testlogin";
	}
	
	//底层案例库 编辑接口
	@RequestMapping("edit/{bcid}")
	public String facadeBottomEdit(@PathVariable int bcid,HttpServletRequest request){
		BottomCase bottomCase = bottomCaseMapper.selectByPrimaryKey(bcid);
		request.setAttribute("bottomcase", bottomCase);
		
		
		return "manager/testlogin";
	}
	
	
    //                       编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//底层案例库 编辑保存接口 
	@RequestMapping("edit/{bcid}")
	public String facadeBottomEditSave(@PathVariable int bcid,HttpServletRequest request){
		
		
		return "manager/testlogin";
	}
	
	//底层案例库 添加新案例接口
	@RequestMapping("addCase/{bottomcase}")
	public String facadeBottomAddCase(@PathVariable int bcid,HttpServletRequest request){
		
		
		return "manager/testlogin";
	}

		
		
		
	/*	                               删除接口  该功能模块风险较大 很容易对数据库造成不可估量的风险  咱不对外提供
	//底层案例库 删除接口 
	@RequestMapping("delete/{BCID}")
	public String facadeBottomDelete(@PathVariable int bcid,HttpServletRequest request){
		int isDelete = bottomCaseMapper.deleteByPrimaryKey(bcid);
		if(isDelete==1){
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("erroeMessage", "底层案例删除失败");
		}
		
		return "manager/testlogin";
	}	
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		//底层案例库 编辑接口
		@RequestMapping("edit/{bcid}")
		public String facadeBottomEdit2(@PathVariable int bcid,HttpServletRequest request){
			BottomCase bottomCase = bottomCaseMapper.selectByPrimaryKey(bcid);
			request.setAttribute("bottomcase", bottomCase);
			
			
			return "manager/testlogin";
		}

		
		
		
		

}

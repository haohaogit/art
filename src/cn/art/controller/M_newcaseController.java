package cn.art.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.art.model.NewCase;
import cn.art.service.NewCaseService;
import cn.art.service.TypeService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.Pnewcase;
import cn.art.util.pojo.typeIdName;



@Controller
@RequestMapping("manager/newcase")
public class M_newcaseController {
	
	private TypeService typeService;
	private NewCaseService newCaseService;
	
	private JsonConvert jsonConvert;
	
	public M_newcaseController(){
		jsonConvert = new JsonConvert();
	}
	
	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
	}
	
	
	//新造型库 (默认接口)
	@RequestMapping("")
	public String facadeNewCase(HttpServletRequest request){
		List<typeIdName> type1 = typeService.selectAllOnlyIdandName();
		
		//确认默认的产品类型ID
		int tid = 1;
		for (typeIdName typeIdName:type1) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<NewCase> newCases = newCaseService.selectByTID(tid);
		Pnewcase pnewcase;
		List<Pnewcase> pnewcases = new LinkedList<>();
		for(NewCase newCase:newCases){
			pnewcase = new Pnewcase();
			pnewcase.setNewcaseid(newCase.getNid());
			pnewcase.setNewcasename(newCase.getNewcasename());
			pnewcase.setTid(newCase.getTid());
			pnewcases.add(pnewcase);
		}
		request.setAttribute("newcases", jsonConvert.list2json(pnewcases));
		
		
		return "manager/testlogin";
	}
	
	
	//新造型案例类型分类接口
	@RequestMapping("{tid}")
	public String facadeNewCaseTypeDetail(@PathVariable int tid, HttpServletRequest request){
		List<NewCase> newCases = newCaseService.selectByTID(tid);
		Pnewcase pnewcase;
		List<Pnewcase> pnewcases = new LinkedList<>();
		for(NewCase newCase:newCases){
			pnewcase = new Pnewcase();
			pnewcase.setNewcaseid(newCase.getNid());
			pnewcase.setNewcasename(newCase.getNewcasename());
			pnewcase.setTid(newCase.getTid());
			pnewcases.add(pnewcase);
		}
		request.setAttribute("newcases", jsonConvert.list2json(pnewcases));
		
		
		return "manager/testlogin";
	}
	
	
	//新造型库 编辑接口
	@RequestMapping("edit/{newcaseid}")
	public String facadeNewCaseEdit(@PathVariable int newcaseid,HttpServletRequest request){
		NewCase newCase = newCaseService.selectByPrimaryKey(newcaseid);
		request.setAttribute("newcase", newCase);
		
		
		return "manager/testlogin";
	}
	
	
	//                   编辑保存 新增案例保存接口   目前存在一些 问题   接口状态待定。。。。。。。。。。。。。。。。
	//底层案例库 编辑保存接口 
	@RequestMapping("edit/{newcase}/confirm")
	public String facadeNewCaseEditSave(@PathVariable int bcid,HttpServletRequest request){
	
	
		return "manager/testlogin";
	}
	
	//底层案例库 添加新案例接口
	@RequestMapping("addCase/{newcase}")
	public String facadeNewCaseAddCase(@PathVariable int bcid,HttpServletRequest request){
	
	
		return "manager/testlogin";
	}

	
	/*	                               删除接口  该功能模块风险较大 很容易对数据库造成不可估量的风险  咱不对外提供
	//底层案例库 删除接口 
	@RequestMapping("delete/{newcaseid}")
	public String facadeNewCaseDelete(@PathVariable int newcaseid,HttpServletRequest request){
		int isDelete = newCaseService.deleteByPrimaryKey(newcaseid);
		if(isDelete==1){
			request.setAttribute("status", 200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("erroeMessage", "新造型案例删除失败");
		}
		
		return "manager/testlogin";
	}	
	*/


}

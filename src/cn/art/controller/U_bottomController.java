package cn.art.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.service.BottomCaseService;
import cn.art.service.TypeService;
import cn.art.util.pojo.bottomCaseB;
import cn.art.util.pojo.bottomCaseD;


@Controller
@RequestMapping("html/facade")
public class U_bottomController {
	private BottomCaseService bottomCaseService;
	private TypeService typeService;

	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
	public BottomCaseService getBottomCaseService() {
		return bottomCaseService;
	}
	@Autowired
	public void setBottomCaseService(BottomCaseService bottomCaseService) {
		this.bottomCaseService = bottomCaseService;
	}
	
	//底层案列库  
	@RequestMapping("bottom")
	@ResponseBody
	public List<bottomCaseB> bottomdefault(Model model ,String tname,HttpServletRequest request){
		
		List<bottomCaseB> bottomCaseBs = new ArrayList<bottomCaseB>();
		
		bottomCaseBs = bottomCaseService.selectBottomcaseBByTID1(tname);
		for (bottomCaseB bottomCaseB : bottomCaseBs) {
			System.out.println("Bctname="+bottomCaseB.getBctname());
		}
		return bottomCaseBs;
	}
	
	
	/*
	//底层案列 详细信息接口(比如"21070411a")
	@RequestMapping("bottomcase/{bcid}")
	public void bottomCasedetail(@PathVariable Integer bcid,HttpServletRequest request){
		
		String bottomcase = bottomCaseService.selectBottomcaseDByBCTID(bcid);
		request.setAttribute("bottomcase", bottomcase);
		//return "";
	}
	*/
	//底层案列 详细信息接口(比如"21070411a")
		@RequestMapping("bottomcase/detail")
		@ResponseBody
		public bottomCaseD bottomCasedetail(Model model, Integer bcid,
				HttpServletResponse response) throws IOException{
			bottomCaseD bottomCaseD = new bottomCaseD();
			bottomCaseD = bottomCaseService.selectBottomcaseDByBCID(bcid);
			//response.getWriter().println(bottomcase);
			//request.setAttribute("bottomcase", bottomcase);
			return bottomCaseD;
		}

}

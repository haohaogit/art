package cn.art.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.NewCase;
import cn.art.service.NewCaseService;
import cn.art.service.TypeService;
import cn.art.util.pojo.typeIdName;

@Controller
@RequestMapping("manager/newcase")
public class M_newcaseController {

	private TypeService typeService;
	private NewCaseService newCaseService;

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

	@RequestMapping("list")
	public String list(Model model, NewCase newcase) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		model.addAttribute("newcase", newcase);
		return "manager/appearance/newcase/list";
	}

	@RequestMapping("load/newcase")
	@ResponseBody
	public List<NewCase> newcase(Model model, Integer tid) {
		List<NewCase> newCaseList = new ArrayList<NewCase>();
		if (tid != null) {
			newCaseList = newCaseService.selectByTID(tid);
		}
		return newCaseList;
	}

	/**
	 * 加载需要修改的信息
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/edit")
	public String edit(NewCase newcase, Model model, Integer tid, Integer id) {
		if (id != null) {
			newcase = newCaseService.selectByPrimaryKey(id);
		} else {
			if (tid != null) {
				newcase.setTid(tid);
			}
		}
		model.addAttribute("newcase", newcase);
		return "manager/appearance/newcase/edit";
	}

	/**
	 * 保存
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/load/save")
	@ResponseBody
	public int save(NewCase item) {
		int message = 0;// 插入新成功
		if (item.getNid() != null) {
			newCaseService.updateByPrimaryKey(item);
			message = 1;// 更新成功
			return message;
		} else {
			newCaseService.insert(item);
		}

		return message;
	}

	/**
	 * 删除
	 * 
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/load/delete")
	@ResponseBody
	public int delete(Integer id) {
		int delete = newCaseService.deleteByPrimaryKey(id);
		return delete;
	}

	// 新造型库 编辑接口
	@RequestMapping("edit/{nid}")
	public String facadeNewCaseEdit(@PathVariable int nid, HttpServletRequest request) {
		NewCase newCase = newCaseService.selectByPrimaryKey(nid);
		request.setAttribute("newcase", newCase);

		return "manager/testlogin";
	}

	// 编辑保存 新增案例保存接口 目前存在一些 问题 接口状态待定。。。。。。。。。。。。。。。。
	// 底层案例库 编辑保存接口
	@RequestMapping("edit/{nid}/confirm")
	public String facadeNewCaseEditSave(@PathVariable int nid, HttpServletRequest request) {
		String newcasename = request.getParameter("newcasename");
		String newcaseRtotal = request.getParameter("newcaseRtotal");
		String newcaseRoutline = request.getParameter("newcaseRoutline");
		String newcaseRcolor = request.getParameter("newcaseRcolor");
		String newcaseRtexture = request.getParameter("newcaseRtexture");
		String newcaseAtotal = request.getParameter("newcaseAtotal");
		String newcaseAoutline = request.getParameter("newcaseAoutline");
		String newcaseAcolor = request.getParameter("newcaseAcolor");
		String newcaseAtexture = request.getParameter("newcaseAtexture");
		int isok = newCaseService.update(nid, newcasename.trim(), newcaseRtotal, newcaseRoutline, newcaseRcolor,
				newcaseRtexture, newcaseAtotal, newcaseAoutline, newcaseAcolor, newcaseAtexture);
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "新造型库编辑保存失败");
		}

		return "manager/testlogin";
	}

	// 底层案例库 添加新案例接口
	@RequestMapping("addCase/{tid}")
	public String facadeNewCaseAddCase(@PathVariable int tid, HttpServletRequest request) {
		String newcasename = request.getParameter("newcasename");
		String newcaseRtotal = request.getParameter("newcaseRtotal");
		String newcaseRoutline = request.getParameter("newcaseRoutline");
		String newcaseRcolor = request.getParameter("newcaseRcolor");
		String newcaseRtexture = request.getParameter("newcaseRtexture");
		String newcaseAtotal = request.getParameter("newcaseAtotal");
		String newcaseAoutline = request.getParameter("newcaseAoutline");
		String newcaseAcolor = request.getParameter("newcaseAcolor");
		String newcaseAtexture = request.getParameter("newcaseAtexture");

		int isok = newCaseService.insertSelect(tid, newcasename, newcaseRtotal, newcaseRoutline, newcaseRcolor,
				newcaseRtexture, newcaseAtotal, newcaseAoutline, newcaseAcolor, newcaseAtexture);
		if (isok == 1) {
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "新造型案例添加失败");
		}

		return "manager/testlogin";
	}

	/*
	 * 删除接口 该功能模块风险较大 很容易对数据库造成不可估量的风险 咱不对外提供 //底层案例库 删除接口
	 * 
	 * @RequestMapping("delete/{nid}") public String
	 * facadeNewCaseDelete(@PathVariable int nid,HttpServletRequest request){ int
	 * isDelete = newCaseService.deleteByPrimaryKey(nid); if(isDelete==1){
	 * request.setAttribute("status", 200); }else{ request.setAttribute("status",
	 * 100); request.setAttribute("erroeMessage", "新造型案例删除失败"); }
	 * 
	 * return "manager/testlogin"; }
	 */

}

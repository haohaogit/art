package cn.art.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.NewCase;
import cn.art.service.ColorService;
import cn.art.service.JWordService;
import cn.art.service.NewCaseService;
import cn.art.service.OutLineService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;
import cn.art.util.pojo.newcaseB;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("html/facade/newcase")
public class U_newcaseController {
	private TypeService typeService;
	private NewCaseService newCaseService;
	private JWordService jWordService;
	private ColorService colorService;
	private TextureService textureService;
	private OutLineService outLineService;
	
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}
	public JWordService getjWordService() {
		return jWordService;
	}
	@Autowired
	public void setjWordService(JWordService jWordService) {
		this.jWordService = jWordService;
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
	
	//新造型库 默认接口
	/*@RequestMapping("")
	public String newCasedefault(HttpServletRequest request){
		String types = typeService.getOnlyIdandName();
		request.setAttribute("types", types);
		
		List<typeIdName> typeIdNames = typeService.selectAllOnlyIdandName();
		
		//取出默认第一个物件类型的tid
		int tid = typeService.getFirstTid();
		
		String newcases = newCaseService.selectNewcaseByTID(tid);
		request.setAttribute("newcases", newcases);
		
		String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TZaoxing", TZaoxing);
		
		return "";
	}*/
	
	@RequestMapping("")
	@ResponseBody
	public List<newcaseB> newCasedefault1(Model model,String tname, HttpServletRequest request){
		System.out.println("22222222222222222222");
		List<newcaseB> lBs = new ArrayList<newcaseB>();
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		lBs = newCaseService.selectNewcaseBByTID(tid);
		
		return lBs;
	}
	
	//新造型库 类型分类接口
	@RequestMapping("{tid}")
	public void newCaseTypecalssify(@PathVariable Integer tid,HttpServletRequest request){
		
		//String newcases = newCaseService.selectNewcaseByTID(tid);
		//request.setAttribute("newcases", newcases);
		
		/*String ticon = typeService.selectByPrimaryKey(tid).getTicon();
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		request.setAttribute("ticon", ticon);
		request.setAttribute("TZaoxing", TZaoxing);*/
		System.out.println("22222222222222222222");
		//return "";
	}
	
	//"调整前后详细展示"  接口
	@RequestMapping("detail")
	@ResponseBody
	public NewCase newCaseDetailInfo(Model model,Integer nid,HttpServletRequest request){
		NewCase newCase = newCaseService.selectByPrimaryKey(nid);
		
		return newCase;
	}
	
	@RequestMapping("detail/downloadPic")
	@ResponseBody
	public ResponseEntity<byte[]> newCaseDetailInfoPic(Model model,String nid,HttpServletRequest request) throws IOException{
		//NewCase newCase = newCaseService.selectByPrimaryKey(nid);
		//下载文件路径
		String path = request.getServletContext().getRealPath("/image/");
		String filename = "微信图片.png";
		//System.out.println("filename "+filename);*/
		System.out.println(path+" 111111111111111111111 nid= "+nid);
		
		//File file = new File(path+File.separator+filename);
		File file = new File("C:\\Users\\Administrator\\workspace\\art\\WebContent\\image\\1.jpg");
		
		HttpHeaders headers = new HttpHeaders();
		//下载显示的文件名，解决中文名称轮吗问题
		String downloadfilename = new String(filename.getBytes("UTF-8"),"iso-8859-1");
		
		//通知浏览器以attachment(下载方式) 打开图片
		headers.setContentDispositionFormData("attachment", downloadfilename);
		
		// application/octet-stream；二进制流数据(最常见的下载方式)
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		
		// 201 httpstatus.CREATED
		
		
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);

	}
	
	//推荐信息详情 接口
	@RequestMapping("{detailInfo}/{xid}")
	public void newCaseRecommendInfoDetail(@PathVariable String detailInfo,@PathVariable Integer xid,HttpServletRequest request){
		
		if("color".equals(detailInfo)){
			String color = colorService.selectColorD(xid);
			request.setAttribute("color", color);
			
		}else if("texture".equals(detailInfo)){
			String texture = textureService.selectTextureD(xid);
		}else{
			request.setAttribute("status", "url填写错误");
		}
		
		//return "";
	}

}

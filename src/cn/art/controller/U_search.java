package cn.art.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.BottomCase;
import cn.art.model.Color;
import cn.art.model.NewCase;
import cn.art.model.OutLine;
import cn.art.model.Part;
import cn.art.model.Texture;
import cn.art.service.BottomCaseService;
import cn.art.service.ColorService;
import cn.art.service.NewCaseService;
import cn.art.service.OutLineService;
import cn.art.service.PartService;
import cn.art.service.TextureService;
import cn.art.util.pojo.codingCase;

@Controller
@RequestMapping("html/search")
public class U_search {
	private BottomCaseService bottomCaseService ;
	private PartService partService;
	private ColorService colorService;
	private OutLineService outLineService;
	private TextureService textureService;
	private NewCaseService newCaseService ;


	public BottomCaseService getBottomCaseService() {
		return bottomCaseService;
	}
	@Autowired
	public void setBottomCaseService(BottomCaseService bottomCaseService) {
		this.bottomCaseService = bottomCaseService;
	}
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public ColorService getColorService() {
		return colorService;
	}
	@Autowired
	public void setColorService(ColorService colorService) {
		this.colorService = colorService;
	}
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}

	public TextureService getTextureService() {
		return textureService;
	}
	@Autowired
	public void setTextureService(TextureService textureService) {
		this.textureService = textureService;
	}

	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
	}

	@RequestMapping("facade/bottom")
	@ResponseBody
	public List<BottomCase> bottomCaseType(Model model, String searchContent) {
		//System.out.println("888888888888888888888888");
		List<BottomCase> bottomCaseList = new ArrayList<BottomCase>();
		if (searchContent != null) {
			bottomCaseList = bottomCaseService.selectByName1(searchContent);
		}
		return bottomCaseList;
	}
	
	@RequestMapping("facade/code")
	@ResponseBody
	public List<codingCase> part(Model model, String searchContent) {
		//System.out.println("777777777777777777777777777");
		List<Part> partList = new ArrayList<Part>();
		List<Color> colorList = new ArrayList<Color>();
		List<OutLine> outlineList = new ArrayList<OutLine>();
		List<Texture> textureList = new ArrayList<Texture>();
		List<codingCase> codingList = new ArrayList<codingCase>();
		codingCase coding;
		if (searchContent != null) {
			partList = partService.selectByName1(searchContent);
			for(Part part :partList){
				coding = new codingCase();
				coding.setCimg(part.getPimg());
				coding.setDescri(part.getPdescription());
				codingList.add(coding);
			}
			
			colorList = colorService.selectByName1(searchContent);
			for (Color color : colorList) {
				coding = new codingCase();
				coding.setCimg(color.getCimg());
				coding.setDescri(color.getCdescription());
				codingList.add(coding);
			}
			outlineList = outLineService.selectByName1(searchContent);
			for(OutLine outLine:outlineList){
				coding = new codingCase();
				coding.setCimg(outLine.getOimg());
				coding.setDescri(outLine.getOdescription());
				codingList.add(coding);
			}
			textureList = textureService.selectByName1(searchContent);
			for (Texture texture : textureList) {
				coding = new codingCase();
				coding.setCimg(texture.getTimg());
				coding.setDescri(texture.getTdescription());
				codingList.add(coding);
			}
		}
		return codingList;
	}
	
	
	@RequestMapping("facade/newcase")
	@ResponseBody
	public List<NewCase> newstyle(Model model, String searchContent) {
		//System.out.println("4444444444444444444444444");
		List<NewCase> newcaseList = new ArrayList<NewCase>();
		if (searchContent != null) {
			newcaseList = newCaseService.selectByName1(searchContent);
		}
		return newcaseList;
	}
	
	
	

}

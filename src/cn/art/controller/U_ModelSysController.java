package cn.art.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import cn.art.service.PartService;
import cn.art.service.SurveyService;
import cn.art.service.TextureService;
import cn.art.service.TypeService;
import cn.art.util.pojo.base64;
import cn.art.util.pojo.colorB;
import cn.art.util.pojo.commandImg;
import cn.art.util.pojo.outlineB;
import cn.art.util.pojo.partB;
import cn.art.util.pojo.survey2;
import cn.art.util.pojo.textureB;
import cn.art.util.pojo.typeIdName;


@Controller
@RequestMapping("html")
public class U_ModelSysController {
	
	private JWordService jWordService;
	private TypeService typeService;
	private SurveyService surveyService;
	private OutLineService outLineService;
	private PartService partService;
	private ColorService colorService;
	private TextureService textureService;
	private NewCaseService newCaseService;

	private String Rgb;
	private String timeid1;
	private String[] colorgene; 
	private Map<String , String[]> colorBlock = new HashMap<String, String[]>();
	private Map<String, String> minitem = new HashMap<String, String>();
	private Map<String , String > backimg = new HashMap<String, String>();
	private Map<String , String > FabricTexturebackimg = new HashMap<String, String>();
	private Map<String , String > RgbNum = new HashMap<String, String>();
	private Map<String , String > scoreNum = new HashMap<String, String>();
	
	private Map<String , String > colorimgMap = new HashMap<String, String>();
	private Map<String , String > textureimgMap = new HashMap<String, String>();
	
	
	
	public OutLineService getOutLineService() {
		return outLineService;
	}
	@Autowired
	public void setOutLineService(OutLineService outLineService) {
		this.outLineService = outLineService;
	}
	public NewCaseService getNewCaseService() {
		return newCaseService;
	}
	@Autowired
	public void setNewCaseService(NewCaseService newCaseService) {
		this.newCaseService = newCaseService;
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
	public PartService getPartService() {
		return partService;
	}
	@Autowired
	public void setPartService(PartService partService) {
		this.partService = partService;
	}
	public SurveyService getSurveyService() {
		return surveyService;
	}
	@Autowired
	public void setSurveyService(SurveyService surveyService) {
		this.surveyService = surveyService;
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

	
	@RequestMapping("cihuidui/model")
	@ResponseBody
	public List<outlineB> model(Model model,String tname,HttpServletRequest request){
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<outlineB> outlineBs = new ArrayList<outlineB>();
		outlineBs = outLineService.selectByTID1(tid);
		//System.out.println("cccccccccccccccccccccccc");
		return outlineBs;
	}
	@RequestMapping("model")
	@ResponseBody
	public List<outlineB> model1(Model model,String tname,HttpServletRequest request){
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		List<outlineB> outlineBs = new ArrayList<outlineB>();
		outlineBs = outLineService.selectByTID1(tid);
		//System.out.println("cccccccccccccccccccccccc");
		return outlineBs;
	}
	
	@RequestMapping("getHref")
	@ResponseBody
	public survey2 getHref(Model model,String tname,HttpServletRequest request){
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		survey2 survey =surveyService.selectByTid(tid);
		
		System.out.println("cccccccccccccccccccccccc   "+survey.getWordresult());
		System.out.println("dddddddddddddddddddddddd   "+survey.getWordsurvey());
		return survey;
	}
	@RequestMapping("cihuidui/getHref")
	@ResponseBody
	public survey2 getHref1(Model model,String tname,HttpServletRequest request){
		
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		survey2 survey2 =surveyService.selectByTid(tid);
		
		System.out.println("cccccccccccccccccccccccc"+survey2.getWordresult());
		return survey2;
	}
	
	//  获取面板色彩
	@RequestMapping("getcolor")
	@ResponseBody
	public List<colorB> getpanelColor(Model model,String tname,HttpServletRequest request){
		//System.out.println("sc "+sc);
		List<colorB> listbBs = new ArrayList<colorB>();
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 2;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		listbBs = colorService.selectByTID1(tid);
		for (colorB colorB : listbBs) {
			System.out.println("colorB.getCbname() "+colorB.getCbname()+" colorB.getCimg()"+colorB.getCimg());
		}
		
		return listbBs;
		
	}
	@RequestMapping("getpart")
	@ResponseBody
	public List<partB> getpanelpart(Model model,String tname,HttpServletRequest request){
		//System.out.println("sc "+sc);
		List<partB> listbBs = new ArrayList<partB>();
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 2;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		listbBs = partService.selectpartBByTid(tid);
		for (partB colorB : listbBs) {
			System.out.println("bname() "+colorB.getPbname()+" .getimg()"+colorB.getPimg());
		}
		
		return listbBs;
		
	}
	@RequestMapping("adjust/part/cooker/{timeid}")
	@ResponseBody
	public commandImg adjustpartCooker(@PathVariable String timeid,Model model,String img,HttpServletRequest request){
		System.out.println("img  "+img);
		String[] s1 = img.split("/");
		String Logoimg = s1[s1.length-1];
		
		Logoimg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+Logoimg;
		
		s1 = Rgb.split(",");
		try {
            
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\cookerAssembleLogo.py",minitem.get(timeid),s1[0],s1[1],s1[2],backimg.get(timeid),Logoimg,timeid};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/cookerPart_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/part/fabric/{timeid}")
	@ResponseBody
	public commandImg adjustpartFabric(@PathVariable String timeid,Model model,String pbimg,HttpServletRequest request){
		
		System.out.println("img  "+pbimg);
		String[] s1 = pbimg.split("/");
		String adjPimg = s1[s1.length-1];
		
		adjPimg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+adjPimg;
		
		int Nrgb = Integer.parseInt(RgbNum.get(timeid));
		String imgString = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/fabric_"+timeid+".jpg";
		System.out.println("RgbNum.get(timeid) "+RgbNum.get(timeid));
		System.out.println("imgString "+imgString);
		System.out.println("FabricTexturebackimg.get(timeid) "+FabricTexturebackimg.get(timeid));
		System.out.println("adjPimg "+adjPimg);
		try {
            
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGenColorImageMateriaFrame.py",colorgene[Nrgb],RgbNum.get(timeid),imgString,FabricTexturebackimg.get(timeid),adjPimg,timeid};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../../images/cookerPart"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	
	@RequestMapping("gettexture")
	@ResponseBody
	public List<textureB> getpanelTexture(Model model,String tname,HttpServletRequest request){
		System.out.println("tname "+tname);
		List<textureB> listbBs = new ArrayList<textureB>();
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 2;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		listbBs = textureService.getTextureBasic1(tid);
		/*for (textureB colorB : listbBs) {
			System.out.println("colorB.getCbname() "+colorB.getTtname()+" colorB.getCimg()"+colorB.getTimg());
		}*/
		
		return listbBs;
		
	}
	
	@RequestMapping("adjust/texture/cooker/{timeid}")
	@ResponseBody
	public commandImg adjustTextureCooker(@PathVariable String timeid,Model model,String img,String timid,HttpServletRequest request){
		//System.out.println("crgb111 "+crgb);
		String[] s1 = img.split("/");
		String timg = s1[s1.length-1];
		textureimgMap.put(timeid, timg);
		
		//timg = "C:/firstDL_netEast/artgene/"+timg;
		timg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+timg;
		backimg.put(timeid, timg);
		//System.out.println("timg "+timg);
		
		s1 = Rgb.split(",");
		try {
            
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
			//System.out.println(minitemS+","+minitemK+","+minitemB+","+minitemD+","+Rgb);
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\cookerAssembleMaterial.py",minitem.get(timeid),s1[0],s1[1],s1[2],timg,timeid};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/cookerTexture_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/texture/houseboat/{timeid}")
	@ResponseBody
	public commandImg adjustTextureHouseboat(@PathVariable String timeid,Model model,String img,String timid,HttpServletRequest request){
		//System.out.println("crgb111 "+crgb);
		String[] s1 = img.split("/");
		String timg = s1[s1.length-1];
		
		//timg = "C:/firstDL_netEast/artgene/"+timg;
		timg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+timg;
		backimg.put(timeid, timg);
		System.out.println("timg "+timg);
		
		s1 = Rgb.split(",");
		try {
            
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
			//System.out.println(minitemS+","+minitemK+","+minitemB+","+minitemD+","+Rgb);
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\boatAssembleMaterialTest.py",minitem.get(timeid),RgbNum.get(timeid),timg,timeid};
            //String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\boatAssembleMaterialTest.py",minitem.get(timeid),RgbNum.get(timeid),timg,timeid};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/cookerTexture_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/texture/fabric/{timeid}")
	@ResponseBody
	public commandImg adjustTextureFabric(@PathVariable String timeid,Model model,String tbimg,String timid,HttpServletRequest request) throws UnsupportedEncodingException{
		System.out.println("crgb111 ");
		String[] s1 = tbimg.split("/");
		String timg1 = s1[s1.length-1];
		String timg = new String(timg1.getBytes(),"UTF-8");
		
		textureimgMap.put(timeid, timg);
		
		timg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+timg;
		System.out.println("ting "+timg);
		FabricTexturebackimg.put(timeid, timg);
		
		int Nrgb = Integer.parseInt(RgbNum.get(timeid));
		String imgString = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/fabric_"+timeid+".jpg";
		try {
            
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
			//System.out.println(minitemS+","+minitemK+","+minitemB+","+minitemD+","+Rgb);
            //String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\scarvesColorGenColorImageMateria.py",colorgene[Nrgb],RgbNum.get(timeid),imgString,timg,timeid};
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGenColorImageMateria.py",colorgene[Nrgb],RgbNum.get(timeid),imgString,timg,timeid};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
                
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../../images/fabricTexture_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/texture/globet/{timeid}")
	@ResponseBody
	public commandImg adjusttextureglobet(@PathVariable String timeid,Model model,String teximg,HttpServletRequest request){
		System.out.println("globet "+teximg+"  "+timeid);
		
		String gaojiaobei = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/gaojiaobei_"+timeid+".jpg";
		String textureimg = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/"+teximg;
		System.out.println(gaojiaobei);
		try {
            //需传入的参数
            
            
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\GeneticAlgorithmTexture.py",gaojiaobei,RgbNum.get(timeid),textureimg,timeid };
            //String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\boatAssembleColorTest.py",minitem.get(timeid),Rgb,timeid };
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/gaojiaobeiColorA_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/color/gascooker/{colorimg}/{timeid}")
	@ResponseBody
	public commandImg adjustColor(@PathVariable String colorimg,@PathVariable String timeid,Model model,String crgb,HttpServletRequest request){
		//System.out.println("crgb111 "+crgb);
		/*String[] s1 = colorimg.split("/");
		String timg = s1[s1.length-1];*/
		colorimgMap.put(timeid, colorimg);
		
		try {
            //需传入的参数
            Rgb = crgb;
            RgbNum.put(timeid, Rgb);
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\cookerAssembleColor.py",minitem.get(timeid),Rgb,timeid };
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/cookerColor_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/color/houseboat/{timeid}")
	@ResponseBody
	public commandImg adjustColorBoat(@PathVariable String timeid,Model model,String crgb,HttpServletRequest request){
		System.out.println("boat "+crgb);
		System.out.println("minitem.get(timeid) "+minitem.get(timeid));
		
		try {
            //需传入的参数
            Rgb = crgb;
            RgbNum.put(timeid, Rgb);
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\boatAssembleColorTest.py",minitem.get(timeid),Rgb,timeid };
            //String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\boatAssembleColorTest.py",minitem.get(timeid),Rgb,timeid };
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/boatColor_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/color/fabric/{timeid}")
	@ResponseBody
	public commandImg adjustColorFabric(@PathVariable String timeid,Model model,String cnum,HttpServletRequest request){
		//System.out.println("crgb111 "+crgb);
		colorimgMap.put(timeid, "3Colors_Template"+cnum+"_"+timeid+".jpg");
		
		try {
            //需传入的参数
            //Rgb = crgb;
            //设置命令行传入参数
			//调整织物的图片  参数1：第cnum个色彩块RGB值，参数2：每个色彩快中RGB的组数，参数3：所选图片底图，参数4：当前时间戳
			String[] args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGenColorImage1.py",colorgene[Integer.parseInt(cnum)],RgbNum.get(timeid), backimg.get(timeid),timeid};
			Process pr = Runtime.getRuntime().exec(args);

			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
               
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../../images/cookerColor"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("adjust/color/globet/{timeid}")
	@ResponseBody
	public commandImg adjustColorglobet(@PathVariable String timeid,Model model,String crgb,HttpServletRequest request){
		System.out.println("globet "+crgb+"  "+timeid);
		
		String gaojiaobei = "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/gaojiaobei_"+timeid+".jpg";
		System.out.println(gaojiaobei);
		try {
            //需传入的参数
            Rgb = crgb;
            RgbNum.put(timeid, Rgb);
            //System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\GeneticAlgorithmColor.py",gaojiaobei,Rgb,timeid };
            //String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\boatAssembleColorTest.py",minitem.get(timeid),Rgb,timeid };
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		commandImg cimg = new commandImg();
		cimg.setImg("../image/gaojiaobeiColorA_"+timeid+".jpg");
		
		//cimg.setImg1("../images/genestyle/Ccolor.png");
		//cimg.setImg2("../images/genestyle/Ctexture1.png");
		
		return cimg;
		
	}
	
	@RequestMapping("setparam/cooker")
	@ResponseBody
	public commandImg setparamcooker(Model model,String sc,HttpServletRequest request){
		
		
		/*String[] s = sc.split(",");
		int temp =0;
		String score = "";
		for (String s1 : s) {
			temp  = Integer.parseInt(s1)+3;
			s1 = temp+",";
			score +=s1;
		}*/
		commandImg cimg = new commandImg();
		try {
            //需传入的参数
            String a = sc;
            
            long current_time = new Date().getTime();
            timeid1 = current_time+"";
            scoreNum.put(timeid1, sc);
            System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args1 = new String[] { "python", "C:\\firstDL_netEast\\cookerAssemble.py", a,timeid1};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
                
                minitem.put(timeid1, line);
            }
           
            in.close();
            
            Rgb = "123,123,123";
            backimg.put(timeid1, "C:/firstDL_netEast/artgene/M22.jpg");
            //pr.waitFor();
            cimg.setImg("../image/cookerColor_"+timeid1+".jpg");
            cimg.setTimeid(timeid1);
    		cimg.setImg1("../images/genestyle/Ccolor.png");
    		cimg.setImg2("../images/genestyle/Ctexture1111.png");
    		cimg.setWordIndex(minitem.get(timeid1));
    		System.out.println("wordIndex "+minitem.get(timeid1));
            System.out.println("end111");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return cimg;
		
	}
	
	@RequestMapping("setparam/fabric/{img}")
	@ResponseBody
	public commandImg setparamfabric(@PathVariable String img,Model model,String sc,HttpServletRequest request){
		String[] s = sc.split(",");
		int colorNum = Integer.parseInt(s[s.length-1]);
		System.out.println("colorNum "+colorNum);
		commandImg cimg = new commandImg();
		
		
		String bgimg = img;
		
		String basePath = request.getSession().getServletContext().getRealPath("/");
		String path = basePath.replace('\\', '/');
		System.out.println("basePath "+basePath);
		bgimg = basePath+"image/"+img+".jpg";
		
		System.out.println("bgimg "+bgimg);
		
		try {
            //需传入的参数
            String a = sc;
            System.out.println("start11122 " + a);
            //设置命令行传入参数
            long current_time = new Date().getTime();
            timeid1 = current_time+"";
            scoreNum.put(timeid1, sc);
            RgbNum.put(timeid1, colorNum+"");
            backimg.put(timeid1, bgimg);
            
            //生成色彩快RGB值   参数1：3个意象词汇参数和一个图片RGB色彩的组数 拼接而成
            String[] args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGen.py",a};
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            int i = 0;
            int k = 0;
            String templatRGB="";
            colorgene = new String[7];
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
                if(i != 0) templatRGB = templatRGB+",";
                templatRGB = templatRGB+line;
                k = i/colorNum;
                if(i%colorNum==0){
                	colorgene[k] = line;
                }else{
                	colorgene[k] = colorgene[k]+","+line;
                }
                i++;
            }
            System.out.println("i "+i);
            for (int j = 0; j < i/colorNum; j++) {
				System.out.println(colorgene[j]);
				
			}
            colorBlock.put(timeid1, colorgene);
            in.close();
            
            //生成推荐的图片  参数1：第一个色彩块RGB值，参数2：每个色彩快中RGB的组数，参数3：所选图片底图，参数4：当前时间戳
            System.out.println("image  11111111111");
            args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGenColorImage.py",colorgene[0],RgbNum.get(timeid1), backimg.get(timeid1),timeid1};
            pr = Runtime.getRuntime().exec(args);

            in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
            	System.out.println("image  11111111111");
                System.out.println(line);
                cimg.setWordIndex(line);
               
            }
            in.close();
            
            
            //生成色彩调整是 轮播组件的7张图片 参数1：色彩块RGB值，参数2：每个色彩快中RGB的组数，参数3：底图，参数4：当前时间戳
            String lunboColorBlock = "C:/firstDL_netEast/artgene/3Colors.jpg";
            System.out.println("templatRGB "+templatRGB);
            
            args = new String[] { "python", "C:\\firstDL_netEast\\scarvesColorGenColorImageTemplate.py",templatRGB,colorNum+"", lunboColorBlock,timeid1};
            pr = Runtime.getRuntime().exec(args);
            in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            
            
            //pr.waitFor();
            cimg.setImg("../image/fabric"+"_"+timeid1+".jpg");
            cimg.setTimeid(timeid1);
            
    		cimg.setImg1("../images/genestyle/Ccolor.png");
    		cimg.setImg2("../images/genestyle/Ctexture1.png");
            System.out.println("end111");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return cimg;
	}
	
	@RequestMapping("setparam/houseboat")
	@ResponseBody
	public commandImg setparamhouseboat(Model model,String sc,HttpServletRequest request){
		
		
		/*String[] s = sc.split(",");
		int temp =0;
		String score = "";
		for (String s1 : s) {
			temp  = Integer.parseInt(s1)+3;
			s1 = temp+",";
			score +=s1;
		}*/
		commandImg cimg = new commandImg();
		try {
            //需传入的参数
            String a = sc;
            
            long current_time = new Date().getTime();
            timeid1 = current_time+"";
            scoreNum.put(timeid1, sc);
            System.out.println("start111" + a);
            //设置命令行传入参数
            String[] args1 = new String[] { "python", "C:\\firstDL_netEast\\boatAssembleTest.py", a,timeid1};
            //String[] args1 = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\boatAssembleTest.py", a,timeid1};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
                cimg.setWordIndex(line);
                minitem.put(timeid1, line);
            }
           
            in.close();
            
            Rgb = "30,35,57";
            //backimg.put(timeid1, "C:/firstDL_netEast/artgene/M22.jpg");
            //pr.waitFor();
            cimg.setImg("../image/boatColor_"+timeid1+".jpg");
            cimg.setTimeid(timeid1);
    		cimg.setImg1("../images/genestyle/Ccolor.png");
    		cimg.setImg2("../images/genestyle/Ctexture1.png");
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return cimg;
		
	}
	
	@RequestMapping("setparam/globet")
	@ResponseBody
	public commandImg setparamGlobet(Model model,String sc,HttpServletRequest request){
		
		
		/*String[] s = sc.split(",");
		int temp =0;
		String score = "";
		for (String s1 : s) {
			temp  = Integer.parseInt(s1)+3;
			s1 = temp+",";
			score +=s1;
		}*/
		commandImg cimg = new commandImg();
		try {
            //需传入的参数
            String a = sc;
            
            long current_time = new Date().getTime();
            timeid1 = current_time+"";
            scoreNum.put(timeid1, sc);
            System.out.println("start222" + a);
            
            String data = sc+","+timeid1;
            
            /*FileWriter out = new FileWriter("C:\\apache-tomcat-7.0.53\\wtpwebapps\\art0804\\image\\globet_appendfile.txt", false); 
            //往文件写入
            out.write(data);
            //换行
            
            //刷新IO内存流
            out.flush();
            //关闭
            out.close();

            System.out.println("Done");*/
            
            
            Runtime mt =Runtime.getRuntime();
            //找到相对应的绝对路径。启动记事本文件
           
            
            //File  myfile =new File("C:\\apache-tomcat-7.0.53\\wtpwebapps\\art0804\\image","GeneticAlgorithm.exe");
            
            
            Process p = mt.exec("C:\\apache-tomcat-7.0.53\\wtpwebapps\\art0804\\image\\GeneticAlgorithm.exe "+data);
            
            p.waitFor(); 
            System.out.println("test globet by .exe");
            //创建新的文件路径,启动ie浏览器
            //myfile = new File("c:\\program Files\\Internet Explorer","IEXPLORE.www.sohu.com");
            //mt.exec(myfile.getAbsolutePath());
            //设置命令行传入参数
           /* //String[] args1 = new String[] { "python", "C:\\firstDL_netEast\\boatAssembleTest.py", a,timeid1};
            String[] args1 = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\globet.py", a,timeid1};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
                minitem.put(timeid1, line);
            }
           
            in.close();*/
            try   
            {   
            	Thread.currentThread().sleep(1000);//毫秒   
            }   catch(Exception e){} 
            
            Rgb = "30,35,57";
            //backimg.put(timeid1, "C:/firstDL_netEast/artgene/M22.jpg");
            //pr.waitFor();
            cimg.setImg("../image/gaojiaobei_"+timeid1+".jpg");
            cimg.setTimeid(timeid1);
    		cimg.setImg1("../images/genestyle/Ccolor.png");
    		cimg.setImg2("../images/genestyle/Ctexture1.png");
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return cimg;
		
	}
	
	@RequestMapping("save/cooker/{timeid}/{caseName}")
	@ResponseBody
	public String savecooker(@PathVariable String timeid,@PathVariable String caseName,Model model,HttpServletRequest request){
		String message = "0";
		List<typeIdName> typeIdNames = typeService.selectAllByName("燃气灶");
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		NewCase newCase = new NewCase();
		
		newCase.setTid(tid);
		newCase.setNewcasename(caseName+"_"+timeid);
		newCase.setNewcasearg(scoreNum.get(timeid));
		
		newCase.setNewcaseimg("cookerPartA_"+timeid+".jpg");
		
		newCase.setNewcasercolor("RGB值000000.jpg");
		newCase.setNewcasertexture("maskboardD2RGB229.229.229.jpg");
		newCase.setNewcasertotal("cookerPart_"+timeid+".jpg");
		newCase.setNewcaseroutline("cooker_"+timeid+".jpg");
		System.out.println(colorimgMap.get(timeid));
		System.out.println(textureimgMap.get(timeid));
		newCase.setNewcaseacolor(colorimgMap.get(timeid));
		newCase.setNewcaseaoutline("cooker_"+timeid+".jpg");
		newCase.setNewcaseatexture(textureimgMap.get(timeid));
		newCase.setNewcaseatotal("cookerPartA_"+timeid+".jpg");
		
		int isok = newCaseService.insertSelective(newCase);
		message = isok+"";
		return message;
	}
	
	@RequestMapping("save/houseboat/{timeid}/{caseName}")
	@ResponseBody
	public String savehouseboat(@PathVariable String timeid,@PathVariable String caseName,Model model,HttpServletRequest request){
		String message = "0";
		List<typeIdName> typeIdNames = typeService.selectAllByName("游艇");
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		NewCase newCase = new NewCase();
		
		newCase.setTid(tid);
		newCase.setNewcasename(caseName+"_"+timeid);
		newCase.setNewcasearg(scoreNum.get(timeid));
		
		newCase.setNewcaseimg("boatPartA_"+timeid+".jpg");
		
		newCase.setNewcasercolor("boatColor_"+timeid+".jpg");
		newCase.setNewcasertexture("boatTexture_"+timeid+".jpg");
		newCase.setNewcasertotal("boatPart_"+timeid+".jpg");
		newCase.setNewcaseroutline("boat_"+timeid+".jpg");
		
		newCase.setNewcaseacolor("boatColorA_"+timeid+".jpg");
		newCase.setNewcaseaoutline("boat_"+timeid+".jpg");
		newCase.setNewcaseatexture("boatTextureA_"+timeid+".jpg");
		newCase.setNewcaseatotal("boatPartA_"+timeid+".jpg");
		
		int isok = newCaseService.insertSelective(newCase);
		message = isok+"";
		return message;
	}
	
	@RequestMapping("save/fabric/{timeid}/{caseName}")
	@ResponseBody
	public String savefabric(@PathVariable String timeid,@PathVariable String caseName,Model model,HttpServletRequest request){
		String message = "0";
		List<typeIdName> typeIdNames = typeService.selectAllByName("织物");
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		NewCase newCase = new NewCase();
		
		newCase.setTid(tid);
		newCase.setNewcasename(caseName+"_"+timeid);
		newCase.setNewcasearg(scoreNum.get(timeid));
		newCase.setNewcaseimg("fabricPartA_"+timeid+".jpg");
		
		newCase.setNewcasercolor("3Colors_Template0_"+timeid+".jpg");
		newCase.setNewcasertexture("纱布.jpg");
		newCase.setNewcasertotal("fabricPart_"+timeid+".jpg");
		newCase.setNewcaseroutline("fabric_"+timeid+".jpg");
		
		newCase.setNewcaseacolor(colorimgMap.get(timeid));
		newCase.setNewcaseaoutline("fabric_"+timeid+".jpg");
		newCase.setNewcaseatexture(textureimgMap.get(timeid));
		newCase.setNewcaseatotal("fabricPartA_"+timeid+".jpg");
		
		int isok = newCaseService.insertSelective(newCase);
		message = isok+"";
		return message;
	}
		
	//参数设置 类型分类默认接口
	@RequestMapping("setparameter")
	public String modelSetpara(HttpServletRequest request){
		String types = typeService.selectAllOnlyIDName();
		request.setAttribute("types", types);
		
		//取出默认第一个物件类型的tid
		int tid = typeService.getFirstTid();
		//获取词汇类型    1 表示词汇 2 表示词对
		int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
		//获取系统造型介绍
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		//获取造型图标
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		
		String Words = jWordService.getAllJwordByTID(tid);
		
		
		String ChooseSurvey = surveyService.getChooseSurvey(tid);
		String Algorithms = surveyService.getAlgorithms(tid);
		
		return "manager/testlogin";
	}
	
	//参数设置 类型分类接口
	@RequestMapping("setparameter/{tid}")
	public String modelSetparaBytid(@PathVariable Integer tid,HttpServletRequest request){
		request.setAttribute("tid", tid);
		
		//若该tid对应的物件类型是织物类型，则是另一个操作流程(相对于高脚杯、燃气灶等)
		String tname = typeService.selectByPrimaryKey(tid).getTname();
		if("织物".equals(tname)){
			String outlinetypes = outLineService.selectOutlinetypeD(tid);
			request.setAttribute("outlinetypes", outlinetypes);
			
			return "redirect:/model/setparameter/"+tid+"/fabricSave";
			
		}else{

			//获取词汇类型    1 表示词汇 2 表示词对
			int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
			//获取系统造型介绍
			String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
			//获取造型图标
			String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
			
			String Words = jWordService.getAllJwordByTID(tid);
			
			String ChooseSurvey = surveyService.getChooseSurvey(tid);
			String Algorithms = surveyService.getAlgorithms(tid);
		}
		
		return "manager/testlogin";
	}
	
	@RequestMapping("setparameter/{tid}/fabricSave")
	public String modelfabricOutlineselect(@PathVariable Integer tid,HttpServletRequest request){
		String oidstring = request.getParameter("oid");
		int oid = Integer.parseInt(oidstring);
		
		return "redirect:/model/"+tid+"/fabricSetpara/"+oid;
	}
	
	@RequestMapping("{tid}/fabricSetpara/{oid}")
	public String modelfabricParaselect(@PathVariable Integer tid,@PathVariable Integer oid,HttpServletRequest request){
		//获取用户所选择的织物轮廓图案
		String outlineImg = outLineService.selectByPrimaryKey(oid).getOimg();
		request.setAttribute("outlineImg", outlineImg);
		
		//获取词汇类型    1 表示词汇 2 表示词对
		int TWordType = typeService.selectByPrimaryKey(tid).getTwordtype();
		//获取系统造型介绍
		String TZaoxing = typeService.selectByPrimaryKey(tid).getTzaoxing();
		//获取造型图标
		String TIcon = typeService.selectByPrimaryKey(tid).getTicon();
		
		String Words = jWordService.getAllJwordByTID(tid);
		
		String ChooseSurvey = surveyService.getChooseSurvey(tid);
		String Algorithms = surveyService.getAlgorithms(tid);
		
		return "manager/testlogin";
	}
	
	
	//                                    暂未实现该接口
	//参数设置 保存接口(也是造型生成 入口)
	@RequestMapping("generate/{tid}/{cihuiInfo}")
	public String modelGenerate(@PathVariable Integer tid,@PathVariable String cihuiInfo,HttpServletRequest request){
		request.setAttribute("NewCaseArg", cihuiInfo);
		
		String Imgparameter = "";       //高脚杯返回的是轮廓位置数据
		String recommendImg = "";       //燃气灶等是一个推荐图片
		String recommendRcolor= "";
		String recommendRcolorID = "";
		String recommendRtexture= "";
		String recommendRtextureID = "";
		
		request.setAttribute("Imgparameter", Imgparameter);//高脚杯是位置参数
		request.setAttribute("recommendImg", recommendImg); //其他的是推荐的图片地址
		
		request.setAttribute("recommendRcolor", recommendRcolor);
		request.setAttribute("recommendRcolorID", recommendRcolorID);
		request.setAttribute("recommendRtexture", recommendRtexture);
		request.setAttribute("recommendRtextureID", recommendRtextureID);
		
		
		return "manager/testlogin";
	}
	
	
	//造型生成 "确定"接口   (也是调转到造型调整的接口 部件添加)
	@RequestMapping("generete/{tid}/Confirm")
	public String modelGenerateSave(@PathVariable Integer tid,HttpServletRequest request){
		 //上一步中利用高脚杯的位置数据产生的推荐图示 或燃气灶等的推荐图片
		//String recommendRtotal  = request.getParameter("recommendImg");      
		//String recommendRoutline = request.getParameter("recommendRoutline");
		
		
		
		//id生成器   UUID id生成器产生的是 string 类型的ID
		//UUID uuid = UUID.randomUUID();
		//request.setAttribute("recommendRtotal", recommendRtotal);
		//request.setAttribute("recommendRoutline", recommendRoutline);
		
		HttpSession session = request.getSession();
		session.setAttribute("generatetid", "generatetid111111111111111111111222");
		//request.setAttribute("generatetid", "generatetid111111111111111111111");
		
		
		//System.out.println("myname is llllllllllll");
		//return "manager/testlogin";
		return "redirect:/model/"+tid+"/partAdd";
	}
	
	//部件添加 接口
	@RequestMapping("{tid}/partAdd")
	public String modelPartAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		String generatetid  = (String)request.getAttribute("generatetid");
		String parts = partService.getPartBasic(tid);
		
		//request.setAttribute("recommendImg", recommendImg);
		request.setAttribute("parts", parts);
		
		System.out.println("myname is 33333333333333333333");
		System.out.println(generatetid);
		return "manager/testlogin";
	}
	
	@RequestMapping("partAdd/{caseName}/{timeid}")
	@ResponseBody
	public String modelPartAdjust1(@PathVariable String caseName,@PathVariable String timeid,Model model,String tname,HttpServletRequest request){
		List<typeIdName> typeIdNames = typeService.selectAllByName(tname);
		int tid = 0;
		for (typeIdName typeIdName : typeIdNames) {
			tid = typeIdName.getTid();
			break;
		}
		
		
		String imgdata = request.getParameter("imgdata");
		//String[] str = imgdata.split("/");
		
		  //输出base64 数据,截取","之后的值进行转换
        String str = imgdata.substring(imgdata.indexOf(",")+1);
        //System.currentTimeMillis()意思是获取当前系统的时间戳给图片命名
        //实例化Base64转换类  调用里面的GenerateImage方法（把base64数据转为图片）
        //第一个参数base64转图片的必须的base64数据，第二个是转换后生成的图片存放路径
        //base64.GenerateImage(str, "D:/2017/"+System.currentTimeMillis()+".jpg");
        base64.GenerateImage(str, "C:/apache-tomcat-7.0.53/wtpwebapps/art0804/image/cookerPartA_"+timeid+".jpg");
        
        
        
        
		NewCase newCase = new NewCase();
		
		newCase.setTid(tid);
		newCase.setNewcasename(caseName+"_"+timeid);
		newCase.setNewcasearg(scoreNum.get(timeid));
		
		newCase.setNewcaseimg("cookerPartA_"+timeid+".jpg");
		
		newCase.setNewcasercolor("RGB值000000.jpg");
		newCase.setNewcasertexture("maskboardD2RGB229.229.229.jpg");
		newCase.setNewcasertotal("cookerPart_"+timeid+".jpg");
		newCase.setNewcaseroutline("cooker_"+timeid+".jpg");
		System.out.println(colorimgMap.get(timeid));
		System.out.println(textureimgMap.get(timeid));
		newCase.setNewcaseacolor(colorimgMap.get(timeid));
		newCase.setNewcaseaoutline("cooker_"+timeid+".jpg");
		newCase.setNewcaseatexture(textureimgMap.get(timeid));
		newCase.setNewcaseatotal("cookerPartA_"+timeid+".jpg");
		
		
		int isok = newCaseService.insertSelective(newCase);
       
        //数据库存入绝对路径下的图片名称（上传图片即是修改操作）
        
       /* buyerMess.setPhotourl("D:/images/user_head/"+System.currentTimeMillis()+".jpg");
        buyerMess.setId("zhangsan");
        //根据用户Id修改头像图片存的路径
        Integer ret = buyerMessService.updatePhotoUrl(buyerMess);
        if(ret>0){
            System.out.println("存入成功");
        }else{
            System.out.println("存入失败");
        }*/
		//request.setAttribute("recommendImg", recommendImg);
		//request.setAttribute("parts", parts);
        /*try {
            //需传入的参数
            String a = "1,2,2,2,3", b = "D3455054", c = "LJ12GKS28D4418248", d = "qingdao";
            System.out.println("start;;;" + a);
            //设置命令行传入参数
            String[] args = new String[] { "python", "D:\\20170602\\PycharmProjects\\firstDL_netEast\\api_test.py", a };
            Process pr = Runtime.getRuntime().exec(args);

            BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                //line = decodeUnicode(line);
                System.out.println(line);
            }
            in.close();
            //pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
      /* final Runtime runtime = Runtime.getRuntime();  
        Process process = null;  
      
        try {  //C:\Users\Administrator\Desktop\新建文件夹
            process = runtime.exec("C:\\Users\\Administrator\\Desktop\\新建文件夹\\新建文件夹\\cookerAssemble.exe");  
      
        } catch (final Exception e) {  
            System.out.println("Error exec!");  
        }  */
        
		System.out.println("myname is 33333333333333333333  "+imgdata);
		return "1";
		//return "manager/testlogin";
	}
	
	//部件添加 保存接口 (也是调转到造型调整的 色彩调整接口)
	@RequestMapping("{pid}/partAdd/confirm")
	public String  modelPartAdjustSave(@PathVariable Integer pid,HttpServletRequest request){
		request.setAttribute("partId", pid);
		String recommendAoutline = request.getParameter("recommendImg"); //用于记录经过部件调整后的整体推荐图片
		request.setAttribute("recommendAoutline", recommendAoutline);  //把 经过部件调整后的整体图片先存到浏览器的request/response域中
		
		int tid = (int) request.getAttribute("tid");
		return "redirect:/model/"+tid+"/colorAdjust";
	}
	
	//色彩调整 接口 
	@RequestMapping("{tid}/colorAdjust")
	public void  modelColorAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		//String recommendImg1  = (String)request.getAttribute("recommendImg1");
		String colors = colorService.getColorBasic(tid);
		
		//request.setAttribute("recommendImg", recommendImg1);
		request.setAttribute("colors", colors);
	}
	
	//色彩调整 保存接口 (也是调转到造型调整的 材质调整接口)
	@RequestMapping("{cid}/partAdd/confirm")
	public String  modelColordjustSave(@PathVariable Integer cid,HttpServletRequest request){
		request.setAttribute("recommendAcolorID", cid);
		String recommendAcolor = request.getParameter("recommendImg2"); //用于记录经过色彩调整后的整体推荐图片
		request.setAttribute("recommendAcolor", recommendAcolor);  //把 经过色彩调整后的整体图片先存到浏览器的request/response域中
		
		int tid = (int) request.getAttribute("tid");
		return "redirect:/model/"+tid+"/partAdd";
	}
	
	//材质调整 接口 
	@RequestMapping("{tid}/textureAdjust")
	public void  modelTextureAdjust(@PathVariable Integer tid,HttpServletRequest request){
		
		String recommendImg2  = (String)request.getAttribute("recommendImg2");
		String textures = textureService.getTextureBasic(tid);
		
		request.setAttribute("recommendImg", recommendImg2);
		request.setAttribute("textures", textures);
	}
	
	//材质调整 保存接口 (也是调转到造型调整的 材质调整接口)
	@RequestMapping("{textureid}/textureAdjust/confirm")
	public String  modeltextureAdjustSave(@PathVariable Integer textureid,HttpServletRequest request){
		
		
		int tid = (int) request.getAttribute("tid");
		String NewCaseArg = (String) request.getAttribute("NewCaseArg");
		
		String recommendRtotal = (String) request.getAttribute("recommendRtotal");
		String recommendRoutline = (String) request.getAttribute("recommendRoutline");
		
		//String recommendRcolor= (String) request.getAttribute("recommendRcolor");
		int recommendRcolorID = (int) request.getAttribute("recommendRcolorID");
		//String recommendRtexture= (String) request.getAttribute("recommendRtexture");
		int recommendRtextureID = (int) request.getAttribute("recommendRtextureID");
		
		///////////////////////来源？？？？？？？？
		String recommendAtotal = (String) request.getAttribute("recommendImg3");//用于记录经过材质调整后的整体推荐图片
		String recommendAoutline = (String) request.getAttribute("recommendAoutline");
		
		//String recommendAcolor= (String) request.getAttribute("recommendAcolor");
		int recommendAcolorID = (int) request.getAttribute("recommendAcolorID");
		//String recommendAtexture= (String) request.getAttribute("recommendAtexture");   //知道调整后的textureid后
		int recommendAtextureID = textureid;                         //就知道了调整后的材质(recommendAtexture)
		
		//newCaseService.insertSelect(tid, newcasename, newcaseRtotal, newcaseRoutline, newcaseRcolor, newcaseRtexture, newcaseAtotal, newcaseAoutline, newcaseAcolor, newcaseAtexture)
		//String recommendImg3 = request.getParameter("recommendImg3"); 
		//request.setAttribute("recommendImg1", recommendImg1);  //把 经过材质调整后的整体图片先存到浏览器的request/response域中
		
		int isok = newCaseService.InsertRecommendAdjust(tid, NewCaseArg, recommendRtotal, recommendRoutline, recommendRcolorID, recommendRtextureID, recommendAtotal, recommendAoutline, recommendAcolorID, recommendAtextureID);
		if(isok==1){
			request.setAttribute("status",200);
		}else{
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "新造型库推荐调整保存失败");
		}
		
		return "";
	}


}

package cn.art.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.art.model.JWord;
import cn.art.model.Word;
import cn.art.service.JWordService;
import cn.art.service.TypeService;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;
import cn.art.util.pojo.wordp2;

import com.nillith.pinyin.Pinyin;

@Controller
@RequestMapping("manager/dimense")
public class M_dimenseController {
	private JWordService jWordService;
	private TypeService typeService;
	private WordService wordService;

	private JsonConvert jsonConvert;

	public WordService getWordService() {
		return wordService;
	}

	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}

	public M_dimenseController() {
		jsonConvert = new JsonConvert();
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

	@RequestMapping("list")
	public String list(Model model) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		
		Map<String, List<wordp2>> wordListMap1 = new HashMap<String, List<wordp2>>();
		int tid = typeService.getTidByTName("高脚杯");
		List<JWord> jwordList = jWordService.selectByTID(tid);
		
		List<wordp2> wordList = new ArrayList<wordp2>();
		wordp2 wordp2;
		Word word;
		for (JWord JWord : jwordList) {
			word = wordService.selectByPrimaryKey(JWord.getWid());
			wordp2 = new wordp2();
			wordp2.setJwid(JWord.getJwid());
			wordp2.setTid(JWord.getTid());
			wordp2.setWid(word.getWid());
			wordp2.setWword1(word.getWword());
			
			wordList.add(wordp2);
		}
		wordListMap1.put(tid+"", wordList);
		
		model.addAttribute("wordListMap1", wordListMap1);
		
		
		
		
		Map<String, List<wordp2>> wordListMap2 = new HashMap<String, List<wordp2>>();
		
		for (typeIdName typeIdName : typesList) {
			if(tid !=typeIdName.getTid()){
				List<JWord> jwordList1 = jWordService.selectByTID(typeIdName.getTid());
				List<wordp2> wordList1 = new ArrayList<wordp2>();
				
				for (JWord JWord : jwordList1) {
					word = wordService.selectByPrimaryKey(JWord.getWid());
					wordp2 = new wordp2();
					wordp2.setJwid(JWord.getJwid());
					wordp2.setTid(JWord.getTid());
					wordp2.setWid(word.getWid());
					wordp2.setWword1(word.getWword());
					wordp2.setCouplewid(JWord.getCouplewid());
					word = wordService.selectByPrimaryKey(JWord.getCouplewid());
					wordp2.setWword2(word.getWword());
					
					
					wordList1.add(wordp2);
		
				}
				wordListMap2.put(typeIdName.getTid().toString(), wordList1);
			}
			
		}
		model.addAttribute("wordListMap2", wordListMap2);
		return "manager/yuyi/dimense/list";
		
		
	}
	
	@RequestMapping("list/cihui")
	public String listcihui(Model model) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		Map<String, List<wordp2>> wordListMap = new HashMap<String, List<wordp2>>();
		int tid = typeService.getTidByTName("高脚杯");
		List<JWord> jwordList = jWordService.selectByTID(tid);
		
		List<wordp2> wordList = new ArrayList<wordp2>();
		wordp2 wordp2;
		Word word;
		for (JWord JWord : jwordList) {
			word = wordService.selectByPrimaryKey(JWord.getWid());
			wordp2 = new wordp2();
			wordp2.setJwid(JWord.getJwid());
			wordp2.setTid(JWord.getTid());
			wordp2.setWid(word.getWid());
			wordp2.setWword1(word.getWword());
			
			wordList.add(wordp2);
		}
		wordListMap.put(tid+"", wordList);
		
		model.addAttribute("wordListMap", wordListMap);
		return "manager/yuyi/dimense/list";
	}
	
	@RequestMapping("list/cidui")
	public String listcidui(Model model) {
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		Map<String, List<wordp2>> wordListMap = new HashMap<String, List<wordp2>>();
		int tid = typeService.getTidByTName("高脚杯");
		
		for (typeIdName typeIdName : typesList) {
			if(tid !=typeIdName.getTid()){
				List<JWord> jwordList = jWordService.selectByTID(typeIdName.getTid());
				List<wordp2> wordList = new ArrayList<wordp2>();
				wordp2 wordp2;
				Word word;
				for (JWord JWord : jwordList) {
					word = wordService.selectByPrimaryKey(JWord.getWid());
					wordp2 = new wordp2();
					wordp2.setJwid(JWord.getJwid());
					wordp2.setTid(JWord.getTid());
					wordp2.setWid(word.getWid());
					wordp2.setWword1(word.getWword());
					wordp2.setCouplewid(JWord.getCouplewid());
					word = wordService.selectByPrimaryKey(JWord.getCouplewid());
					wordp2.setWword2(word.getWword());
					
					
					wordList.add(wordp2);
		
				}
				wordListMap.put(typeIdName.getTid().toString(), wordList);
			}
			
		}
		model.addAttribute("wordListMap", wordListMap);
		return "manager/yuyi/dimense/list";
		/*List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		Map<String, List<Word>> wordListMap = new HashMap<String, List<Word>>();
		for (typeIdName typeIdName : typesList) {
			if("高脚杯"!=typeIdName.getTname()){
				List<JWord> jwordList = jWordService.selectByTID(typeIdName.getTid());
				List<Word> wordList = new ArrayList<Word>();
				for (JWord JWord : jwordList) {
					Word word = wordService.selectByPrimaryKey(JWord.getWid());
					wordList.add(word);
				}
				wordListMap.put(typeIdName.getTid().toString(), wordList);
			}
			
		}
		model.addAttribute("wordListMap", wordListMap);
		return "manager/yuyi/dimense/list";*/
	}
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/edit")
	public String edit(Model model, Word item) {
		//List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		// Map<String, Object> typeIdNameMap = new HashMap<String, Object>();
		// for (typeIdName typeIdName : typesList) {
		//
		// typeIdNameMap.put("id", typeIdName.getTid());
		// typeIdNameMap.put("name", typeIdName.getTname());
		// }
		
		//model.addAttribute("typesList", typesList);
		// model.addAttribute("typeIdNameMap", typeIdNameMap);
		//List<Word> wordList = wordService.selectAll();
		//model.addAttribute("wordList", wordList);
		model.addAttribute("item", item);
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		Map<String, List<Word>> wordListMap = new HashMap<String, List<Word>>();
		for (typeIdName typeIdName : typesList) {
			List<JWord> jwordList = jWordService.selectByTID(typeIdName.getTid());
			List<Word> wordList = new ArrayList<Word>();
			for (JWord JWord : jwordList) {
				Word word = wordService.selectByPrimaryKey(JWord.getWid());
				wordList.add(word);
			}
			wordListMap.put(typeIdName.getTid().toString(), wordList);
		}
		model.addAttribute("wordListMap", wordListMap);
		return "manager/yuyi/dimense/edit";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/delete")
	public String delete(Model model, String wid) {
		//System.out.println("wid "+wid);
		wordService.deleteByPrimaryKey(Integer.parseInt(wid));
		
		List<typeIdName> typesList = typeService.selectAllOnlyIdandName();
		model.addAttribute("typesList", typesList);
		Map<String, List<Word>> wordListMap = new HashMap<String, List<Word>>();
		for (typeIdName typeIdName : typesList) {
			List<JWord> jwordList = jWordService.selectByTID(typeIdName.getTid());
			List<Word> wordList = new ArrayList<Word>();
			for (JWord JWord : jwordList) {
				Word word = wordService.selectByPrimaryKey(JWord.getWid());
				wordList.add(word);
			}
			wordListMap.put(typeIdName.getTid().toString(), wordList);
		}
		model.addAttribute("wordListMap", wordListMap);
		return "manager/yuyi/dimense/list";
	}

	@RequestMapping("load/save")
	@ResponseBody
	public String save(Word item, String widsString, String tid,String similar,String opposite) {
		//System.out.println("similar "+similar+" ,opposite "+opposite);
		item.setWsimilar(item.getWsimilar()+similar);
		item.setWoposite(item.getWoposite()+opposite);
		
		String message = "0";// 失败
		Pinyin[] hao = Pinyin.getPinyin(item.getWword());
		char[] firString = hao[0].toStringAsciiNoTone().toUpperCase().toCharArray();
		
		item.setWfirstchar(String.valueOf(firString[0]));
		//System.out.println("item.getWsimilar() "+item.getWsimilar());
		wordService.insertSelective(item);
		//hao1.
		
		/*wordService.insertSelective(item);
		List<JWord> JWordList = jWordService.selectByTID(tid);
		for (JWord jword : JWordList) {
			jWordService.deleteByPrimaryKey(jword.getJwid());
		}
		if (widsString != null) {
			String[] array = widsString.split("，");
			if (tid != null) {
				for (String wid : array) {
					jWordService.insertVoca(Integer.parseInt(wid), tid);
				}
				message = "1";// 成功
				// return message;
			}
		}*/
		return message;
	}

	@RequestMapping("load/JWord")
	@ResponseBody
	public List<JWord> survey(Integer tid) {
		List<JWord> jwordList = jWordService.selectByTID(tid);
		return jwordList;
	}

	// 降维词汇库 (默认接口)
	@RequestMapping("")
	public String semanticDimense(HttpServletRequest request) {
		List<typeIdName> types = typeService.selectAllOnlyIdandName();
		request.setAttribute("types", jsonConvert.list2json(types));

		return "manager/testlogin";
	}

	// 降维词汇库 "词汇,词对"点击接口
	@RequestMapping("{wordType}")
	public String semanticDimenseWordType(@PathVariable String wordType, HttpServletRequest request) {
		if ("voca".equals(wordType)) {
			String vocas = jWordService.getVoca();
			request.setAttribute("words", vocas);
		} else if ("cidui".equals(wordType)) {
			String cidui = jWordService.getcidui();
			request.setAttribute("cidui", cidui);
		}

		return "manager/testlogin";
	}

	// 降维词汇库 添加新词汇接口
	// @RequestMapping("addNewVoca")
	// public String semanticDimenseAddVoca(HttpServletRequest request){
	// String words = wordService.getwordFp();
	// request.setAttribute("words", words);
	// return "manager/testlogin";
	// }

	// 降维词汇库 添加新词汇/添加 接口
	@RequestMapping("addNewVoca/{wid}/{tid}")
	public String semanticDimenseAddVocaSave(@PathVariable Integer wid, @PathVariable Integer tid,
			HttpServletRequest request) {
		int isok = jWordService.insertVoca(wid, tid);
		if (isok == 1) {
			// 插入成功
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库词汇插入失败");
		}
		return "manager/testlogin";
	}

	// 降维词汇库 添加新词对/添加 接口
	@RequestMapping("addCiDui/{wid}/{wid1}/{tid}")
	public String semanticDimenseAddciduiSave(@PathVariable Integer wid, @PathVariable Integer wid1,
			@PathVariable Integer tid, HttpServletRequest request) {
		int isok = jWordService.insertCidui(wid, wid1, tid);
		if (isok == 1) {
			// 插入成功
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库词对插入失败");
		}
		return "manager/testlogin";
	}

	// 降维词汇库 删除接口
	@RequestMapping("delete/{jwid}")
	public String semanticDimenseDelete(@PathVariable Integer jwid, HttpServletRequest request) {
		int isok = jWordService.deleteByPrimaryKey(jwid);
		if (isok == 1) {
			// 插入成功
			request.setAttribute("status", 200);
		} else {
			request.setAttribute("status", 100);
			request.setAttribute("errorMessage", "降维词汇库删除失败");
		}
		return "manager/testlogin";
	}

}

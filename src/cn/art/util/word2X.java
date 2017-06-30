package cn.art.util;

import cn.art.model.Word;
import cn.art.util.pojo.wordF;
import cn.art.util.pojo.wordV;

public class word2X {
	
	public wordF word2wordF(Word word){
		wordF wF = new wordF();
		wF.setWid(word.getWid());
		wF.setWword(word.getWword());
		wF.setWsimilar(word.getWsimilar());
		wF.setWoposite(word.getWoposite());
		wF.setWfirstchar(word.getWfirstchar());
		return wF;
	}
	public wordV word2wordV(Word word){
		wordV wV = new wordV();
		wV.setWid(word.getWid());
		wV.setWword(word.getWword());
		wV.setWsimilar(word.getWsimilar());
		wV.setWoposite(word.getWoposite());
		wV.setWvocatype(word.getWvocatype());
		return wV;
	}

}

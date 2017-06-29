package cn.art.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.model.Word;
import cn.art.service.WordService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testWord {
	private WordService wordService;

	public WordService getWordService() {
		return wordService;
	}
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
	
	@Test
	public void testselect(){
		List<Word> words =  wordService.selectByWVocaType("优雅");
		for(Word word:words){
			System.out.println(word.getWbasic()+" "+word.getWfirstchar()+"  "+word.getWvocatype());
		}
	}

}

package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.WordMapper;
import cn.art.model.Word;
import cn.art.service.WordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.wordFp;

@Service("WordService")
public class WordServiceImpl implements WordService {
	private WordMapper wordMapper;
	private JsonConvert jsonConvert;
	
	public WordServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public WordMapper getWordMapper() {
		return wordMapper;
	}
	@Autowired
	public void setWordMapper(WordMapper wordMapper) {
		this.wordMapper = wordMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer wid) {
		// TODO Auto-generated method stub
		return wordMapper.deleteByPrimaryKey(wid);
	}

	@Override
	public int insert(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.insert(record);
	}

	@Override
	public int insertSelective(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.insertSelective(record);
	}

	@Override
	public Word selectByPrimaryKey(Integer wid) {
		// TODO Auto-generated method stub
		return wordMapper.selectByPrimaryKey(wid);
	}

	@Override
	public List<Word> selectByWFirstChar(String wfirstchar) {
		// TODO Auto-generated method stub
		return wordMapper.selectByWFirstChar(wfirstchar);
	}

	@Override
	public int updateByPrimaryKeySelective(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Word record) {
		// TODO Auto-generated method stub
		return wordMapper.updateByPrimaryKey(record);
	}
	@Override
	public List<Word> selectByWVocaType(String wvocatype) {
		// TODO Auto-generated method stub
		return wordMapper.selectByWVocaType(wvocatype);
	}
	@Override
	public List<Word> selectAll() {
		// TODO Auto-generated method stub
		return wordMapper.selectAll();
	}
	@Override
	public String getwordFp() {
		// TODO Auto-generated method stub
		wordFp wordFp;
		List<Word> words = wordMapper.selectAll();
		List<wordFp> wordFps = new LinkedList<wordFp>();
		for(Word word: words){
			wordFp = new wordFp();
			wordFp.setWfirstchar(word.getWfirstchar());
			wordFp.setWid(wordFp.getWid());
			wordFp.setWword(word.getWword());
			wordFps.add(wordFp);
		}
		return jsonConvert.list2json(wordFps);
	}

}

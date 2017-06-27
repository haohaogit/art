package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.WordMapper;
import cn.art.model.Word;
import cn.art.service.WordService;

@Service("WordService")
public class WordServiceImpl implements WordService {
	private WordMapper wordMapper;

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
		return null;
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

}

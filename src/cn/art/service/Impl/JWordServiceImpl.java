package cn.art.service.Impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.JWordMapper;
import cn.art.dao.TypeMapper;
import cn.art.dao.WordMapper;
import cn.art.model.JWord;
import cn.art.service.JWordService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.typeIdName;
import cn.art.util.pojo.wordp1;


@Service("JWordService")
public class JWordServiceImpl implements JWordService {
	private JWordMapper jWordMapper;
	private TypeMapper typeMapper;
	private WordMapper wordMapper;
	
	private JsonConvert jsonConvert;
	public JWordServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public WordMapper getWordMapper() {
		return wordMapper;
	}
	@Autowired
	public void setWordMapper(WordMapper wordMapper) {
		this.wordMapper = wordMapper;
	}
	public TypeMapper getTypeMapper() {
		return typeMapper;
	}
	@Autowired
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}
	public JWordMapper getjWordMapper() {
		return jWordMapper;
	}
	@Autowired
	public void setjWordMapper(JWordMapper jWordMapper) {
		this.jWordMapper = jWordMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer jwid) {
		// TODO Auto-generated method stub
		return jWordMapper.deleteByPrimaryKey(jwid);
	}

	@Override
	public int insert(JWord record) {
		// TODO Auto-generated method stub
		return jWordMapper.insert(record);
	}

	@Override
	public int insertSelective(JWord record) {
		// TODO Auto-generated method stub
		return jWordMapper.insertSelective(record);
	}

	@Override
	public JWord selectByPrimaryKey(Integer jwid) {
		// TODO Auto-generated method stub
		return jWordMapper.selectByPrimaryKey(jwid);
	}

	@Override
	public List<JWord> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return jWordMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(JWord record) {
		// TODO Auto-generated method stub
		return jWordMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(JWord record) {
		// TODO Auto-generated method stub
		return jWordMapper.updateByPrimaryKey(record);
	}
	@Override
	public String getVoca() {
		// TODO Auto-generated method stub
		//获取所有的 WordType 为词汇的产品类型   1 代表词汇 2 代表词对
		List<typeIdName> type1s = typeMapper.selectAllByWordType(1);
		List<wordp1> wordp1s = new LinkedList<wordp1>();
		wordp1 wordp1;
		
		for(typeIdName t1: type1s) {
			int tid = t1.getTid();
			List<JWord> jWords = jWordMapper.selectByTID(tid);
			
			for(JWord jWord : jWords){
				wordp1 = new wordp1();
				wordp1.setTid(jWord.getTid());
				wordp1.setWid(jWord.getWid());
				wordp1.setWword(wordMapper.selectByPrimaryKey(jWord.getWid()).getWword());
				wordp1s.add(wordp1);
			}
			break;
		}
		
		return jsonConvert.list2json(wordp1s);
	}

	@Override
	public String getcidui() {
		// TODO Auto-generated method stub
		//获取所有的 WordType 为词汇的产品类型   1 代表词汇 2 代表词对
		List<typeIdName> type1s = typeMapper.selectAllByWordType(2);
		List<wordp1> wordp1s = new LinkedList<wordp1>();
		wordp1 wordp1;
		
		for(typeIdName t1: type1s) {
			int tid = t1.getTid();
			List<JWord> jWords = jWordMapper.selectByTID(tid);
			
			for(JWord jWord : jWords){
				wordp1 = new wordp1();
				wordp1.setTid(jWord.getTid());
				wordp1.setWid(jWord.getWid());
				wordp1.setWword(wordMapper.selectByPrimaryKey(jWord.getWid()).getWword());
				wordp1s.add(wordp1);
			}
			
		}
		
		return jsonConvert.list2json(wordp1s);
	}

}

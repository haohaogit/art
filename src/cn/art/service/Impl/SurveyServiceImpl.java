package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.art.dao.SurveyMapper;
import cn.art.model.Survey;
import cn.art.service.SurveyService;
import cn.art.util.pojo.surveyCA;

public class SurveyServiceImpl implements SurveyService {
	private SurveyMapper surveyMapper;

	public SurveyMapper getSurveyMapper() {
		return surveyMapper;
	}
	@Autowired
	public void setSurveyMapper(SurveyMapper surveyMapper) {
		this.surveyMapper = surveyMapper;
	}

	@Override
	public int deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return surveyMapper.deleteByPrimaryKey(sid);
	}

	@Override
	public int insert(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.insert(record);
	}

	@Override
	public int insertSelective(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.insertSelective(record);
	}

	@Override
	public Survey selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return surveyMapper.selectByPrimaryKey(sid);
	}

	@Override
	public List<Survey> selectByTID(Integer tid) {
		// TODO Auto-generated method stub
		return surveyMapper.selectByTID(tid);
	}

	@Override
	public int updateByPrimaryKeySelective(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateByPrimaryKey(record);
	}
	@Override
	public int updateOnlyCA(surveyCA record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateOnlyCA(record);
	}

}

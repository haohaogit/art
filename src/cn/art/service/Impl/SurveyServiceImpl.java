package cn.art.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.SurveyMapper;
import cn.art.model.Survey;
import cn.art.service.SurveyService;
import cn.art.service.TypeService;
import cn.art.util.JsonConvert;
import cn.art.util.pojo.surveyCA;

@Service("SurveyService")
public class SurveyServiceImpl implements SurveyService {
	private SurveyMapper surveyMapper;
	private TypeService typeService;
	private JsonConvert jsonConvert ;
	
	public SurveyServiceImpl(){
		jsonConvert = new JsonConvert();
	}

	public TypeService getTypeService() {
		return typeService;
	}
	@Autowired
	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}

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
	public int updateOnlyCA1(surveyCA record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateOnlyCA1(record);
	}
	@Override
	public int updateOnlyCA(Survey record) {
		// TODO Auto-generated method stub
		return surveyMapper.updateOnlyCA(record);
	}
	@Override
	public String getWordSurvey(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getWordsurvey();
			}else{
				str+="|";
				str+=survey.getWordsurvey();
			}
			num++;
			
		}
		return str;
	}
	@Override
	public int saveWordSurvey(Integer tid, String wordsurvey) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(wordsurvey.equals(survey.getWordsurvey())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordsurvey(wordsurvey);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public int saveWordResult(Integer tid, String wordresult) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查结果链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(wordresult.equals(survey.getWordsurvey())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordresult(wordresult);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public String getWordResult(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getWordresult();
			}else{
				str+="|";
				str+=survey.getWordresult();
			}
			num++;
			
		}
		return str;
	}
	@Override
	public String getConnectSurvey(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getConnectsurvey();
			}else{
				str+="|";
				str+=survey.getConnectsurvey();
			}
			num++;
			
		}
		return str;
	}
	
	@Override
	public String getConnectResult(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getConnectresult();
			}else{
				str+="|";
				str+=survey.getConnectresult();
			}
			num++;
			
		}
		return str;
	}
	
	
	@Override
	public String getAlgorithms(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getAlgorithms();
			}else{
				str+="|";
				str+=survey.getAlgorithms();
			}
			num++;
			
		}
		return str;
	}
	
	
	@Override
	public String getRatio(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		int num = 0;
		String str="";
		for (Survey survey : surveys) {
			if(num==2) break;
			if(num==0){
				str+=survey.getRatio();
			}else{
				str+="|";
				str+=survey.getRatio();
			}
			num++;
		}
		return str;
	}
	@Override
	public int saveConnectSurvey(Integer tid, String connectSurvey) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查结果链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(connectSurvey.equals(survey.getConnectsurvey())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordresult(connectSurvey);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public int saveConnectResult(Integer tid, String connectResult) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查结果链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(connectResult.equals(survey.getConnectresult())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordresult(connectResult);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public int saveAlgorithms(Integer tid, String algorithms) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查结果链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(algorithms.equals(survey.getAlgorithms())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordresult(algorithms);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public int saveRatio(Integer tid, String ratio) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		boolean isExist =false;
		//判断该ID类型的词汇调查结果链接是否存在，不纯在则插入到数据库
		for (Survey survey : surveys) {
			if(ratio.equals(survey.getRatio())){
				isExist = true;
				break;
			}	
		}
		if(!isExist){
			Survey survey = new Survey();
			survey.setTid(tid);
			survey.setWordresult(ratio);
			return surveyMapper.insertSelective(survey);
		}
		return 0;
	}
	@Override
	public String selectSurveysByTID(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		return jsonConvert.list2json(surveys);
	}

	@Override
	public String getChooseSurvey(Integer tid) {
		// TODO Auto-generated method stub
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		String choosesurvey = "";
		for (Survey survey : surveys) {
			choosesurvey = survey.getChoosesurvey();
			break;
		}
		return choosesurvey;
	}

	@Override
	public Survey selectByTname(String tname) {
		// TODO Auto-generated method stub
		int tid = typeService.getTidByTName(tname);
		Survey survey1 = new Survey();
		List<Survey> surveys = surveyMapper.selectByTID(tid);
		for (Survey survey : surveys) {
			survey1 = survey;
			break;
		}
		return survey1;
	}
	

}

package cn.art.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.SurveyMapper;
import cn.art.util.pojo.surveyCA;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testSurvey {
	private SurveyMapper surveyMapper;

	public SurveyMapper getSurveyMapper() {
		return surveyMapper;
	}
	@Autowired
	public void setSurveyMapper(SurveyMapper surveyMapper) {
		this.surveyMapper = surveyMapper;
	}
	
	@Test
	public void testSurveyOnlyCA(){
		surveyCA surveyCA1 = new surveyCA();
		surveyCA1.setAlgorithms("888");
		surveyCA1.setChoosesurvey("999");
		surveyCA1.setTid(1);
		System.out.println(surveyCA1);
		int ok = surveyMapper.updateOnlyCA(surveyCA1);
		System.out.println("aaaaaaaaaa"+ok);
	}
	

}

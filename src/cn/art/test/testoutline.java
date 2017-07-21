package cn.art.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.art.dao.OutLineMapper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class testoutline {
	private OutLineMapper outLineMapper;
	
	
	
	public OutLineMapper getOutLineMapper() {
		return outLineMapper;
	}
	@Autowired
	public void setOutLineMapper(OutLineMapper outLineMapper) {
		this.outLineMapper = outLineMapper;
	}



	@Test
	public void json2bean() {
		
		//System.out.println(word.getWbasic());
		//System.out.println(word.getWbasic()+" "+word.getWdetail());
	}

}

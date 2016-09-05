package star.test.spring.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import star.spring.aop.CupService;
import star.test.spring.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:servlet-context.xml")
public class SpringJunitTest extends AbstractJUnit4SpringContextTests{

	Logger log = LoggerFactory.getLogger(SpringJunitTest.class);
	
	//@Autowired
	//TestService testService;
	@Autowired
	CupService cupService;
	
	
	@Test	
	public void testAspect(){
		log.info("testAspect star........");
		cupService.drink();
		log.info("testAspect end........");
	}
}

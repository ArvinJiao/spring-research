package star.test.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	Logger log = LoggerFactory.getLogger(TestService.class);
	
	public void test(){
		log.info("test service");
	}
}

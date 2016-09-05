package star.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CupService {

	Logger log = LoggerFactory.getLogger(CupService.class);
	
	public String drink(){
		log.info("drink............");
		return "sweet";
	}
}

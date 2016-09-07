package star.spring.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController {
	
	private static final Logger logger = LoggerFactory.getLogger(DataController.class);
	
	@Value("${data}")
	String data;
	
	@RequestMapping("/pets/{pid}")
	public @ResponseBody String testMatrixVariable(@PathVariable String pid, @MatrixVariable String q){
		return "path:" + pid + " MatrixVariable:" + q;
	}
	
	@RequestMapping("/config")
	public @ResponseBody String getConfig(){
		logger.debug("data:" + data);
		logger.error("error test");
		return data;
	}
	

}

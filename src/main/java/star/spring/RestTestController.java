package star.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class RestTestController {

	@RequestMapping("/")
	public String testRest(){
		return "test rest ok";
	}
	
	@RequestMapping(value="json", method=RequestMethod.GET)
	public Map<String,Object> json(){
		Map<String,Object> map = new HashMap<>();
		map.put("fruit", "orange");
		return map;
	}
}

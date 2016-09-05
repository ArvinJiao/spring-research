package star.spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import star.spring.aop.CupService;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@Autowired
	CupService cupService;

	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello(Model model){
		model.addAttribute("name", "jack");
		return "hello";
	}
	
	
	@RequestMapping(value="json", method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> json(){
		Map<String,Object> map = new HashMap<>();
		map.put("fruit", "orange");
		return map;
	}
	
	@RequestMapping(value="aop", method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> aop(){
		cupService.drink();
		Map<String,Object> map = new HashMap<>();
		map.put("result", "success");
		return map;
	}
	
}

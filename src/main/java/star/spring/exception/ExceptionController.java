package star.spring.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

	@RequestMapping("/exception")
	public @ResponseBody String exception(){
		throw new RuntimeException();
	}

//	@ExceptionHandler
//	public @ResponseBody String exceptionHandler(RuntimeException e){
//		return "exceptionHandler";
//	}
	
	
	
//	@ExceptionHandler
//	public @ResponseBody String exceptionHandler(Exception e){
//		return "exception Handler";
//	}
}

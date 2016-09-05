package star.spring.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController {
	
	@RequestMapping("/pets/{pid}")
	public @ResponseBody String testMatrixVariable(@PathVariable String pid, @MatrixVariable String q){
		
		return "path:" + pid + " MatrixVariable:" + q;
	}

}

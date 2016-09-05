package star.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import star.user.domain.User;
import star.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="get", method=RequestMethod.GET)
	@ResponseBody
	public User getUserById(Integer id){
		User user = userService.getUserById(id);
		return user;
	}
	

	@RequestMapping(value="save", method=RequestMethod.GET)
	@ResponseBody
	public int save(String username, int age){
		User user = new User();
		user.setUsername(username);
		user.setAge(age);
		int save = userService.save2(user);
		return save;
	}
	
}

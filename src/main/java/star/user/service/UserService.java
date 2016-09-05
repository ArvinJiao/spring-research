package star.user.service;

import star.user.domain.User;

public interface UserService {

	User getUserById(Integer id);
	public int save(User user);
	public int save1(User user);
	
	public int save2(User user);
}

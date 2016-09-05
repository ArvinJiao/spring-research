package star.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import star.user.domain.User;
import star.user.mapper.UserMapper;
import star.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Transactional
	@Override
	public int save(User user) {
		int insert = userMapper.insert(user);
		return insert;
	}
	
	@Transactional
	@Override
	public int save1(User user) {
		int insert = userMapper.insert(user);
		return insert;
	}

	@Transactional
	@Override
	public int save2(User user) {
		save(user);
		save1(user);
		return 0;
	}
	

}

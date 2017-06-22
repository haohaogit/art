package cn.art.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.art.dao.UserMapper;
import cn.art.model.User;
import cn.art.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User selectUserById(int uid) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(uid);
	}

}

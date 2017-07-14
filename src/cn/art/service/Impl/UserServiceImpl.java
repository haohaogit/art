package cn.art.service.Impl;

import java.util.List;

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
	@Override
	public List<User> selectUserByName(String uname) {
		// TODO Auto-generated method stub
		return userMapper.selectByName(uname);
	}
	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(record);
	}
	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}
	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}
	@Override
	public int deleteByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(uid);
	}
	@Override
	public List<User> selectManagerByName(String uname) {
		// TODO Auto-generated method stub
		return userMapper.selectByName1(uname);
	}

}

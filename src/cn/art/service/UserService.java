package cn.art.service;

import java.util.List;

import cn.art.model.User;

public interface UserService {
	public User selectUserById(int uid);
	public List<User> selectUserByName(String uname);
	
	public int updateByPrimaryKey(User record);
	public int updateByPrimaryKeySelective(User record);
	
	public int insert(User record);
	public int insertSelective(User record);
	
	public int deleteByPrimaryKey(Integer uid);

}

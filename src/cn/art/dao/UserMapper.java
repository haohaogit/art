package cn.art.dao;

import java.util.List;

import cn.art.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    List<User> selectByName(String uname);
    
    List<User> selectByName1(String uname);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
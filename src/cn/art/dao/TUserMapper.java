package cn.art.dao;

import cn.art.model.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}
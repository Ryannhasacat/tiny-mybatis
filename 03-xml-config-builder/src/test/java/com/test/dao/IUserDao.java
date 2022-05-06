package com.test.dao;

import com.test.po.User;

public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

    String queryUserInfoById(Long uId);

}

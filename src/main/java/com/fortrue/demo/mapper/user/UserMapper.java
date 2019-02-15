package com.fortrue.demo.mapper.user;

import com.fortrue.demo.mapper.BaseMapper;
import com.fortrue.demo.model.user.User;
import com.fortrue.demo.so.user.UserSO;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> getPageList(UserSO userSO);
    Long count(UserSO so);
    int updatePass(User user);
    String getPass(String userName);
}

package com.fortrue.demo.service.user;

import com.fortrue.demo.model.user.User;
import com.fortrue.demo.so.user.UserSO;
import com.fortrue.demo.vo.ResultVO;
import com.fortrue.demo.vo.user.UserVO;


public interface UserService {
    User createAndFind(User user);
    void create(User user);
    User updateAndFind(User user);
    Boolean update(User user);
    Boolean delete(Long id);
    Long count(UserSO so);
    User get(Long id);
    String getPass(String userName);
    Boolean updatePass(User user);
    ResultVO<UserVO> getPageList(UserSO so);
}

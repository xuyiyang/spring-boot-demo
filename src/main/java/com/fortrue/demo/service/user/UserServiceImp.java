package com.fortrue.demo.service.user;

import com.fortrue.demo.mapper.user.UserMapper;
import com.fortrue.demo.model.BaseModel;
import com.fortrue.demo.model.user.User;
import com.fortrue.demo.so.user.UserSO;
import com.fortrue.demo.util.NumberUtil;
import com.fortrue.demo.util.StringUtil;
import com.fortrue.demo.util.VOUtil;
import com.fortrue.demo.vo.ResultVO;
import com.fortrue.demo.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("UserService")
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User createAndFind(User user) {
        user.setActiveFlag(true).setCreateTimeInt(NumberUtil.genCreateTimeInt());
        userMapper.insert(user);
        return userMapper.get(user.getId());
    }

    @Override
    public void create(User user) {
        user.setActiveFlag(true).setCreateTimeInt(NumberUtil.genCreateTimeInt());
        userMapper.insert(user);
    }

    @Override
    public User updateAndFind(User user) {
        if(BaseModel.validateId(user)) {
            userMapper.updateNotNull(user);
            return userMapper.get(user.getId());
        }
        return null;
    }

    @Override
    public Boolean update(User user) {
        if(BaseModel.validateId(user)){
            int num = userMapper.updateNotNull(user);
            return num > 0;
        }
        return false;
    }

    @Override
    public Boolean delete(Long id) {
        if(NumberUtil.isPositive(id)){
            int num = userMapper.delete(id);
            return num > 0;
        }
        return false;
    }

    @Override
    public ResultVO<UserVO> getPageList(UserSO so) {
        Long totalAmount = userMapper.count(so);
        List<UserVO> result = new ArrayList<>();
        List<User> list = userMapper.getPageList(so);
        if(list != null || !list.isEmpty()){
            for(User user : list){
                result.add(new UserVO().setUser(user));
            }
        }
        return VOUtil.genResultVO(result, totalAmount);
    }

    @Override
    public Long count(UserSO so) {
        return userMapper.count(so);
    }

    @Override
    public User get(Long id) {
        if(NumberUtil.isPositive(id)){
            return userMapper.get(id);
        }
        return null;
    }

    @Override
    public String getPass(String userName) {
        String pass = userMapper.getPass(userName);
        return StringUtil.empty2Null(pass);
    }

    @Override
    public Boolean updatePass(User user) {
        if(BaseModel.validateId(user)){
            int num = userMapper.updatePass(user);
            return num > 0;
        }
        return false;
    }
}

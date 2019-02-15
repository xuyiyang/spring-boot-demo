package com.fortrue.demo.controller.user;

import com.fortrue.demo.model.user.User;
import com.fortrue.demo.service.user.UserService;
import com.fortrue.demo.so.user.UserSO;
import com.fortrue.demo.util.VOUtil;
import com.fortrue.demo.vo.ResultVO;
import com.fortrue.demo.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResultVO<UserVO> get(@PathVariable("id") Long id){
        User user = userService.get(id);
        return VOUtil.genResultVO(new UserVO().setUser(user));
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultVO<UserVO> list(UserSO so){
        return userService.getPageList(so);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResultVO<UserVO> create(@RequestBody UserVO userVO){
        User user = userService.createAndFind(userVO.getUser());
        if(user == null){
            return VOUtil.genFailResultVO();
        }
        return VOUtil.genResultVO(new UserVO().setUser(user));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResultVO<Boolean> create(@PathVariable("id") Long id){
        return VOUtil.genResultVO(userService.delete(id));
    }

    @RequestMapping(value = "/changePass", method = RequestMethod.POST)
    public ResultVO<Boolean> changePass(@RequestBody UserVO userVO){
        return VOUtil.genResultVO(userService.updatePass(userVO.getUser()));
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResultVO<UserVO> update(@RequestBody UserVO userVO){
        User user = userService.updateAndFind(userVO.getUser());
        if(user == null){
            return VOUtil.genFailResultVO();
        }
        return VOUtil.genResultVO(new UserVO().setUser(user));
    }

}

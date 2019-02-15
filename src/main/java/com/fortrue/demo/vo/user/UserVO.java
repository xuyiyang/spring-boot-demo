package com.fortrue.demo.vo.user;

import com.fortrue.demo.model.user.User;

public class UserVO {
    private User user;

    public User getUser() {
        return user;
    }

    public UserVO setUser(User user) {
        this.user = user;
        return this;
    }
}

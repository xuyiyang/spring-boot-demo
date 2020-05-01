package com.fortrue.demo.so.user;

import com.fortrue.demo.so.BaseSO;

public class UserSO extends BaseSO {

    private String userName;
    private String nickName;
    private Long phone;
    private String mail;
    private String gender;
    private Boolean activeFlag = true;
    private String userType;

    public String getUserName() {
        return userName;
    }

    public UserSO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public UserSO setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public Long getPhone() {
        return phone;
    }

    public UserSO setPhone(Long phone) {
        this.phone = phone;
        return this;
    }

    public String getMail() {
        return mail;
    }

    public UserSO setMail(String mail) {
        this.mail = mail;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserSO setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Boolean getActiveFlag() {
        return activeFlag;
    }

    public UserSO setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public UserSO setUserType(String userType) {
        this.userType = userType;
        return this;
    }
}

package com.fortrue.demo.model.user;


public class User extends com.fortrue.demo.model.BaseModel {

  private static final long serialVersionUID = 3946028275821915877L;
  private String userName;
  private String nickName;
  private Boolean activeFlag;
  private String userType;
  private Long phone;
  private String mail;
  private String gender;
  private String addr;
  private String password;

  public String getUserName() {
    return userName;
  }

  public User setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getNickName() {
    return nickName;
  }

  public User setNickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  public Boolean getActiveFlag() {
    return activeFlag;
  }

  public User setActiveFlag(Boolean activeFlag) {
    this.activeFlag = activeFlag;
    return this;
  }

  public String getUserType() {
    return userType;
  }

  public User setUserType(String userType) {
    this.userType = userType;
    return this;
  }

  public Long getPhone() {
    return phone;
  }

  public User setPhone(Long phone) {
    this.phone = phone;
    return this;
  }

  public String getMail() {
    return mail;
  }

  public User setMail(String mail) {
    this.mail = mail;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public User setGender(String gender) {
    this.gender = gender;
    return this;
  }

  public String getAddr() {
    return addr;
  }

  public User setAddr(String addr) {
    this.addr = addr;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public User setPassword(String password) {
    this.password = password;
    return this;
  }
}

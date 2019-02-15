package com.fortrue.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BaseModel implements Serializable {


    private static final long serialVersionUID = 2345248746802252585L;

    private Long id;
    private Long version;
    private LocalDateTime createTime;
    private LocalDateTime lastUpdateTime;
    private Integer createTimeInt;

    public Long getId() {
      return id;
    }

    public BaseModel setId(Long id) {
      this.id = id;
      return this;
    }

    public Long getVersion() {
      return version;
    }

    public BaseModel setVersion(Long version) {
      this.version = version;
      return this;
    }

    public LocalDateTime getCreateTime() {
      return createTime;
    }

    public BaseModel setCreateTime(LocalDateTime createTime) {
      this.createTime = createTime;
      return this;
    }

    public LocalDateTime getLastUpdateTime() {
      return lastUpdateTime;
    }

    public BaseModel setLastUpdateTime(LocalDateTime lastUpdateTime) {
      this.lastUpdateTime = lastUpdateTime;
      return this;
    }

    public Integer getCreateTimeInt() {
        return createTimeInt;
    }

    public BaseModel setCreateTimeInt(Integer createTimeInt) {
        this.createTimeInt = createTimeInt;
        return this;
    }
    public static final boolean validateId(BaseModel model){
        if(model == null || model.getId() == null || model.getId() <= 0){
            return false;
        }
        return true;
    }
}

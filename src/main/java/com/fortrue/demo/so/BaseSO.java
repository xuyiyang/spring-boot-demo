package com.fortrue.demo.so;

import java.time.LocalDateTime;
import java.util.List;

public class BaseSO extends BasePageSO{
    private Long id;
    private List<Long> ids;
    private LocalDateTime startCreateTime;
    private LocalDateTime endCreateTime;
    private Integer startCreateTimeInt;
    private Integer endCreateTimeInt;

    public Long getId() {
        return id;
    }

    public BaseSO setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Long> getIds() {
        return ids;
    }

    public BaseSO setIds(List<Long> ids) {
        this.ids = ids;
        return this;
    }

    public LocalDateTime getStartCreateTime() {
        return startCreateTime;
    }

    public BaseSO setStartCreateTime(LocalDateTime startCreateTime) {
        this.startCreateTime = startCreateTime;
        return this;
    }

    public LocalDateTime getEndCreateTime() {
        return endCreateTime;
    }

    public BaseSO setEndCreateTime(LocalDateTime endCreateTime) {
        this.endCreateTime = endCreateTime;
        return this;
    }

    public Integer getStartCreateTimeInt() {
        return startCreateTimeInt;
    }

    public BaseSO setStartCreateTimeInt(Integer startCreateTimeInt) {
        this.startCreateTimeInt = startCreateTimeInt;
        return this;
    }

    public Integer getEndCreateTimeInt() {
        return endCreateTimeInt;
    }

    public BaseSO setEndCreateTimeInt(Integer endCreateTimeInt) {
        this.endCreateTimeInt = endCreateTimeInt;
        return this;
    }
}

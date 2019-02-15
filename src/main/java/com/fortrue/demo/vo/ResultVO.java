package com.fortrue.demo.vo;

import java.util.List;

public class ResultVO<T> {
    private boolean success = false;
    private boolean singleFlag = true;
    private T vo;
    private List<T> list;
    private Long totalAmount;

    public boolean isSuccess() {
        return success;
    }

    public ResultVO<T> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public boolean isSingleFlag() {
        return singleFlag;
    }

    public ResultVO<T> setSingleFlag(boolean singleFlag) {
        this.singleFlag = singleFlag;
        return this;
    }

    public T getVo() {
        return vo;
    }

    public ResultVO<T> setVo(T vo) {
        this.vo = vo;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public ResultVO<T> setList(List<T> list) {
        this.list = list;
        return this;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public ResultVO<T> setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}

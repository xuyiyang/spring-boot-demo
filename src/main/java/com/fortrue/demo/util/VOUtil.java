package com.fortrue.demo.util;

import com.fortrue.demo.vo.ResultVO;

import java.util.List;

public class VOUtil {
    public static final <T> ResultVO<T> genResultVO(T data){
        ResultVO<T> resultVO = new ResultVO<>();
        return resultVO.setSuccess(true).setSingleFlag(true).setVo(data);
    }

    public static final <T> ResultVO<T> genResultVO(List<T> data, Long totalAmount){
        ResultVO<T> resultVO = new ResultVO<>();
        return resultVO.setSuccess(true).setSingleFlag(false).setList(data).setTotalAmount(totalAmount);
    }

    public static final <T> ResultVO<T> genFailResultVO(){
        ResultVO<T> resultVO = new ResultVO<>();
        return resultVO.setSuccess(false);
    }

    public static final <T> ResultVO<T> genSuccessResultVO(){
        ResultVO<T> resultVO = new ResultVO<>();
        return resultVO.setSuccess(true);
    }

    public static final <T> ResultVO<T> genResultVO(Boolean success){
        ResultVO<T> resultVO = new ResultVO<>();
        return resultVO.setSuccess(success != null ? success : false);
    }
}

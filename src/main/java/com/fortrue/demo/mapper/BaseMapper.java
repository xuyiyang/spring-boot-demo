package com.fortrue.demo.mapper;

import com.fortrue.demo.model.BaseModel;

public interface BaseMapper<T extends BaseModel> {
    int insert(T t);
    int updateNotNull(T t);
    int update(T t);
    int delete(Long id);
    T get(Long id);
}

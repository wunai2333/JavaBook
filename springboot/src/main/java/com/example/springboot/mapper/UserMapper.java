package com.example.springboot.mapper;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //@Select("select * from user")
    List<User> list();

    List<User> listByCondition(UserPageRequest userPageRequest);

    void save(User user);

    User getById(Integer id);

    void updateById(User user);

    void delete(Integer id);

    User getByUsername(String username);
}

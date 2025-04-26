package com.example.demo.service;

import com.example.demo.entity.PageResult;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public PageResult<User>  findByName(String userName, int currentPage, int pageSize) {
        int offset = (currentPage - 1) * pageSize;
        List<User> users = userMapper.findUserByName(userName, offset, pageSize);
        int total = userMapper.getRowCountByName(userName);
        return new PageResult<>(users, currentPage, pageSize, total);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int Update(User user){
        return userMapper.Update(user);
    }

    public int delete(int userId){
        return userMapper.delete(userId);
    }

}
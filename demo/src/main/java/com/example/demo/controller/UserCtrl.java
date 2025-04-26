package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.PageResult;
import com.example.demo.entity.PageRequest;
import com.example.demo.entity.ResponseResult;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCtrl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseResult<User> delete(Integer userId) {
        int result = userService.delete(userId);
        if (result >= 1) {
            return new ResponseResult<>(null, "删除成功!", 200);
        } else {
            return new ResponseResult<>(null, "删除失败!", 200);
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<User> update(User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return new ResponseResult<>(null, "修改成功!", 200);
        } else {
            return new ResponseResult<>(null, "修改失败!", 200);
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseResult<User> insert(User user) {
        int result = userService.insertUser(user);
        if (result >= 1) {
            return new ResponseResult<>(null, "新增成功!", 200);
        } else {
            return new ResponseResult<>(null, "新增失败!", 200);
        }
    }

    @RequestMapping("/ListByName")
    @ResponseBody
    public PageResult<User>  ListUserByName(@RequestBody PageRequest pageRequest) {
        return userService.findByName(
                pageRequest.getUserName(),
                pageRequest.getCurrentPage(),
                pageRequest.getPageSize()
        );
    }
}
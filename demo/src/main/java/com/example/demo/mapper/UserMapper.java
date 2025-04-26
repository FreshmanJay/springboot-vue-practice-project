package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findUserByName(@Param("userName") String userName, @Param("offset") int offset, @Param("limit") int limit);

    public int getRowCountByName(@Param("userName") String userName);

    public int insertUser(User user);

    public int delete(int userId);

    public int Update(User user);
}
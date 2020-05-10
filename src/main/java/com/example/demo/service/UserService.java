package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wyh
 * @Date 2020/05/03
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(User user) {
        return userMapper.Sel(user);
    }

    public String Add(User user) {
        int a = userMapper.Add(user);
        if (a == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    public String Update(User user) {
        int a = userMapper.Update(user);
        if (a == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    public String Delete(User user) {
        int a = userMapper.Delete(user);
        if (a == 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

}

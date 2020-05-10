package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * @author wyh
 * @Date 2020/05/03
 *
 * http://127.0.0.1:8080/test/add?competition_event_code=aaa&competition_event_name=123456&suite_type=bbbb&plan_start_at=2020-05-04
 * http://127.0.0.1:8080/test/selectUserByid?competition_event_code=aaa
 * http://127.0.0.1:8080/test/update?competition_event_code=aaa&competition_event_name=123456&suite_type=cccc
 * http://127.0.0.1:8080/test/delete?competition_event_code=aaa
 */

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUserByid", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String GetUser(User user){
        return userService.Sel(user).toString();
    }

    @RequestMapping(value = "/add", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Add(User user){
        return userService.Add(user);
    }

    @RequestMapping(value = "/update", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Update(User user){
        return userService.Update(user);
    }

    @RequestMapping(value = "/delete", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public String Delete(User user){
        return userService.Delete(user);
    }
}

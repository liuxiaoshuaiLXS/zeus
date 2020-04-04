package com.zeus.plate.controller;

import com.zeus.plate.pojo.User;
import com.zeus.plate.result.Result;
import com.zeus.plate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author smile
 * @className LoginController
 * @Description TODO
 * @Date 2020-04-03 18:10
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User user, HttpSession session) {
        //对html标签进行转义，防止xss攻击
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);
        User u = userService.get(username, user.getPassword());
        if (u != null) {
            session.setAttribute("user",u);
            return new Result(200);
        } else {
            return new Result(400);
        }
    }


}

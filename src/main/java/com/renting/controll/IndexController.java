package com.renting.controll;


import com.renting.common.Constants;
import com.renting.common.Utils;
import com.renting.entity.User;
import com.renting.service.impl.UsersImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 接口实现
 */
@RestController
@RequestMapping("/cxx")
public class IndexController {
    @Autowired
    UsersImpl usersimpl;

    /**
     * 登录的接口
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session,HttpServletResponse response, HttpServletRequest request) {
//RequestUtil.getRealIP(request)  获取ip
        User user = usersimpl.UserInfo(username);
        if (user == null) {
            return "用户名不存在！";
        }
        if (user.getPassword().equals(password)) {
            session.setAttribute(Constants.ADMIN_SESSIONID, Utils.encodeCookie(user.getAccount()));
                //把用户信息存入cookie
                // new cookie 空间
                Cookie cname = new Cookie(Constants.ADMIN_COOKIEID, Utils.encodeCookie(user.getAccount()));
                //设置cookie过期时间
                cname.setMaxAge(60);
                //设置全路径
                cname.setPath("/");
                //响应请求 存入cookie
                response.addCookie(cname);


            //把用户名放入session
            session.setAttribute(Constants.ADMIN_SESSIONID, Utils.encodeCookie(user.getAccount()));
//            session.setAttribute("name", user.getAccount());

            return "/index";
        }
        return "密码错误！";
    }

    /**
     * 管理界面的接口
     *
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String index() {
        return "index";
    }

}

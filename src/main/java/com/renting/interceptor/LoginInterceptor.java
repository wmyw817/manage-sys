package com.renting.interceptor;

import com.alibaba.druid.util.StringUtils;
import com.renting.common.Constants;
import com.renting.common.Utils;
import com.renting.entity.User;
import com.renting.service.impl.UsersImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    UsersImpl usersimpl;

    //在请求处理之前进行调用（Controller方法调用之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String adminstr = (String) request.getSession().getAttribute(Constants.ADMIN_SESSIONID);
//        //ps:Constants是自己定义的枚举类
        if (adminstr == null) {
            response.sendRedirect("/");
            return true;
        } else {

            Cookie[] cookies = request.getCookies();
            if (null != cookies) {
                adminstr="";
                for (Cookie cookie : cookies) {
                    if (Constants.ADMIN_COOKIEID.equals(cookie.getName())) {
                        adminstr = cookie.getValue();
                        if (adminstr != null)
                            break;
                    }
                }
                assert adminstr != null;
                User info = usersimpl.UserInfo(Utils.decodeCookie(adminstr));
                if (info!=null)
//                    response.sendRedirect("/index");
                return true;
            }
            response.sendRedirect("/");
            return true;
        }
    }

}




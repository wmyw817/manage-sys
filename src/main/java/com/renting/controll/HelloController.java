package com.renting.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 向前端页面直接传递数据
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello() {
        return "login";
    }

    /**
     * 后台管理系统的入口   · 
     * @param map
     * @return
     */
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.put("thUrl", Arrays.asList("login","sucess","errors","test"));
        return "index";
    }

    /**
     * 登录界面
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/scho")
    public String scho() {
        return "scho";
    }

    @RequestMapping("/sour")
    public String sour() {
        return "sour";
    }

    @RequestMapping("/sucess")
    public String sucess() {
        return "sucess";
    }

    @RequestMapping("/errors")
    public String error() {
        return "errors";
    }

    @RequestMapping("/test")
    public String test(ModelMap map) {
        map.put("thText", "设置文本内容");
        map.put("thUText", "设置文本内容");
        map.put("thValue", "设置当前元素的value值");
        map.put("thUrl", Arrays.asList("login","sucess","errors","test"));
        map.put("thIf", "msg is not null");

        return "test";
    }
}


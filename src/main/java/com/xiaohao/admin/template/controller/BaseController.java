package com.xiaohao.admin.template.controller;

import com.xiaohao.admin.template.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiaohao on 2015/4/24.
 */
@Controller
@RequestMapping("test")
public class BaseController {

    @Autowired
    MyService myService;

    @RequestMapping("index")
    public String index(){

        System.out.println("test");

        return "basic";
    }

    @RequestMapping("frame")
    public String frame(){

        System.out.println("test");

        return "frame";
    }

}

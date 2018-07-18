package com.dx.fo.base.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by duxing on 2018/1/28.
 */
@Controller
public class LogonController {

    @RequestMapping("/index")
    public String index() {
        return "admin/index/index";
    }
    @RequestMapping("/welcome")
    public String welcome() {

        return "admin/index/welcome";
    }
    @RequestMapping("/login")
    public String login() {
        return "ilogin";
    }





}

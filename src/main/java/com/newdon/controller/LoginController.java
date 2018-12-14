package com.newdon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("getin")
    public String loginIn(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if ("admin".equals(username) && "admin".equals(password)) {
            request.getSession().setAttribute("username", username);
        } else {
            model.addAttribute("error", "帐号或密码错误!");
            return "login";
        }
            return "redirect:contract/query";
    }
    @RequestMapping("login")
    public String login() {
        return "login";
    }
    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("username");
        return "login";
    }
    @RequestMapping("notfound")
    public String notfound() {
        return "404";
    }
    @RequestMapping("servererror")
    public String servererror() {
        return "500";
    }
    @RequestMapping("page/{page}")
    public String page(@PathVariable("page")String page) {
        return page;
    }
}

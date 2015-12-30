package com.popant.shiro.controller;

import com.popant.shiro.po.Test;
import com.popant.shiro.po.User;
import com.popant.shiro.service.ITestService;
import com.popant.shiro.util.EncryptUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * <dl>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2015年11月17日</dd>
 * </dl>
 *
 * @author 安宁
 */
@Controller
@RequestMapping("/login")
public class LoginController {
//    @Autowired
//    private ITestService testService;
    @RequestMapping("/showlogin")
    public String showlogin(){
//        List<Test> testList = testService.getTestList();
//        testService.addTest();
        return "login";
    }
    @RequestMapping("/dologin")
    public String dologin(User user,HttpSession session){
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(
                user.getUsercode(), EncryptUtils.encryptMD5(user.getPassword()));
        token.setRememberMe(true);
        try {
            currentUser.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "redirect:/user/myjsp";
        }
        if(currentUser.isAuthenticated()){
            user.setUserName("张三");
            session.setAttribute("userinfo", user);
            return "redirect:/user/myjsp";
        }else{
            return "redirect:/login/showlogin";
        }
    }
    @RequestMapping("/logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.logout();
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return "redirect:/login/showlogin";
    }
}

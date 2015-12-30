package com.popant.shiro.controller;

import com.popant.shiro.po.Test;
import com.popant.shiro.service.ITestService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ITestService testService;
    @RequestMapping("/myjsp")
    @RequiresRoles("padmin")
    @RequiresPermissions("user:myjsp")
    public String myjsp(){
        return "my";
    }

    @RequestMapping("/notmyjsp")
    @RequiresPermissions("user:notmyjsp")
    public String notmyjsp(){
        return "noperms";
    }
}

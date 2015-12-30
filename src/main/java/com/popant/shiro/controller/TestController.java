package com.popant.shiro.controller;

import com.popant.shiro.po.Test;
import com.popant.shiro.service.ITestService;
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
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService testService;
    @RequestMapping("/index")
    public String test(){
        List<Test> testList = testService.getTestList();
//        testService.addTest();
        return "test";
    }
}

package com.popant.shiro.service.impl;

import com.popant.shiro.mapper.TestMapper;
import com.popant.shiro.po.Test;
import com.popant.shiro.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <dl>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2006</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate: 2015年11月18日</dd>
 * </dl>
 *
 * @author 安宁
 */
@Service
public class TestImplServiceImpl implements ITestService {
    @Autowired
    private  TestMapper mapper;
    public List<Test> getTestList() {
        return mapper.queryTest(null);
    }
    @Transactional
    public void addTest(){
        Test test = new Test();
        test.setName("aaa");
        test.setTestName("aaa");
        mapper.add(test);
        Test test1 = new Test();
        test1.setTestName("12312312311231231231123123123112312312311231231231123123123112312312311231231231");
        test1.setName("bbb");
        mapper.add(test1);
    }
}

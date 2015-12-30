package com.popant.shiro.mapper;

import com.popant.shiro.po.Test;
import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * 获取坐席相关信息
 *
 */
public interface TestMapper {
	public List<Test> queryTest(Map<String, Object> map) throws DataAccessException;
	public Integer add(Test test)throws DataAccessException;
}

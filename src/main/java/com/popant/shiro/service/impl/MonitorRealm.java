package com.popant.shiro.service.impl;

import com.popant.shiro.po.User;
import com.popant.shiro.util.EncryptUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("monitorRealm")
public class MonitorRealm extends AuthorizingRealm {
	/*
	 * @Autowired UserService userService;
	 * 
	 * @Autowired RoleService roleService;
	 * 
	 * @Autowired LoginLogService loginLogService;
	 */

	public MonitorRealm() {
		super();

	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		/* 这里编写授权代码 */
		Set<String> roleNames = new HashSet<String>();
	    Set<String> permissions = new HashSet<String>();
	    roleNames.add("admin");
		permissions.add("user:myjsp");
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
	    info.setStringPermissions(permissions);
		return info;

	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		/* 这里编写认证代码 */
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
//		User user = securityApplication.findby(upToken.getUsername());
		User user = new User();
		user.setUsercode(token.getUsername());
		user.setUserName("anning");
		user.setPassword(EncryptUtils.encryptMD5("anning"));
//		if (user != null) {
		return new SimpleAuthenticationInfo(user.getUserName(),
				user.getPassword(), getName());


	}

	public void clearCachedAuthorizationInfo(String principal) {
		SimplePrincipalCollection principals = new SimplePrincipalCollection(
				principal, getName());
		clearCachedAuthorizationInfo(principals);
	}

}

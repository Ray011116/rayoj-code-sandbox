package com.ray.rayojcodesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 */
public class DenySecurityManager extends SecurityManager {

    /**
     * 禁用所有权限
     * @param perm   the requested permission.
     */
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常" + perm.toString());
    }
}

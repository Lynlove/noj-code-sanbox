package com.lyn.nojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有权限安全管理器
 */
public class MySecurityManager extends SecurityManager {

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
        System.out.println(perm);
        // super.checkPermission(perm);
    }

    @Override
    public void checkRead(String file) {
        throw new SecurityException("checkRead 权限异常：" + file);
    }

    public void checkWrite(String file) {
        throw new SecurityException("checkWrite 权限异常：" + file);
    }

    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限异常：" + cmd);
    }

    /**
     * 网络连接权限
     * @param host   the host name port to connect to.
     * @param port   the protocol port to connect to.
     */
    @Override
    public void checkConnect(String host, int port) {
        throw new SecurityException("checkConnect 权限异常：" + host + ":" + port);
    }


}
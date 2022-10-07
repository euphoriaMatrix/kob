package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author xwfstart
 * @create 2022-10-03 9:47
 */
public interface LoginService {
    Map<String, String> getToken(String username, String password);
}

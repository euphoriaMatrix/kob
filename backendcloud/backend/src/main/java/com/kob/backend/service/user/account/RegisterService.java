package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author xwfstart
 * @create 2022-10-03 9:48
 */
public interface RegisterService {
    Map<String, String> register(String username, String password, String confirmedPassword);
}

package com.kob.botrunningsystem.service.impl;

import com.kob.botrunningsystem.service.BotRunningService;
import com.kob.botrunningsystem.service.impl.utils.BotPool;
import com.kob.botrunningsystem.service.impl.utils.ThreadPool;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author xwfstart
 * @create 2022-10-07 13:15
 */
@Service
public class BotRunningServiceImpl implements BotRunningService {

    public static final BotPool BOT_POOL = new BotPool();

    @PostConstruct
    public void init() {
        ThreadPool.getInstance().createBotRunningThread(BOT_POOL);
    }
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " " + botCode + " " + input);
        BOT_POOL.addBot(userId, botCode, input);
        return "add bot success!";
    }
}

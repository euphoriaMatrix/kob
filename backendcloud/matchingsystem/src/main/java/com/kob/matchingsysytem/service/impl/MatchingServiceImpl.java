package com.kob.matchingsysytem.service.impl;

import com.kob.matchingsysytem.service.MatchingService;
import com.kob.matchingsysytem.service.impl.utils.MatchingPool;
import com.kob.matchingsysytem.service.impl.utils.ThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xwfstart
 * @create 2022-10-07 0:07
 */
@Service
public class MatchingServiceImpl implements MatchingService {

    public static MatchingPool matchingPool;

    @Autowired
    public void setMatchingPool(MatchingPool matchingPool) {
        MatchingServiceImpl.matchingPool = matchingPool;
        ThreadPool.getInstance().createMatchThread(MatchingServiceImpl.matchingPool);
    }

    @Override
    public String addPlayer(Integer userId, Integer rating, Integer botId) {
        System.out.println("add player: " + userId + ", rating: " + rating);
        matchingPool.addPlayer(userId, rating, botId);
        return "add player success!";
    }

    @Override
    public String removePlayer(Integer userId) {
        System.out.println("remove player: " + userId);
        matchingPool.removePlayer(userId);
        return "remove player success!";
    }
}

package com.kob.matchingsysytem.service;

/**
 * @author xwfstart
 * @create 2022-10-07 0:04
 */
public interface MatchingService {
    String addPlayer(Integer userId, Integer rating);
    String removePlayer(Integer userId);
}

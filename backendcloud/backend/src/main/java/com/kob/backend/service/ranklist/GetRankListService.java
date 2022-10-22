package com.kob.backend.service.ranklist;

import com.alibaba.fastjson2.JSONObject;

/**
 * @author xwfstart
 * @create 2022-10-22 18:55
 */
public interface GetRankListService {
    JSONObject getList(Integer page);
}

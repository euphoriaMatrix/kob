package com.kob.backend.service.record;

import com.alibaba.fastjson2.JSONObject;

/**
 * @author xwfstart
 * @create 2022-10-22 16:39
 */
public interface GetRecordListService {
    JSONObject getList(Integer page);
}

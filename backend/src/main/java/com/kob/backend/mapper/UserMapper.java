package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xwfstart
 * @create 2022-09-24 20:06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

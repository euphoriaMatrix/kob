package com.kob.botrunningsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xwfstart
 * @create 2022-10-06 23:56
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getResTemplate() {
        return new RestTemplate();
    }
}

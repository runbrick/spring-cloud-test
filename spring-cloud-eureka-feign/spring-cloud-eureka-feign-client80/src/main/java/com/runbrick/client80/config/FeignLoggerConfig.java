package com.runbrick.client80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Feign 的日志配置
 */
@Component
public class FeignLoggerConfig {

    /**
     * NONE 不记录日志
     * BASIC 仅记录请求方法和 URL 以及响应状态代码和执行时间。
     * HEADERS 记录基本信息以及请求和响应标头。
     * FULL 记录请求和响应的标头、正文和元数据
     *
     * @return 日志的等级
     */
    @Bean
    Logger.Level loggerLevel() {
        return Logger.Level.FULL;
    }
}

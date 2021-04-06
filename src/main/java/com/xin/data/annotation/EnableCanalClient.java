package com.xin.data.annotation;

import org.springframework.context.annotation.Import;

import com.xin.data.config.CanalClientConfiguration;
import com.xin.data.config.CanalConfig;

import java.lang.annotation.*;

/**
 * 开启 Canal 客户端
 *
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CanalConfig.class, CanalClientConfiguration.class})
public @interface EnableCanalClient {
}
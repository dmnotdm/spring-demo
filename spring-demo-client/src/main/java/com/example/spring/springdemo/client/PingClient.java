package com.example.spring.springdemo.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhizhao.zhang on 2019/02/23 22:12.
 * Description:
 */
@FeignClient(name = "demo1", path = "demo1")
public interface PingClient {
    @RequestMapping("ping")
    public Object ping();

    @RequestMapping("name")
    public Object name(String name);
}

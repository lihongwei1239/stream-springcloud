package com.stream.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "stream-capricorn-service-web",fallbackFactory = HelloFeignHystrix.class)
public interface HelloFeign {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}

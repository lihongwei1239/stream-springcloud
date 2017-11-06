package com.stream.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "stream-order-service-web",fallbackFactory = HelloFeignHystrix.class)
public interface HelloFeign {

    @RequestMapping(value = "/hello/{name}")
    String hello(@PathVariable("name") String name);
}

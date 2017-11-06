package com.stream.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignHystrix implements FallbackFactory<HelloFeign> {


    @Override
    public HelloFeign create(Throwable throwable) {
        return name -> {
            return "hello "+ name +", this messge send failed";
        };
    }
}


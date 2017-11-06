package com.stream.web;

import com.stream.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloFeign helloFeign;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloFeign.hello(name);
    }

}

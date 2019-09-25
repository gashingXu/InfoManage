package org.song;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController//用来表示Spring某个类(HelloController)的是否可以接收HTTP请求
public class HelloController {
    @GetMapping("/hellod")
    public String hello() {
        return "许嘉成，工作号为：201841882101 ";
    }
}
//@RestController与@GetMapping共同作用用来指定路由映射

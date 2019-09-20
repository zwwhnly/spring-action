package chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/index")
    public String hello() {
        // 这里返回的逻辑视图名
        return "index";
    }
}

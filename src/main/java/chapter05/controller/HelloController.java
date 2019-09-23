package chapter05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/hello", "/index"})
public class HelloController {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String hello() {
        // 这里返回的逻辑视图名
        return "index";
    }
}

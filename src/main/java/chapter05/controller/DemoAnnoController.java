package chapter05.controller;

import chapter05.model.DemoObj;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String index(HttpServletRequest request) {
        return "url:" + request.getRequestURI() + " can access";
    }

    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String demoPathVar(@PathVariable String str, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + " can access,str: " + str;
    }

    @RequestMapping(value = "/requestParam", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(@RequestParam(value = "id", defaultValue = "1") Long id, @RequestParam(value = "name", defaultValue = "zwwhnly") String name,
                                   HttpServletRequest request) {
        return "url:" + request.getRequestURI() + " can access,id: " + id + ",name=" + name;
    }

    @RequestMapping(value = "/passObj", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String passObj(@RequestBody DemoObj demoObj, HttpServletRequest request) {
        return "url:" + request.getRequestURI() + " can access,demoObj id：" + demoObj.getId() +
                " demoObj name:" + demoObj.getName();
    }

    @RequestMapping(value = {"/name1", "name2"}, produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURI() + " can access";
    }
}

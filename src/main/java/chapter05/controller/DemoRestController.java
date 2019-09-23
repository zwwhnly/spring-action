package chapter05.controller;

import chapter05.model.DemoObj;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@RequestMapping("/rest")
@Controller
@ResponseBody
public class DemoRestController {
    @RequestMapping(value = "/getjson", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DemoObj getjson(@RequestBody DemoObj demoObj) {
        return new DemoObj(demoObj.getId(), demoObj.getName());
    }
}

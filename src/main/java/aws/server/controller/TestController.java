package aws.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String test(){
        return "test code 입니당";
    }
    @GetMapping("/hello")
    public String hello(){
        return "안뇽 반가웡";
    }
}

package sidang03121993.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    public String HelloWorld(){
        return "Hello World";
    }
    @GetMapping("/si")
    public String HelloSi(){
        return "Hello si";
    }
    @GetMapping("/ngoc")
    public String HelloNgoc(){
        return "Hello Ngoc";
    }
}

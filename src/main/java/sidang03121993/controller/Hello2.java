package sidang03121993.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class Hello2 {
    @RequestMapping(method = RequestMethod.GET)  // mac dinh chay vao khi get posman den http://localhost:8080/products
    public String listProduct(){
        return "Hello get";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/detail")
    public String productDetail(){
        return "hello detail";
    }
    @RequestMapping(method = RequestMethod.POST) // mac dinh chay vao khi post postman den http://localhost:8080/products
    public String helloPost(){
        return "hello post....";
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/testPut")
    public String helloPut(){
        return "hello put....";
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/testDelete")
    public String helloDelete(){
        return "hello put....";
    }
}

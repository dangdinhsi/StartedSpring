package sidang03121993.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sidang03121993.entity.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/hero")
@CrossOrigin
public class Hello3 {
    private static List<Hero> list = new ArrayList<>();
    @RequestMapping(method = RequestMethod.GET)
    public HashMap<String,Object> listHero(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("data",list);
        return hashMap;
        /*return ResponseEntity<Object>(hashMap, HttpStatus.OK);*/
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public String HeroDetail(@PathVariable String id){
        return String.format("Details with id: %s",id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public boolean addHero(@RequestBody Hero hero){
        list.add(hero);
        return true;
    }
}

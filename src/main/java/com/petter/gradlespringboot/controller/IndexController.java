package com.petter.gradlespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : GD
 * @date :2021/4/27 : 9:14
 */
@RestController("test")
public class IndexController {

    @GetMapping("/index")
    @ResponseBody
    public String index(){
        return "this is a index page result !" ;
    }
}

package com.suny.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Suny
 * @create 2018-03-30
 **/
@RestController
public class Wechat {
    
    @GetMapping(value = "/test", produces = APPLICATION_JSON_VALUE)
    public String test() {
        return "wechat test";
    }
}

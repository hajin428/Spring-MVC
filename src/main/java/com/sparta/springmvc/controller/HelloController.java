package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

//url에 중복된 코드를 MAPPING 하기
//맵핑된 주소가 아래 패스들에 모두 적용됨
@RequestMapping("/api")

public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @PostMapping("/post")
    @ResponseBody
    public String POST() {
        return "URL 바꾼 post";
    }

    @PutMapping("/put")
    @ResponseBody
    public String PUT() {
        return "PUT 메서드 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String DELETE() {
        return "Delete";
    }
}

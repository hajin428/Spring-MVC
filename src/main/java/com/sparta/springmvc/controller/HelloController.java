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


    //정적 페이지 동적 페이지
    //정적 페이지는 Thymeleaf를 통해 static 패키지의 파일을 작동 시킴
    //컨트롤러에서는 템플릿 패키지에 있는 파일을 작동 시키는데
    //템플릿이 없을 때는 "redirest"를 사용해서 직접 호출 가능
    @GetMapping ("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }
}

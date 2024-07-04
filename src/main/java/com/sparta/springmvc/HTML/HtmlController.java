package com.sparta.springmvc.HTML;

//정적 페이지와 동적 페이지
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/static-hello")
    public String hello() {
        return "hello, html";
    }

// thymeleaf 동적인 html 파일을 만들기 위한 라이브러리
// 스프링 부트에서 controller에서는 html파일을 찾을 때 templates 폴더에서 찾음

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }
}

package ru.msaggik.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello-world") // пример запроса пользователя
    public String sayHello() {
        return "hello_world";
    }
}

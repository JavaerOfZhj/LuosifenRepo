package com.wmj.luosifen.web.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wmj
 * @date 2024年08月13日 20:19
 */
@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping("/tudoutudou")
    public String hello() {
        return "地瓜地瓜，土豆收到！";
    }
}

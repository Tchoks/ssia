package com.tchokonthe.ssia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author martin
 * @created on 07/11/2021 at 16:42
 * @project com.tchokonthe.ssia
 * @email (martin.aurele12 @ gmail.com)
 */


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}

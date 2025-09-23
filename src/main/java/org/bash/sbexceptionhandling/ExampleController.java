package org.bash.sbexceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping
    public String hello() {
        int result = 2 / 0;
        return "Division by zero";
    }
}

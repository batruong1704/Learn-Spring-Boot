package org.example.learn_spring_boot.controller;

import org.example.learn_spring_boot.model.greetingModel;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/v1")
public class greetingController {

    private static final String template = "Hello, %s %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public greetingModel greeting(
            @RequestParam(name = "gender", defaultValue = "0") boolean gender,
            @RequestParam(name = "name", defaultValue = "Customer") String customer
            ){
        return greetingModel.builder()
                .id(counter.incrementAndGet())
                .message(String.format(template, gender ? "Mr. " : "Ms. ", customer))
                .build();
    }

}

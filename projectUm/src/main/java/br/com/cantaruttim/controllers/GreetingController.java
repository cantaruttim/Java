package br.com.cantaruttim.controllers;

import br.com.cantaruttim.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// identifica a classe como um controller (abstração)
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // param
    // http://localhost:8080/greeting?name=Matheus
    @RequestMapping("/greeting") // existe uma solução melhor
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")
            String name) {
        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, name)
        );
    }

}

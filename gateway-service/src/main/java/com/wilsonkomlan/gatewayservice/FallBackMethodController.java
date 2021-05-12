package com.wilsonkomlan.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/admissionServiceFallBack")
    public String admissionServiceFallBackMethod() {
        return "Admission Service is taken longer than expected" + " Please try again later!";
    }

    @GetMapping("/hrServiceFallBack")
    public String hrServiceFallBackMethod() {
        return "HR Service is taken longer than expected" + " Please try again later!";
    }

    @GetMapping("/pathologyServiceFallBack")
    public String pathologyServiceFallBackMethod() {
        return "Phatology Service is taken longer than expected" + " Please try again later!";
    }
}

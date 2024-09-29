package it.macgood.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Map;

@RestController
@RequestMapping("/main")
public class TestController {
    @Value("${eureka.instance.instance-id}")
    private String instance;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        Map<String, ? extends Serializable> message = Map.of(
                "message", "This is a test message from the TestController",
                "instance-id", instance,
                "timestamp", System.currentTimeMillis()
        );
        return ResponseEntity.ok(message);
    }
}

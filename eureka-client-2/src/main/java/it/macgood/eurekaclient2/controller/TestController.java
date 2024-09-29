package it.macgood.eurekaclient2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Map;

@RestController
@RequestMapping("/new")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        Map<String, ? extends Serializable> message = Map.of(
                "message", "This is a test message from the TestController",
                "timestamp", System.currentTimeMillis()
        );
        return ResponseEntity.ok(message);
    }
}

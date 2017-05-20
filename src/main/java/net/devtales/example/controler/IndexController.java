package net.devtales.example.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World");
    }
}

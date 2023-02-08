package com.read.cleancode._03_exception.badexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLException;

@Controller
public class ExController {

    private final ExService exService;

    public ExController(ExService exService) {
        this.exService = exService;
    }

    @GetMapping("/ex")
    public void checkedTest() throws SQLException {
        exService.checkedTest();
    }

    @GetMapping("/un-ex")
    public void uncheckedTest() {
        exService.uncheckedTest();
    }

}

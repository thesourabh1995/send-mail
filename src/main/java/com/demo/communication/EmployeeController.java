package com.demo.communication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/sendEmail")
//    @Operation(summary = "Send an email", description = "Send an email to the specified recipient")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        employeeService.sendEmail(to, subject, text);
        return "Email sent successfully";
    }
}

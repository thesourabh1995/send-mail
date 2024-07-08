package com.demo.communication;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    public void sendEmail(String to, String subject, String content);
}

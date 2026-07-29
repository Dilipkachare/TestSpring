package com.dilip.auditing;

import com.dilip.auditing.entity.Employee;
import com.dilip.auditing.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuditingApplication implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(AuditingApplication.class, args);
    }
    @Override
    public void run(String... args) {
        Employee emp=new Employee();
        emp.setName("Dilip");
        emp.setCompany("Sumicro");
        employeeService.create(emp);
    }
}

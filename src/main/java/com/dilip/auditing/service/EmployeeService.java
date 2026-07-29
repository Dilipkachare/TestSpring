package com.dilip.auditing.service;

import com.dilip.auditing.entity.Employee;
import com.dilip.auditing.repository.Employeerepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private Employeerepo employeerepo;

    public  void create(Employee emp){
        employeerepo.save(emp);
    }
}

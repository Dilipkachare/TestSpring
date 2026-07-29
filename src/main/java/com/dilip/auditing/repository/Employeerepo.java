package com.dilip.auditing.repository;

import com.dilip.auditing.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepo extends JpaRepository<Employee, Integer> {
}

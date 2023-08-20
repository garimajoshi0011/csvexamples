package com.simplejava.csvexample.csvexapmple.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplejava.csvexample.csvexapmple.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
package com.ds.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.entity.Employee;

public interface IEmployeeRepositery extends JpaRepository<Employee, Integer> {

}

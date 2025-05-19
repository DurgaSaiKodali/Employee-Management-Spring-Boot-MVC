package com.ds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.entity.Employee;
import com.ds.repositery.IEmployeeRepositery;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepositery empRepo;
	

	@Override
	public Iterable<Employee> showAllEmployees() {
	
		return empRepo.findAll() ;
	}

}

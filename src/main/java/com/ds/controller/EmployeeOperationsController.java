package com.ds.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ds.entity.Employee;
import com.ds.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgmtService empService;
	
	@GetMapping("/")
	public String showHomePage() {
		//return lvn
		return"welcome";
	}
	@GetMapping("/report")
	public String showEmployeeReportData(Map<String,Object>map) {
		//use service
		Iterable<Employee>empsList=empService.showAllEmployees();
		//keep results in shared memory
		map.put("empData", empsList);
		//retunr LVN
		return "show_report";
		
	}

}

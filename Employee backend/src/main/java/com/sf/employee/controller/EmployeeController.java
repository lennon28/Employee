package com.sf.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sf.employee.bean.EmployeeBean;
import com.sf.employee.service.EmployeeService;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000")

public class EmployeeController {

	@Autowired
	private EmployeeService eserv;
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeBean employeeBean) {
		System.out.println( employeeBean);
		return eserv.addEmployee( employeeBean);
	}
	@GetMapping("/getEmployee")
	public List<EmployeeBean> viewEmployee(){
		return eserv.viewEmployee();
	}
	@GetMapping("/Employee/{code}")
	public EmployeeBean meth3(@PathVariable(value = "code") String empcode)
	{
		return eserv.viewEmployeeByCode(empcode);
		
	}
	@PutMapping("/updateEmployee")
	public boolean modifyEmployee(@RequestBody EmployeeBean employeeBean) {
		return eserv.modifyEmployee(employeeBean);
	}
		
	} 



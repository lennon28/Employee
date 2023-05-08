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

import com.sf.employee.bean.RoleBean;

import com.sf.employee.service.RoleService;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000")
public class RoleController {

	@Autowired
	private RoleService rserv;
	@PostMapping("/addRole")
	public String addRole(@RequestBody RoleBean roleBean) {
		System.out.println( roleBean);
		return rserv.addRole( roleBean);
	}
	@GetMapping("/getRole")
	public List<RoleBean> viewRole(){
		return rserv.viewRole();
	}
	@GetMapping("/Role/{id}")
	public RoleBean meth3(@PathVariable(value = "id") String ROLE_CODE)
	{
		return rserv.viewRoleByCode(ROLE_CODE);
		
	}
	@PutMapping("/updateRole")
	public boolean modifyRole(@RequestBody RoleBean roleBean) {
		return rserv.modifyRole(roleBean);
	}
		
}

package com.sf.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sf.employee.bean.EmployeeBean;
import com.sf.employee.dao.EmployeeDao;



@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao edao;

	public String addEmployee(EmployeeBean employeeBean) {
		return edao.addEmployee(employeeBean);

}
	public EmployeeBean viewEmployeeByCode(String empcode)
	{
		return edao.viewEmployeeByCode(empcode);
	}
	public List<EmployeeBean> viewEmployee(){
		return edao.viewEmployee();
	}
	public boolean modifyEmployee(EmployeeBean employeeBean) {
		return edao.modifyEmployee(employeeBean);
	}
}
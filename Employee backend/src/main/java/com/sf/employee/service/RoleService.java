package com.sf.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.employee.bean.RoleBean;

import com.sf.employee.dao.RoleDao;

@Service
public class RoleService {

	
	@Autowired
	private RoleDao rdao;

	public String addRole(RoleBean roleBean) {
		return rdao.addRole(roleBean);

}
	public RoleBean viewRoleByCode(String ROLE_CODE)
	{
		return rdao.viewRoleByCode(ROLE_CODE);
	}
	public List<RoleBean> viewRole(){
		return rdao.viewRole();
	}
	public boolean modifyRole(RoleBean roleBean) {
		return rdao.modifyRole(roleBean);
	}
}

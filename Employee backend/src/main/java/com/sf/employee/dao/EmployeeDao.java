package com.sf.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.sf.employee.bean.BranchBean;
import com.sf.employee.bean.EmployeeBean;


@Repository

public class EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	

	public String addEmployee(EmployeeBean employeeBean) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(employeeBean);
		transaction.commit();
		session.close();
		return "success";

}
	public EmployeeBean viewEmployeeByCode(String empcode) {
		
		EmployeeBean elBean=new EmployeeBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<EmployeeBean> q2=session.createQuery("from EmployeeBean where EM_EMPLOYEE_CODE=:EM_EMPLOYEE_CODE");
	q2.setParameter("EM_EMPLOYEE_CODE", empcode);
	ArrayList<EmployeeBean> all=(ArrayList<EmployeeBean>) q2.getResultList();
	for(EmployeeBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}

	public List<EmployeeBean> viewEmployee(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from EmployeeBean");
		return (ArrayList<EmployeeBean>) q.list();
		
	}
	public boolean modifyEmployee(EmployeeBean employeeBean) {
	    boolean isSuccess = true;
	    try {
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        session.update(employeeBean);
	        transaction.commit();
	        session.close();
	    } catch (Exception e) {
	        isSuccess = false;
	        e.printStackTrace();
	    }
	    return isSuccess;
	}
}

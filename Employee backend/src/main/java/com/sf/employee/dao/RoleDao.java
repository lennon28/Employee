package com.sf.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.employee.bean.RoleBean;

@Repository
public class RoleDao {


	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	

	public String addRole(RoleBean roleBean) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save( roleBean);
		transaction.commit();
		session.close();
		return "success";

}
	public RoleBean viewRoleByCode(String ROLE_CODE) {
		
		RoleBean elBean=new RoleBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<RoleBean> q2=session.createQuery("from RoleBean where ROLE_CODE=:ROLE_CODE");
	q2.setParameter("ROLE_CODE", ROLE_CODE);
	ArrayList<RoleBean> all=(ArrayList<RoleBean>) q2.getResultList();
	for(RoleBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}

	public List<RoleBean> viewRole(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from RoleBean");
		return (ArrayList<RoleBean>) q.list();
		
	}
	public boolean modifyRole(RoleBean roleBean) {
	    boolean isSuccess = true;
	    try {
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        session.update(roleBean);
	        transaction.commit();
	        session.close();
	    } catch (Exception e) {
	        isSuccess = false;
	        e.printStackTrace();
	    }
	    return isSuccess;
	}
}

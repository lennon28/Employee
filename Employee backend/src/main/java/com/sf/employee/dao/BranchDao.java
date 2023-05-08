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
import com.sf.employee.bean.Country;


@Repository
public class BranchDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	

	public String addBranch(BranchBean branchBean) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save(branchBean);
		transaction.commit();
		session.close();
		return "success";

}
	public List<BranchBean> viewBranch(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from BranchBean");
		return (ArrayList<BranchBean>) q.list();
		
	}
public BranchBean getBranchbycode(String branchcode) {
		
		BranchBean elBean=new BranchBean();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		Query<BranchBean> q=session.createQuery("from BranchBean where BRANCH_CODE=:BRANCH_CODE");
		q.setParameter("BRANCH_CODE", branchcode);
		ArrayList<BranchBean> all=(ArrayList<BranchBean>) q.getResultList();
		for( BranchBean e1:all)
		{
			elBean=e1;
		}
		return elBean;
		}
	public boolean modifyBranch(BranchBean branchBean) {
	    boolean isSuccess = true;
	    try {
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        session.update(branchBean);
	        transaction.commit();
	        session.close();
	    } catch (Exception e) {
	        isSuccess = false;
	        e.printStackTrace();
	    }
	    return isSuccess;
	}

}

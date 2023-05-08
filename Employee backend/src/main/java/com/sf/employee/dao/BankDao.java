package com.sf.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.employee.bean.BankBean;

@Repository
public class BankDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	private Query q;
	

	public String addBank(BankBean bankBean) {
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		session.save( bankBean);
		transaction.commit();
		session.close();
		return "success";

}
	public BankBean viewBankById(int BANK_ID) {
		
		BankBean elBean=new BankBean();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	Query<BankBean> q2=session.createQuery("from BankBean where BANK_ID=:BANK_ID");
	q2.setParameter("BANK_ID", BANK_ID);
	ArrayList<BankBean> all=(ArrayList<BankBean>) q2.getResultList();
	for(BankBean e1:all)
	{
		elBean=e1;
	}
	return elBean;
	}

	public List<BankBean> viewBank(){
		session=session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		 q=session.createQuery("from BankBean");
		return (ArrayList<BankBean>) q.list();
		
	}
	public boolean modifyBank(BankBean bankBean) {
	    boolean isSuccess = true;
	    try {
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        session.update(bankBean);
	        transaction.commit();
	        session.close();
	    } catch (Exception e) {
	        isSuccess = false;
	        e.printStackTrace();
	    }
	    return isSuccess;
	}

}

package com.sf.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.employee.bean.BankBean;

import com.sf.employee.dao.BankDao;

@Service
public class BankService {
	
	@Autowired
	private BankDao bdao;

	public String addBank(BankBean bankBean) {
		return bdao.addBank(bankBean);

}
	public BankBean viewBankById(int BANK_ID)
	{
		return bdao.viewBankById(BANK_ID);
	}
	public List<BankBean> viewBank(){
		return bdao.viewBank();
	}
	public boolean modifyBank(BankBean bankBean) {
		return bdao.modifyBank(bankBean);
	}


}

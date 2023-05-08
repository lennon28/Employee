package com.sf.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.employee.bean.BranchBean;
import com.sf.employee.bean.State;
import com.sf.employee.dao.BranchDao;


@Service
public class BranchService {

	@Autowired
	private BranchDao bdao;

	public String addBranch(BranchBean branchBean) {
		return bdao.addBranch(branchBean);

}
	 public BranchBean getbranchcode(String branchcode) {
		 return bdao.getBranchbycode(branchcode);
	 }
	 
	public List<BranchBean> viewBranch(){
		return bdao.viewBranch();
	}
	public boolean modifyBranch(BranchBean branchBean) {
		return bdao.modifyBranch(branchBean);
	}
}

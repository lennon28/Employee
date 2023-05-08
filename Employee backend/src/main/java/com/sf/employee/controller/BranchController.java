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

import com.sf.employee.bean.BranchBean;
import com.sf.employee.bean.State;
import com.sf.employee.service.BranchService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000")


public class BranchController {
      
	@Autowired
	private BranchService bserv;
	@PostMapping("/addBranch")
	public String addBranch(@RequestBody BranchBean branchBean) {
		System.out.println( branchBean);
		return bserv.addBranch( branchBean);
	}
	@GetMapping("/getBranch")
	public List<BranchBean> viewBranch(){
		return bserv.viewBranch();
		
	}
	@GetMapping("/branchbycode/{code}")
	public BranchBean getbranchcode(@PathVariable(value = "code") String branchcode)
	{
		
		return bserv.getbranchcode(branchcode);
	}
	@PutMapping("/updateBranch")
	public boolean modifyBranch(@RequestBody BranchBean branchBean) {
		return bserv.modifyBranch(branchBean);
	}
	
		
}

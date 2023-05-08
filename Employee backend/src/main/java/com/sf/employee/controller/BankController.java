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

import com.sf.employee.bean.BankBean;
import com.sf.employee.service.BankService;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000")

public class BankController {
   
	@Autowired
	private BankService bserv;
	@PostMapping("/addBank")
	public String addBank(@RequestBody BankBean bankBean) {
		System.out.println( bankBean);
		return bserv.addBank( bankBean);
	}
	@GetMapping("/getBank")
	public List<BankBean> viewBank(){
		return bserv.viewBank();
	}
	@GetMapping("/Bank/{id}")
	public BankBean meth3(@PathVariable(value = "id") int BANK_ID)
	{
		return bserv.viewBankById(BANK_ID);
		
	}
	@PutMapping("/updateBank")
	public boolean modifyBank(@RequestBody BankBean bankBean) {
		return bserv.modifyBank(bankBean);
	}
		
	} 



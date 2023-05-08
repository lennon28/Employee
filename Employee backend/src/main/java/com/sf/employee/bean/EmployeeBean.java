package com.sf.employee.bean;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="SA_EMPLOYEE_MASTER")

public class EmployeeBean {
	
	
	@Id
	private String EM_EMPLOYEE_CODE;
	@ManyToOne
	@JoinColumn(name="BRANCH_CODE")
	private BranchBean branchBean;
	@Column(nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String EM_TXN_ID;
	@Column
	private String EM_NAME_INFO;
	@Column
	private String EM_STATUS_IND;
	@Column
	private String EM_ADDRESS1;
	@Column
	private String EM_ADDRESS2;
	@Column
	private String EM_ADDRESS3;
	
	@ManyToOne
	@JoinColumn(name="locationid")
	private Location location;
	@Column
	private String pincode;
	@Column
	private String MOBILE_NO;
	@Column
	private String EMAIL_ID;
	@Column
	private String WEBSITE;
	@Column
	private Date EM_START_DATE;
	@Column
	private Date EM_END_DATE;
	@Column
	private long IMEI_NO1;
	@Column
	private long IMEI_NO2;
	@ManyToOne
	@JoinColumn(name="ROLE_CODE")
	private RoleBean roleBean;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="BANK_ID")
	
	private BankBean bankBean;
	
	

	public BankBean getBankBean() {
		return bankBean;
	}
	public void setBankBean(BankBean bankBean) {
		this.bankBean = bankBean;
	}
	public RoleBean getRoleBean() {
		return roleBean;
	}
	public void setRoleBean(RoleBean roleBean) {
		this.roleBean = roleBean;
	}
	public String getEM_ADDRESS1() {
		return EM_ADDRESS1;
	}
	public void setEM_ADDRESS1(String eM_ADDRESS1) {
		EM_ADDRESS1 = eM_ADDRESS1;
	}
	public String getEM_ADDRESS2() {
		return EM_ADDRESS2;
	}
	public void setEM_ADDRESS2(String eM_ADDRESS2) {
		EM_ADDRESS2 = eM_ADDRESS2;
	}
	public String getEM_ADDRESS3() {
		return EM_ADDRESS3;
	}
	public void setEM_ADDRESS3(String eM_ADDRESS3) {
		EM_ADDRESS3 = eM_ADDRESS3;
	}
	
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	public String getEMAIL_ID() {
		return EMAIL_ID;
	}
	public void setEMAIL_ID(String eMAIL_ID) {
		EMAIL_ID = eMAIL_ID;
	}
	public String getWEBSITE() {
		return WEBSITE;
	}
	public void setWEBSITE(String wEBSITE) {
		WEBSITE = wEBSITE;
	}
	public String getEM_EMPLOYEE_CODE() {
		return EM_EMPLOYEE_CODE;
	}
	public void setEM_EMPLOYEE_CODE(String eM_EMPLOYEE_CODE) {
		EM_EMPLOYEE_CODE = eM_EMPLOYEE_CODE;
	}
	public BranchBean getBranchBean() {
		return branchBean;
	}
	public void setBranchBean(BranchBean branchBean) {
		this.branchBean = branchBean;
	}
	public String getEM_TXN_ID() {
		return EM_TXN_ID;
	}
	public void setEM_TXN_ID(String eM_TXN_ID) {
		EM_TXN_ID = eM_TXN_ID;
	}
	public String getEM_NAME_INFO() {
		return EM_NAME_INFO;
	}
	public void setEM_NAME_INFO(String eM_NAME_INFO) {
		EM_NAME_INFO = eM_NAME_INFO;
	}
	public String getEM_STATUS_IND() {
		return EM_STATUS_IND;
	}
	public void setEM_STATUS_IND(String eM_STATUS_IND) {
		EM_STATUS_IND = eM_STATUS_IND;
	}
	public Date getEM_START_DATE() {
		return EM_START_DATE;
	}
	public void setEM_START_DATE(Date eM_START_DATE) {
		EM_START_DATE = eM_START_DATE;
	}
	public Date getEM_END_DATE() {
		return EM_END_DATE;
	}
	public void setEM_END_DATE(Date eM_END_DATE) {
		EM_END_DATE = eM_END_DATE;
	}
	public long getIMEI_NO1() {
		return IMEI_NO1;
	}
	public void setIMEI_NO1(long iMEI_NO1) {
		IMEI_NO1 = iMEI_NO1;
	}
	public long getIMEI_NO2() {
		return IMEI_NO2;
	}
	public void setIMEI_NO2(long iMEI_NO2) {
		IMEI_NO2 = iMEI_NO2;
	}
	
	
	

}

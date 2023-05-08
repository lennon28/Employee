package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="SA_EMPLOYEE_BANK_DETAILS")
public class BankBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int BANK_ID;
	@Column
	private String BENEFICIARY_NAME_1;
	@Column
	private String BANK_NAME_1;
	@Column
	private String BANK_BRANCH_1;
	@Column
	private String ACCOUNT_NO_1;
	@Column
	private String IFSC_CODE_1;
	@Column
	private String ACCOUNT_TYPE_1;
	@Column
	private int APPLICABLE_1;
	@Column
	private String BENEFICIARY_NAME_2;
	@Column
	private String BANK_NAME_2;
	@Column
	private String BANK_BRANCH_2;
	@Column
	private String ACCOUNT_NO_2;
	@Column
	private String IFSC_CODE_2;
	@Column
	private String ACCOUNT_TYPE_2;
	@Column
	private int APPLICABLE_2;
	@Column
	private int BANK_CODE_1;
	@Column
	private int BRANCH_CODE_1;
	@Column
	private int BRANCH_CODE_2;
	@Column
	private int BANK_CODE_2;

	public int getBANK_ID() {
		return BANK_ID;
	}
	public void setBANK_ID(int bANK_ID) {
		BANK_ID = bANK_ID;
	}
	public String getBENEFICIARY_NAME_1() {
		return BENEFICIARY_NAME_1;
	}
	public void setBENEFICIARY_NAME_1(String bENEFICIARY_NAME_1) {
		BENEFICIARY_NAME_1 = bENEFICIARY_NAME_1;
	}
	public String getBANK_NAME_1() {
		return BANK_NAME_1;
	}
	public void setBANK_NAME_1(String bANK_NAME_1) {
		BANK_NAME_1 = bANK_NAME_1;
	}
	public String getBANK_BRANCH_1() {
		return BANK_BRANCH_1;
	}
	public void setBANK_BRANCH_1(String bANK_BRANCH_1) {
		BANK_BRANCH_1 = bANK_BRANCH_1;
	}
	public String getACCOUNT_NO_1() {
		return ACCOUNT_NO_1;
	}
	public void setACCOUNT_NO_1(String aCCOUNT_NO_1) {
		ACCOUNT_NO_1 = aCCOUNT_NO_1;
	}
	public String getIFSC_CODE_1() {
		return IFSC_CODE_1;
	}
	public void setIFSC_CODE_1(String iFSC_CODE_1) {
		IFSC_CODE_1 = iFSC_CODE_1;
	}
	public String getACCOUNT_TYPE_1() {
		return ACCOUNT_TYPE_1;
	}
	public void setACCOUNT_TYPE_1(String aCCOUNT_TYPE_1) {
		ACCOUNT_TYPE_1 = aCCOUNT_TYPE_1;
	}
	public int getAPPLICABLE_1() {
		return APPLICABLE_1;
	}
	public void setAPPLICABLE_1(int aPPLICABLE_1) {
		APPLICABLE_1 = aPPLICABLE_1;
	}
	public String getBENEFICIARY_NAME_2() {
		return BENEFICIARY_NAME_2;
	}
	public void setBENEFICIARY_NAME_2(String bENEFICIARY_NAME_2) {
		BENEFICIARY_NAME_2 = bENEFICIARY_NAME_2;
	}
	public String getBANK_NAME_2() {
		return BANK_NAME_2;
	}
	public void setBANK_NAME_2(String bANK_NAME_2) {
		BANK_NAME_2 = bANK_NAME_2;
	}
	public String getBANK_BRANCH_2() {
		return BANK_BRANCH_2;
	}
	public void setBANK_BRANCH_2(String bANK_BRANCH_2) {
		BANK_BRANCH_2 = bANK_BRANCH_2;
	}
	public String getACCOUNT_NO_2() {
		return ACCOUNT_NO_2;
	}
	public void setACCOUNT_NO_2(String aCCOUNT_NO_2) {
		ACCOUNT_NO_2 = aCCOUNT_NO_2;
	}
	public String getIFSC_CODE_2() {
		return IFSC_CODE_2;
	}
	public void setIFSC_CODE_2(String iFSC_CODE_2) {
		IFSC_CODE_2 = iFSC_CODE_2;
	}
	public String getACCOUNT_TYPE_2() {
		return ACCOUNT_TYPE_2;
	}
	public void setACCOUNT_TYPE_2(String aCCOUNT_TYPE_2) {
		ACCOUNT_TYPE_2 = aCCOUNT_TYPE_2;
	}
	public int getAPPLICABLE_2() {
		return APPLICABLE_2;
	}
	public void setAPPLICABLE_2(int aPPLICABLE_2) {
		APPLICABLE_2 = aPPLICABLE_2;
	}
	public int getBANK_CODE_1() {
		return BANK_CODE_1;
	}
	public void setBANK_CODE_1(int bANK_CODE_1) {
		BANK_CODE_1 = bANK_CODE_1;
	}
	public int getBRANCH_CODE_1() {
		return BRANCH_CODE_1;
	}
	public void setBRANCH_CODE_1(int bRANCH_CODE_1) {
		BRANCH_CODE_1 = bRANCH_CODE_1;
	}
	public int getBRANCH_CODE_2() {
		return BRANCH_CODE_2;
	}
	public void setBRANCH_CODE_2(int bRANCH_CODE_2) {
		BRANCH_CODE_2 = bRANCH_CODE_2;
	}
	public int getBANK_CODE_2() {
		return BANK_CODE_2;
	}
	public void setBANK_CODE_2(int bANK_CODE_2) {
		BANK_CODE_2 = bANK_CODE_2;
	}
	
	
	
	
	

}

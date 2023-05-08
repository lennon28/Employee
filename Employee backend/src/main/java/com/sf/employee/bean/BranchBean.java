package com.sf.employee.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SA_ORGANIZATION_BRANCH_MASTER")
public class BranchBean {
@Id

	private String BRANCH_CODE;
@Column
	private String BRANCH_NAME;
public String getBRANCH_CODE() {
	return BRANCH_CODE;
}
public void setBRANCH_CODE(String bRANCH_CODE) {
	BRANCH_CODE = bRANCH_CODE;
}
public String getBRANCH_NAME() {
	return BRANCH_NAME;
}
public void setBRANCH_NAME(String bRANCH_NAME) {
	BRANCH_NAME = bRANCH_NAME;
}

}

package com.sf.employee.bean;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="HF_EMPLOYEE_ROLE_DTLS")
public class RoleBean {
    
  
   
   
    
    @Id
    
    private String ROLE_CODE;
    
    @Column
     
    private String ROLE_NAME;
    
    @Column
    private String STATUS;
    
    @Column
    private int TXN_ID;
   
    
    
    public String getROLE_NAME() {
		return ROLE_NAME;
	}

	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}

	public String getROLE_CODE() {
        return ROLE_CODE;
    }
    
    public void setROLE_CODE(String rOLE_CODE) {
        ROLE_CODE = rOLE_CODE;
    }
    
    public String getSTATUS() {
        return STATUS;
    }
    
    public void setSTATUS(String sTATUS) {
        STATUS = sTATUS;
    }
    
    public int getTXN_ID() {
        return TXN_ID;
    }
    
    public void setTXN_ID(int tXN_ID) {
        TXN_ID = tXN_ID;
    }
}

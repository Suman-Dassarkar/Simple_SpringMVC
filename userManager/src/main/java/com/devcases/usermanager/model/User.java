package com.devcases.usermanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class User implements Serializable {
	
	private static final long serialVersionUID = 6541162783907686900L;

	@Id
    @GeneratedValue
    private int id;
	
	@Column
	private String pr_firstName;
	
	@Column
	private String pr_lastName;
	
	@Column
	private String pr_mobileNumber;
	
	@Column
	private String pr_email;
	
	@Column
	private String pr_addressLine1;
	
	@Column
	private String pr_addressLine2;
	
	@Column
	private String pr_addressLine3;
	
	@Column
	private String pr_postCode;
	
	@Column
	private String pr_relationship;
	
	@Column
	private String dc_firstName;
	
	@Column
	private String dc_lastName;
	
	@Column
	private String dc_dateOfBirth;
	
	@Column
	private String dc_dateOfDeath;
	
	@Column
	private String dc_addressLine1;
	
	@Column
	private String dc_addressLine2;
	
	@Column
	private String dc_addressLine3;
	
	@Column
	private String dc_postCode;
	
	

	public String getPr_firstName() {
		return pr_firstName;
	}

	public void setPr_firstName(String pr_firstName) {
		this.pr_firstName = pr_firstName;
	}

	public String getPr_lastName() {
		return pr_lastName;
	}

	public void setPr_lastName(String pr_lastName) {
		this.pr_lastName = pr_lastName;
	}

	public String getPr_mobileNumber() {
		return pr_mobileNumber;
	}

	public void setPr_mobileNumber(String pr_mobileNumber) {
		this.pr_mobileNumber = pr_mobileNumber;
	}

	public String getPr_email() {
		return pr_email;
	}

	public void setPr_email(String pr_email) {
		this.pr_email = pr_email;
	}

	public String getPr_addressLine1() {
		return pr_addressLine1;
	}

	public void setPr_addressLine1(String pr_addressLine1) {
		this.pr_addressLine1 = pr_addressLine1;
	}

	public String getPr_addressLine2() {
		return pr_addressLine2;
	}

	public void setPr_addressLine2(String pr_addressLine2) {
		this.pr_addressLine2 = pr_addressLine2;
	}

	public String getPr_addressLine3() {
		return pr_addressLine3;
	}

	public void setPr_addressLine3(String pr_addressLine3) {
		this.pr_addressLine3 = pr_addressLine3;
	}

	public String getPr_postCode() {
		return pr_postCode;
	}

	public void setPr_postCode(String pr_postCode) {
		this.pr_postCode = pr_postCode;
	}

	public String getPr_relationship() {
		return pr_relationship;
	}

	public void setPr_relationship(String pr_relationship) {
		this.pr_relationship = pr_relationship;
	}

	public String getDc_firstName() {
		return dc_firstName;
	}

	public void setDc_firstName(String dc_firstName) {
		this.dc_firstName = dc_firstName;
	}

	public String getDc_lastName() {
		return dc_lastName;
	}

	public void setDc_lastName(String dc_lastName) {
		this.dc_lastName = dc_lastName;
	}

	public String getDc_dateOfBirth() {
		return dc_dateOfBirth;
	}

	public void setDc_dateOfBirth(String dc_deathOfBirth) {
		this.dc_dateOfBirth = dc_deathOfBirth;
	}

	public String getDc_dateOfDeath() {
		return dc_dateOfDeath;
	}

	public void setDc_dateOfDeath(String dc_dateOfDeath) {
		this.dc_dateOfDeath = dc_dateOfDeath;
	}

	public String getDc_addressLine1() {
		return dc_addressLine1;
	}

	public void setDc_addressLine1(String dc_addressLine1) {
		this.dc_addressLine1 = dc_addressLine1;
	}

	public String getDc_addressLine2() {
		return dc_addressLine2;
	}

	public void setDc_addressLine2(String dc_addressLine2) {
		this.dc_addressLine2 = dc_addressLine2;
	}

	public String getDc_addressLine3() {
		return dc_addressLine3;
	}

	public void setDc_addressLine3(String dc_addressLine3) {
		this.dc_addressLine3 = dc_addressLine3;
	}

	public String getDc_postCode() {
		return dc_postCode;
	}

	public void setDc_postCode(String dc_postCode) {
		this.dc_postCode = dc_postCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Version
	private long version;
	
	public User() {
		super();
	}

	public User(String pr_firstName,String pr_lastName,String pr_mobileNumber,String pr_email,String pr_addressLine1,String pr_addressLine2,String pr_addressLine3,String pr_postCode,String pr_relationship,String dc_firstName,String dc_lastName,String dc_dateOfBirth,String dc_dateOfDeath,String dc_addressLine1,String dc_addressLine2,String dc_addressLine3,String dc_postCode) {
		super();
		this.pr_firstName = pr_firstName;
		this.pr_lastName = pr_lastName;
		this.pr_mobileNumber = pr_mobileNumber;
		this.pr_email = pr_email;
		this.pr_addressLine1 = pr_addressLine1;
		this.pr_addressLine2 = pr_addressLine2;
		this.pr_addressLine3 = pr_addressLine3;
		this.pr_postCode = pr_postCode;
		this.pr_relationship = pr_relationship;
		this.dc_firstName = dc_firstName;
		this.dc_lastName = dc_lastName;
		this.dc_dateOfBirth = dc_dateOfBirth;
		this.dc_dateOfDeath = dc_dateOfDeath;
		this.dc_addressLine1 = dc_addressLine1;
		this.dc_addressLine2 = dc_addressLine2;
		this.dc_addressLine3 = dc_addressLine3;
		this.dc_postCode = dc_postCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
	
	
}

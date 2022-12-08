package com.HospitalServer.model.pojo;

import jakarta.persistence.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recordId;
    public Patient(Integer recordId, Integer applicationNo, Integer memberId, String firstName, String middleName,
			String lastName, String dob, String gender) {
		super();
		this.recordId = recordId;
		this.applicationNo = applicationNo;
		this.memberId = memberId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(Integer applicationNo) {
		this.applicationNo = applicationNo;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private Integer applicationNo;
    private Integer memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dob;
    private String gender;

}

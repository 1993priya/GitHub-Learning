package com.myproject.StudentAdmissionController;

import java.util.ArrayList;
import java.util.Date;



public class Student {
	
	private ArrayList<String> mySkills;
	private  Address studentAddress;
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public ArrayList<String> getMySkills() {
		return mySkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.mySkills = studentSkills;
	}

	private Long myMobile;
	public Long getMyMobile() {
		return myMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.myMobile = studentMobile;
	}
	
	private Date myDob;
	public Date getMyDob() {
		return myDob;
	}
	public void setStudentDob(Date studentDob) {
		this.myDob = studentDob;
	}
	//@Size(min=2, max=30)
	private String myName;
	
	public String getmyName() {
		return myName;
	}
	public void setName(String name) {
		this.myName = name;
	}
	private String myCrush;
	
	
	public String getmyCrush() {
		return myCrush;
	}
	public void setstudentCrush(String studentCrush) {
		this.myCrush = studentCrush;
	}
	private String myHobby;
	
	public String getmyHobby() {
		return myHobby;
	}
	public void setstudentHobby(String studentHobby) {
		this.myHobby = studentHobby;
	}
	


}

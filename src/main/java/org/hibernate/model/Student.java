package org.hibernate.model;

import java.util.Date;

public class Student {
	private long sid;// 学号
    private String sname;// 姓名
    private String gender;// 性别
    private Date birthday;// 生日
    private Address address;// 地址
    
    
	public Student(String sname, String gender, Date birthday, Address address) {
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public Student() {
		
	}

	public long getSid() {
		return sid;
	}

	public void setSid(long sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

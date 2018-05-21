package org.hibernate.model;

public class Address {
	 private String postCode;// 邮编
     private String phone;// 电话号码
     private String address;// 地址
	
     public Address() {
	
     }

	public Address(String postCode, String phone, String address) {
		this.postCode = postCode;
		this.phone = phone;
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

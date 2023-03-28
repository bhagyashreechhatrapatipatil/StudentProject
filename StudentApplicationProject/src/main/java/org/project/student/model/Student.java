package org.project.student.model;

public class Student {
    private int sid;
    private String sname;
    private int age;
    private String address;
    private String city;
    private String mobileNo;
	public Student() {
		super();
		
	}
	public Student(int sid, String sname, int age, String address, String city, String mobileNo) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.address = address;
		this.city = city;
		this.mobileNo = mobileNo;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
    
    
}

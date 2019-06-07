package com.Java8Learning;

public class Student {
private String Std_name;
private int Std_id;
private Std_Address address;

public Student() {
	super();
}

public Student(String std_name, int std_id, Std_Address address) {
	super();
	Std_name = std_name;
	Std_id = std_id;
	this.address = address;
}

public String getStd_name() {
	return Std_name;
}
public void setStd_name(String std_name) {
	Std_name = std_name;
}
public int getStd_id() {
	return Std_id;
}
public void setStd_id(int std_id) {
	Std_id = std_id;
}
public Std_Address getAddress() {
	return address;
}
public void setAddress(Std_Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [Std_name=" + Std_name + ", Std_id=" + Std_id + ", address=" + address + "]";
}

}

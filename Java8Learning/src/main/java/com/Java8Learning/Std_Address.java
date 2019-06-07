package com.Java8Learning;

public class Std_Address {
private String Address1;
private String city;
private int zipcd;

public Std_Address() {
	super();
}
public Std_Address(String address1, String city, int zipcd) {
	super();
	Address1 = address1;
	this.city = city;
	this.zipcd = zipcd;
}
public String getAddress1() {
	return Address1;
}
public void setAddress1(String address1) {
	Address1 = address1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZipcd() {
	return zipcd;
}
public void setZipcd(int zipcd) {
	this.zipcd = zipcd;
}
@Override
public String toString() {
	return "Std_Address [Address1=" + Address1 + ", city=" + city + ", zipcd=" + zipcd + "]";
}

}

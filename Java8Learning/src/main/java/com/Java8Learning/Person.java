package com.Java8Learning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {

	public static void main(String[] args) {
		
		List<Man> people = Arrays.asList(new Man(101, "Raja", 1021.25, new Address("Smyrna", "GA", 30080)),
				new Man(102, "Reddy", 5425.85, new Address("newyorl", "HK", 78951)),
				new Man(103, "Bolle", 5489.65, new Address("cser", "WA", 784513)));
		List<String> names = Arrays.asList("Rala","fdsafas","rewtqewr");
		
		names.stream().forEach(a -> System.out.println(a));
		people.stream().forEach(x -> System.out.println(x.getEmp_id()+" "+x.getEmp_name()));
		List<Man> puipl = people.stream().filter(a -> a.getEmp_id() >101).collect(Collectors.toList());
		puipl.stream().forEach(b -> System.out.println(b.getEmp_id()));
		people.forEach(a -> a.setSalaray(a.getSalaray()+1000));
		
		people.forEach(x -> System.out.println(x.getEmp_id()+" - "+ x.getSalaray()));
		
		Map<Integer,Address> man_Address = people.stream().collect(Collectors.toMap(Man :: getEmp_id, Man :: getAddress));
		System.out.println(man_Address.toString());
	}
}

class Man{
	int emp_id;
	String emp_name;
	double Salaray;
	Address address;
	public Man(int emp_id, String emp_name, double salaray, Address address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		Salaray = salaray;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getSalaray() {
		return Salaray;
	}
	public void setSalaray(double salaray) {
		Salaray = salaray;
	}
	
}

class Address{
	String stName;
	String state;
	long zipcd;
	
	@Override
	public String toString() {
		
		return stName+" " + state +" "+ zipcd;
	}
	public Address(String stName, String state, long zipcd) {
		super();
		this.stName = stName;
		this.state = state;
		this.zipcd = zipcd;
		
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipcd() {
		return zipcd;
	}
	public void setZipcd(long zipcd) {
		this.zipcd = zipcd;
	}
	
}
package com.Java8Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Java8Practice {

	public static void main(String[] args) {
	//	comparatorexma();
		//mapexample();
	//	num();
		listobj();
	}

	public static void comparatorexma(){
		List<Student> li = new ArrayList<>();
		li.add(new Student("Raja", 101, (new Std_Address("a1s2d3f4", "7hfg:", 12345))));
		li.add(new Student("Reddy", 101, (new Std_Address("fdgdfg", "76867gfhf:", 1515))));
		li.add(new Student("Bolle", 101, (new Std_Address("rwtrq", "dbct5:", 26))));
		li.add(new Student("Priya", 101, (new Std_Address("bxcvx", "nbcv5:", 569))));
		li.sort((x1,x2) -> x1.getStd_name().compareTo(x2.getStd_name()));
		//li.forEach(System.out :: println);
		li.forEach(x -> System.out.println(x));
		List<Integer> li1 = li.stream().map(x -> x.getStd_id()+ 2).collect(Collectors.toList());
		System.out.println(li1);
	}
	
	public static void mapexample(){
		HashMap<Integer, Student> mpstd = new HashMap<>();
		mpstd.put(101, new Student("Raja", 101, (new Std_Address("a1s2d3f4", "7hfg:", 12345))));
		mpstd.put(102, new Student("Reddy", 101, (new Std_Address("fdgdfg", "76867gfhf:", 1515))));
		mpstd.put(104, new Student("Bolle", 101, (new Std_Address("rwtrq", "dbct5:", 26))));
		//mpstd.entrySet().forEach(x -> System.out.println(x));
		//mpstd.values().forEach(System.out :: println);
		mpstd.forEach((k,v)-> System.out.println("key = "+ k + " and value = "+ v));
		mpstd.keySet().forEach(System.out :: println);
		
	}
	
	public static void num(){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(8);
		al.add(4);
/*	Collections.sort(al);
	System.out.println(al);
	al.sort((x1,x2) -> x2.compareTo(x1));
	System.out.println(al);*/
	//	al.forEach(x -> { if (x.equals(6))System.out.println("Hello"); else System.out.println("hi");});
		al.stream().filter(x -> x!=5).forEach(System.out :: println);
		boolean a = al.stream().anyMatch(x -> x % 7==0);
		System.out.println(a);
	//	al.stream().map(x -> x+5).forEach(System.out :: println);
		//al.stream().filter(x -> x%2 == 0 ).forEachOrdered(System.out :: println);

	}
	
	public static void listobj(){
		ArrayList<Student> als = new ArrayList<Student>();
		als.add(new Student("Raja", 101, (new Std_Address("a1s2d3f4", "7hfg:", 12345))));
		als.add(new Student("Reddy", 102, (new Std_Address("safd", "e:", 15))));
		als.add(new Student("Bolle", 103, (new Std_Address("ewrw", "hsd:", 125))));
		als.add(new Student("Priya", 104, (new Std_Address("cv", "df:", 1235))));
		als.stream().filter(x -> x.getStd_id()> 102).forEach(x -> System.out.println(x));
		List<Std_Address> mal = als.stream()
				.filter(x -> x.getStd_name().startsWith("R"))
				.map(a -> a.getAddress())
				.collect(Collectors.toList());
		System.out.println(mal);
			Map<Integer,Std_Address> mps = new HashMap<>();
				mps = als.stream().collect(Collectors.toMap(Student :: getStd_id, Student :: getAddress));
				mps.forEach((k,v) -> System.out.println(k +" " + v));
	}
	
}


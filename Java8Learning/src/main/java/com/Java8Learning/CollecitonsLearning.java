package com.Java8Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CollecitonsLearning {

	public static void main(String[] args) {
	//	arryList();
		//linkedList();
		//hashSet();
		map();
	}

	public static void arryList(){
		List<String> li = new ArrayList<>();
		li.add("Raja");
		li.add("Reddy");
		li.add("Bolle");
		li.add("Vishnu");
		li.add("Polimera");
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.get(2));
		System.out.println(li.isEmpty());
		System.out.println(li.remove("Raja"));
		System.out.println(li);
		System.out.println(li.set(1, "Siva"));
		System.out.println(li);
		List<String>  abn = li.stream().filter(x -> x.startsWith("R")).collect(Collectors.toList());
		System.out.println(abn);
		List<String> ab = li.stream().map(x -> x.concat("1234")).collect(Collectors.toList());
		System.out.println(ab);	
	}
	
	public static void linkedList(){
		LinkedList<String> li = new LinkedList<>();
		li.add("Raja");
		li.add("Reddy");
		li.add("Bolle");
		li.add("Vishnu");
		li.add("Polimera");
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		li.addFirst("Siva");;
		li.addLast("Lakshmi");
		Collections.sort(li);
		System.out.println(li);
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
	}
	public static void hashSet(){
		HashSet<String> li = new HashSet<>();
		li.add("Raja");
		li.add("Reddy");
		li.add("Bolle");
		li.add("Raja");
		li.add("Vishnu");
		li.add("Polimera");
		System.out.println(li);
	}
	public static void map(){
		HashMap<String,String> hs = new HashMap<>();
		hs.put("Raja", "Reddy");
		hs.put("Bolle", "polimera");
		for(Map.Entry<String, String> ee: hs.entrySet()){
			System.out.println(ee.getKey()+"   "+ ee.getValue());
		}
	}
}

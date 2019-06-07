
package com.Java8Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections_Learn {

	public static void main(String[] args) {
	//	ListExample le = new ListExample();
		// le.ArrayList_methods();
	//	LinkedListExample.linekedlist();
	//	SetExample.setExm();
		//QueueExample.queueexampel();
		//Queueexample2.queqe2();
		//SortedsetExmp.sortSet();
		//LinkedListArrayList.llal();
		//Setsample.setsam();
		MapEmp.mapEx();
	}

}

class LinkedListExample {
	public static void linekedlist() {
		LinkedList<Student> li = new LinkedList<>();
		li.add(new Student("Raja", 101, (new Std_Address("a1s2d3f4", "abcd:", 12345))));
		li.addAll(li);
		li.addFirst(new Student("Reddy", 102, (new Std_Address("dsfsdre", "2cvd:", 65453))));
		li.addFirst(new Student("Bolle", 103, (new Std_Address("fdsf", "frewe:", 548))));
		li.addLast(new Student("Polimera", 104, (new Std_Address("dfsd", "rwe:", 5478))));
		li.addLast(new Student("Vishnu", 105, (new Std_Address("4rtwd", "srwe:", 575))));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		for (Student s : li) {
			System.out.println(s.getStd_id() + " " + s.getStd_name() + " " + s.getAddress().getAddress1() + " "
					+ s.getAddress().getCity() + " " + s.getAddress().getZipcd());
		}
	}
}

class ListExample {
	public void ArrayList_methods() {
		ArrayList<Student> c = new ArrayList<>();
		c.add(new Student("Raja", 101, (new Std_Address("a1s2d3f4", "abcd:", 12345))));
		c.add(new Student("Reddy", 102, (new Std_Address("dsfsdre", "2cvd:", 65453))));
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println(c.addAll(c));
		System.out.println(c.size());
		System.out.println(c.get(1));
		System.out.println(c.removeIf(x -> x.getStd_id() == 101));
		c.addAll(0, c);

		c.set(0, new Student("Raja", 101, (new Std_Address("a1s2d3f4", "abcd:", 12345))));
		c.sort((c1, c2) -> c2.getStd_id() - c1.getStd_id());
		for (Student s : c) {
			System.out.println(s.getStd_id() + " " + s.getStd_name() + " " + s.getAddress().getAddress1() + " "
					+ s.getAddress().getCity() + " " + s.getAddress().getZipcd());
		}
	}
}

class SetExample {
	public static void setExm() {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("Raja", 101, (new Std_Address("a1s2d3f4", "abcd:", 12345))));
		hs.addAll(hs);
		hs.add(new Student("Reddy", 102, (new Std_Address("bj", "gu:", 578))));
		System.out.println(hs.size());
		ArrayList<Student> al = new ArrayList<>(hs);
		for (Student s : hs) {
			System.out.println(s.getStd_id() + " " + s.getStd_name() + " " + s.getAddress().getAddress1() + " "
					+ s.getAddress().getCity() + " " + s.getAddress().getZipcd());
		}
		al.sort((c3,c4) -> c4.getStd_id() - c3.getStd_id());
		for (Student s : al) {
			System.out.println(s.getStd_id() + " " + s.getStd_name() + " " + s.getAddress().getAddress1() + " "
					+ s.getAddress().getCity() + " " + s.getAddress().getZipcd());
		}
	}
}

class QueueExample{
	public static void queueexampel(){
	PriorityQueue<Student> pq = new PriorityQueue<>();
	pq.add(new Student("Reddy", 102, (new Std_Address("bj", "gu:", 578))));
//	pq.add(new Student("Raja", 101, (new Std_Address("fdgsd", "werq:", 5454))));
	/*
	System.out.println(pq.poll());
	System.out.println(pq.peek());
	pq.add(new Student("Bolle", 103, (new Std_Address("rter", "wewqq", 2456))));*/
	for(Student s: pq){
		System.out.println(s.getStd_id() + " " + s.getStd_name() + " " + s.getAddress().getAddress1() + " "
				+ s.getAddress().getCity() + " " + s.getAddress().getZipcd());
	}
	}
	
}

class Queueexample2{
	public static void queqe2(){
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Raja");
		pq.add("Reddy");
//		pq.addAll(pq);
	//	System.out.println(pq.poll());
		System.out.println(pq.peek());
		for(String s: pq){
			System.out.println(s);
		}
	}
}

class SortedsetExmp{
	public static void sortSet(){
		Set<String> ss = new TreeSet<>();
		ss.add("Raja");
		ss.add("abcd");
		ss.add("Reddy");
		ss.add("Bolle");
		ss.add("Priya");
		ss.add("Vishnu");
		ss.add("abcd");
		for(String s: ss){
			System.out.println(s);
		}
	}
}

class LinkedListArrayList{
	public static void llal(){
		ArrayList<String> ss = new ArrayList<>();
		ss.add("Raja");
		ss.add("abcd");
		ss.add("Reddy");
		ss.add("Bolle");
		ss.add("Priya");
		ss.add("Vishnu");
		ss.add("abcd");
		Collections.sort(ss);
		System.out.println(ss);
		LinkedList<String> ll = new LinkedList<>(ss);
		ll.add(3, "Lakshmi");
		System.out.println(ll);
		ss = new ArrayList<> (ll);
		Collections.sort(ss);
		System.out.println(ss);
	}
}

class Setsample{
	public static void setsam(){
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Raja");
		hs.add("Reddy");
		hs.add("Siva");
		hs.add("Raja");
		hs.add("Lakshmi");
		hs.add("Priya");
		System.out.println(hs);
		SortedSet<String> ss = new TreeSet<>(hs);
		System.out.println(ss);
	}
}

class MapEmp{
	public static void mapEx(){
		TreeMap<String, Student> mp = new TreeMap<>();
		mp.put("Raja", new Student("Raja", 102, (new Std_Address("bj", "gu:", 578))));
		mp.put("Reddy", new Student("Reddy", 101, (new Std_Address("sbfds", "ertre:", 53465))));
		mp.put("Priya", new Student("Priya", 103, (new Std_Address("fsdfs", "grt5", 1564))));
		System.out.println(mp);
		for(Map.Entry<String, Student> eachmp : mp.entrySet()){
			System.out.println(eachmp.getKey()+" "+ eachmp.getValue());
		}
		System.out.println("###################");
		System.out.println(mp.ceilingEntry("Raja"));
		System.out.println(mp.lastKey());
		System.out.println(mp.firstKey());
		System.out.println(mp.floorKey("Raja"));
		System.out.println(mp.headMap("Raja"));
		System.out.println(mp.descendingKeySet());
		System.out.println(mp.descendingMap());
	
		
	}
}
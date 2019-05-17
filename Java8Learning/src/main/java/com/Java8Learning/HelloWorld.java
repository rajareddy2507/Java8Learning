package com.Java8Learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HelloWorld {

	public static void main(String[] args) {
/*		System.out.println("Hello World");
		int i =10;
		String s ="Raja";
		String value ="1234665.434";
		char c ='A';
		boolean b =true;
		double d =10.876;
		float f = 5.2345f;
		System.out.println("i "+ i + " s "+ s +" c "+c +" b "+b+" f "+ f +" d "+ d);
		char[] ch = s.toCharArray();
		for( char x : ch){
			System.out.println(x);
		}
		String S = String.valueOf(i);
		System.out.println(S);
		double VALUE = Double.parseDouble(value);
		System.out.println(VALUE);
		String sam = String.valueOf(d);
		System.out.println(sam);
		String com = sam+s;
		System.out.println(com);
		char cha[] ={'a','b','c','d','e','f','g','h'};
		String chartoSgtring = String.valueOf(cha);
		System.out.println(chartoSgtring);
		String ab = "Raja Reddy Bolle";
		char abc[] = ab.toCharArray();
		ab = ab+"vishnu";
		System.out.println(ab);
		
		String s = "abc";
		String s1 = s;
		s="bcd";
		System.out.println(s);
		System.out.println(s1);
		
		int i =10;
		int j=i;
		i=12;
		System.out.println(i);
		System.out.println(j);
		*/
/*		String s ="Raja";
		String a = "Raja";
		System.out.println(s.compareTo(a));*/
//		String x=new String("Raja");
/*		System.out.println(s.compareTo(x));
		System.out.println(s.equals(a));
		System.out.println(x);
		System.out.println(x.length());
		System.out.println(x.substring(1, 2));
		System.out.println(x.indexOf("a"));
		System.out.println(x.lastIndexOf("a"));
		System.out.println(x.indexOf("ja"));
		System.out.println(x.charAt(3));
		System.out.println(x.toCharArray());*/
/*		String m[] = x.split("a");
		System.out.println(m.length);
		for(String p : m){
			System.out.println(p);
		}*/
		
		String name="Raja Reddy Bolle";
		System.out.println("name  "  +name);
		System.out.println("uppercase "+ name.toUpperCase());
		System.out.println("lowercase  "+ name.toLowerCase());
		
		char ch[]= name.toCharArray();
		Map<Character, Integer> mp = new HashMap<>();
		int i=1;
		for(char x : ch){
			if(mp.containsKey(x)){
				mp.replace(x, i+1);
			}else{
				mp.put(x, i);
			}
		}
		for(Entry<Character, Integer> n : mp.entrySet()){
			System.out.println(n.getKey() +" "+ n.getValue());
		}
		}
	

}

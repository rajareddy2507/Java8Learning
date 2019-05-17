package com.Java8Learning;

public class StringLearning {

	public static void main(String[] args) {
	//StringBuilder sb = new StringBuilder("Raja Reddy Bolle");
/*	sb.append("Vishnu Polimera");
	System.out.println(sb.toString());
	sb.insert(5, "Priya");
	System.out.println(sb.toString());
	sb.reverse();
	System.out.println(sb.toString());
	sb.reverse();
	sb.delete(5, 10);
	System.out.println(sb.toString());
	sb.replace(3, 10, "REPLACESTR");
	System.out.println(sb.toString());
	sb.delete(2, 12);
	System.out.println(sb);
	System.out.println(sb.charAt(3));*/
/*StringBuilder ss = new StringBuilder("this is javatpoint");
ss.reverse();
System.out.println(ss);*/
		/*String po = "nitin";
		StringBuilder sb = new StringBuilder(po);
		StringBuilder re = sb.reverse();
		String zx = re.toString();
		if(po.equals(zx)){
			System.out.println("The name is a polydrome String");
		}*/
		
		String name = "Raja Reddy Bolle";
		String n = "Raja";
		String revname = reverseEachWord(name);
		System.out.println(revname);
		StringComp(n);
		StringTest();
	}

	public static String reverseEachWord(String x){
		String s[] = x.split("\\s");
		String reverseString ="";
		for(String e : s){
			StringBuilder sb = new StringBuilder(e);
			sb.reverse();
			reverseString = reverseString+sb.toString()+" ";
		}
		return reverseString.trim();
	}
	
	public static void StringComp(String a){
		String na = a+" Reddy Bolle";
		String nam = "Raja Reddy Bolle";
		System.out.println(na);
		System.out.println(nam);
		System.out.println(na == nam);		
	}
	public static void StringTest(){
		String word ="Raja Reddy";
		char ch[] = word.toCharArray();
		for(int i=0; i<word.length(); i+=2){
			System.out.println(ch[i]);
		}
		int a =10;
		double x = (float)a;
		System.out.println(x);
	}
}

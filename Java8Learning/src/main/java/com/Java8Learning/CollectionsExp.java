package com.Java8Learning;

import java.util.Arrays;

public class CollectionsExp {

	public static void main(String[] args) {
		String v="Raja";
		String z = "ajar";
		char[] ch1=sortchars(v);
		char[] ch2 = sortchars(z);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(char ch : ch1){
			sb.append(ch);
		}
		for(char ch : ch2){
			sb2.append(ch);
		}
		String x = sb.toString();
		String y = sb2.toString();
		x.trim();
		y.trim();
		if(x.equalsIgnoreCase(y)){
			System.out.println("The input Strings are anagroams");
		}
		else{
			System.out.println("The input Strings are NOT anagroams");
		}
	}
public static char[] sortchars(String x){
	char ac[]= x.toCharArray();
	System.out.println(ac);
	Arrays.sort(ac);
	return ac;
}
}

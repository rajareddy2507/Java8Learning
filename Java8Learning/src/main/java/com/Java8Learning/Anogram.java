package com.Java8Learning;

import java.util.Arrays;

public class Anogram {

	public static void main(String[] args) {
		boolean z = anaogram("Raja", "ajaR");
		System.out.println(z);

	}

	public static boolean anaogram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			char ch[] = a.toCharArray();
			char ch1[] = b.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			String s1 = new String(ch);
			String s2 = new String(ch1);
			if (s1.equals(s2)) {
				return true;
			} else {
				return false;
			}
		}

	}

}

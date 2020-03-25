package com.bvrith.CustomCollections;

public class Remove2A {

	public String remove(String string) {
		int l = string.length();
		String ans = "";
		if(l == 0) { 
			ans = "";
		}else if(l == 1 && string.equals('A')) {
			ans = "";
		}else if(l == 1 && string.charAt(0) != 'A') {
			ans = string;
		}else if(l == 2 && string.charAt(0) == 'A' && string.charAt(1) != 'A') {
			ans += string.charAt(1);
		}else if(l == 2 && string.charAt(0) != 'A' && string.charAt(1) == 'A') {
			ans += string.charAt(0);
		} else if(l == 2 && string.charAt(0) != 'A' && string.charAt(1) != 'A') {
			ans = string;
		}else if(l > 2) {
			String a = "";
			for(int i = 0; i < 2; i++) {
				if(string.charAt(i) != 'A') {
					a += string.charAt(i);
				}
			}
			ans += a;
			ans += string.substring(2);
		}
		
		return ans;
	}

}

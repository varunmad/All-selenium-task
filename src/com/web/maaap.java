package com.web;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class maaap {
	public static void main(String[] args) {
		
	
Map<Float,String>m=new LinkedHashMap<>();
m.put(10.556f, "as");
m.put(20.909f, "qwer");
Set<Entry<Float, String>> entry = m.entrySet();
for (Entry<Float, String> e : entry) {
	System.out.println(e);
	
}
}
}
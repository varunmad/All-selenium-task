package com.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map1Header {
public static void main(String[] args) {
	List<LinkedHashMap<String,String>>emp=new ArrayList<LinkedHashMap<String,String>>();
	LinkedHashMap<String,String>e1=new LinkedHashMap<>();
	e1.put("name","sathish");
	e1.put("email","sathish@gmail.com");
e1.put("course", "selenium");
LinkedHashMap<String,String>e2=new LinkedHashMap<>();
e2.put("name","sandy");
e2.put("email","sandy@gmail.com");
e2.put("course", "java");
LinkedHashMap<String,String>e3=new LinkedHashMap<>();
e3.put("name","bala");
e3.put("email","bala@gmail.com");
e3.put("course", "python");
emp.add(e1);
emp.add(e2);
emp.add(e3);
LinkedHashMap<String,String>e=emp.get(1);
String string=e.get("name");
System.out.println(string);








}
}

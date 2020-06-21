package com.web;

import java.util.ArrayList;
import java.util.List;

public class Header2DDatatable {
public static void main(String[] args) {
	List<ArrayList<String>>emp=new ArrayList<>();
	ArrayList<String>e1=new ArrayList<>();
	e1.add("SAthish");
	e1.add("SAthish@gmail.com");
	e1.add("Selenium");
	
	ArrayList<String>e2=new ArrayList<>();
	e2.add("santhosh");
	e2.add("Santhosh@gmail.com");
	e2.add("Java");
	
	
	
	ArrayList<String>e3=new ArrayList<>();
	e3.add("BAlaji");
	e3.add("Blal@gmail.com");
	e3.add("ruuby");
	
	
	ArrayList<String>e4=new ArrayList<>();
	e4.add("hq");
	e4.add("haq@gmail.com");
	e4.add("python");
	
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	ArrayList<String>e=emp.get(5);
	String s=e.get(7);
	System.out.println(s);

	
	
	
	
	
	
	
	
}
}

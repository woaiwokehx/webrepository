package com.bdqn.hx.text;

import java.util.Arrays;

public class Student {
    //存放学生姓名     
	String[] names = new String[4];
	//添加学生
	public void addName(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){
		System.out.println("所有学生："+Arrays.toString(names));
	}
	public String search(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)){
				
				return "有"+name+"这个学生";
			}
		}
		return "没有这个学生：";
	}
	
	
         
}

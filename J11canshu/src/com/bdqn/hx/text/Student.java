package com.bdqn.hx.text;

import java.util.Arrays;

public class Student {
    //���ѧ������     
	String[] names = new String[4];
	//���ѧ��
	public void addName(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i]==null){
				names[i]=name;
				break;
			}
		}
	}
	public void show(){
		System.out.println("����ѧ����"+Arrays.toString(names));
	}
	public String search(String name){
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(name)){
				
				return "��"+name+"���ѧ��";
			}
		}
		return "û�����ѧ����";
	}
	
	
         
}

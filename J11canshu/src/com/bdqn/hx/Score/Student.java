package com.bdqn.hx.Score;

public class Student {
       String name;
       int age;
       double score;
       
       public void show(){
    	   System.out.println("����:"+name+"\t����:"+age+"\t����:"+score);
    	   
       }
     //�޲ι��췽��
   	public Student(){
   		System.out.println("�������޲εĹ��췽��");
   	}
   	
   	//�вҹ��췽��
   	public Student(String name,int age,double score){
   		this.name = name;
   		this.age = age;
   		this.score = score;
   		
   	}

       
}

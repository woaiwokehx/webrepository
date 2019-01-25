package com.bdqn.hx.Score;

public class Student {
       String name;
       int age;
       double score;
       
       public void show(){
    	   System.out.println("姓名:"+name+"\t年龄:"+age+"\t分数:"+score);
    	   
       }
     //无参构造方法
   	public Student(){
   		System.out.println("调用了无参的构造方法");
   	}
   	
   	//有惨构造方法
   	public Student(String name,int age,double score){
   		this.name = name;
   		this.age = age;
   		this.score = score;
   		
   	}

       
}

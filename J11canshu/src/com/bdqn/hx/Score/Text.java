package com.bdqn.hx.Score;

public class Text {
	public static void main(String[] args) {
		
		
	//	Student s1 = new Student();
	//	s1.name = "张三";
	//	s1.age = 20;
	//	s1.score = 58;
		
	//	Student s2 = new Student();
	//	s2.name = "李四";
	//	s2.age = 29;
	//	s2.score = 90;
		
	//	Student s3 = new Student();
	//	s3.name = "王五";
	//	s3.age = 30;
	//	s3.score = 52;
		
	//	Student[] students = {s1,s2,s3};
		
	//	Score sm = new Score();
	//	sm.update(students);
	//	sm.show(students);
		
		//无参接受
		Student s1 = new Student();
		s1.name = "张三";
		s1.age = 20;
	    s1.score = 58;
	    System.out.println(s1.name);
	    System.out.println(s1.age);
	    System.out.println(s1.score);
		//有参接受
	    Student s2 = new Student("李四", 22, 90);
				
		
		
	}

}

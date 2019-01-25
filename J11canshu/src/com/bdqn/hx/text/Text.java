package com.bdqn.hx.text;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student z = new Student();
		//使用循环添加学生5
		for (int i = 0; i <4; i++) {
			System.out.println("请输入要添加的名字：");
			String name = input.next();
			//调用addName方法，将输入的名字添加在数组里
			z.addName(name);
		}
		z.show();//显示结果
		
		
		System.out.println("---------------------");
		
		System.out.println("请输入要查找学生姓名");
		String name = input.next();
		String msg = z.search(name);
		System.out.println(msg);
		
	     
	     

	}

}

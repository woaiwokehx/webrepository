package com.bdqn.hx.Score;

import java.util.Scanner;

public class A {
	
		 public static void main(String[] args) {
		  Scanner L = new Scanner(System.in);
		  System.out.println("�����볤���εĳ���");
		  int Length = L.nextInt();
		  Scanner H = new Scanner(System.in);
		  System.out.println("�����볤���εĿ�");
		  int Height= H.nextInt();
		  Z ch = new Z();
		  System.out.println("--------------------------------");
		  ch.Rect();
		  System.out.println(ch.Collect());
		  System.out.println(ch. Area());
		  ch.Rect(Length);
		  System.out.println(ch.Collect());
		  System.out.println(ch. Area());
		  ch.Rect(Length,Height);
		  ch.Collect();
		  ch. Area();
		  System.out.println(ch.Collect());
		  System.out.println(ch. Area());
		 }
		
	}


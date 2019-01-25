package com.bdqn.hx.Score;

import java.util.Scanner;

public class Zuoye1 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	     System.out.println("请输入第一个数：");
	     int n1 =input.nextInt();
	     System.out.println("请输入第二个数：");
	     int n2 =input.nextInt();
	     Zuoye z = new Zuoye();
	     int num = z.addition(n1, n2);
	     System.out.println("和为："+num);
	     int num1 = z.subtration(n1, n2);
	     System.out.println("减为："+num1);
	     int num2 = z.multiplication(n1, n2);
	     System.out.println("乘为："+num2);
	     int num3 = z.divsion(n1, n2);
	     System.out.println("除为："+num3);
	    

	}

	private static void subtration(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

}

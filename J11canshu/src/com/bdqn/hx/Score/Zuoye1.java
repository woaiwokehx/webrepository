package com.bdqn.hx.Score;

import java.util.Scanner;

public class Zuoye1 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	     System.out.println("�������һ������");
	     int n1 =input.nextInt();
	     System.out.println("������ڶ�������");
	     int n2 =input.nextInt();
	     Zuoye z = new Zuoye();
	     int num = z.addition(n1, n2);
	     System.out.println("��Ϊ��"+num);
	     int num1 = z.subtration(n1, n2);
	     System.out.println("��Ϊ��"+num1);
	     int num2 = z.multiplication(n1, n2);
	     System.out.println("��Ϊ��"+num2);
	     int num3 = z.divsion(n1, n2);
	     System.out.println("��Ϊ��"+num3);
	    

	}

	private static void subtration(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

}

package com.bdqn.hx.Score;

import java.util.Scanner;

public class Cfx1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cfx a = new Cfx();
		a.lenght = 1;
		a.height=1;
		a.mj();
		a.zc();
		System.out.println("���Ϊ"+(a.mj()));
		System.out.println("�ܳ�Ϊ"+(a.zc()));
	
		System.out.println("�����볤��");
		int c = input.nextInt();
		System.out.println("�������");
		int k = input.nextInt();
		int z = a.m(c, k);
	    System.out.println("���Ϊ"+z);
	    int num = a.z(c, k);
	    System.out.println("�ܳ�Ϊ"+num);
	}

}

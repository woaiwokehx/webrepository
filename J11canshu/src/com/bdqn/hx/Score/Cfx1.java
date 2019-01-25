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
		System.out.println("面积为"+(a.mj()));
		System.out.println("周长为"+(a.zc()));
	
		System.out.println("请输入长：");
		int c = input.nextInt();
		System.out.println("请输入宽：");
		int k = input.nextInt();
		int z = a.m(c, k);
	    System.out.println("面积为"+z);
	    int num = a.z(c, k);
	    System.out.println("周长为"+num);
	}

}

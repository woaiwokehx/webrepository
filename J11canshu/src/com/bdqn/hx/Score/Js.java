package com.bdqn.hx.Score;

import java.util.Scanner;

public class Js {

	public static void main(String[] args) {
	//Jsj z = new Jsj();
	//z.js(2,3);
	//z.js(2, 3, 4);
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
	    int a = input.nextInt();
	    
	    System.out.println("请输入二个整数：");
	    int b = input.nextInt();
	    
	    Jsj z = new Jsj();
	    int sum = z.add(a, b);
	    System.out.println("和为"+sum);
	

	}

}

package com.bdqn.hx.text;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student z = new Student();
		//ʹ��ѭ�����ѧ��5
		for (int i = 0; i <4; i++) {
			System.out.println("������Ҫ��ӵ����֣�");
			String name = input.next();
			//����addName����������������������������
			z.addName(name);
		}
		z.show();//��ʾ���
		
		
		System.out.println("---------------------");
		
		System.out.println("������Ҫ����ѧ������");
		String name = input.next();
		String msg = z.search(name);
		System.out.println(msg);
		
	     
	     

	}

}

package com.bdqn.hx.Score;

public class Score {
	public void update(Student[] students) {
		for (Student student : students) {
			if (student.score < 60) {
				student.score += 2;
			}
		}
	}
	//��ʾ����ѧ������Ϣ
	public void show(Student[] students){
		for (Student student : students) {
			//��ʾѧ����Ϣ
			student.show();
		}
	}
	
}

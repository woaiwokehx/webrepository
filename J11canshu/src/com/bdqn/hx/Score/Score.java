package com.bdqn.hx.Score;

public class Score {
	public void update(Student[] students) {
		for (Student student : students) {
			if (student.score < 60) {
				student.score += 2;
			}
		}
	}
	//显示所有学生的信息
	public void show(Student[] students){
		for (Student student : students) {
			//显示学生信息
			student.show();
		}
	}
	
}

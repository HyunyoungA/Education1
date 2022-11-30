package com.kh.practice.student.view;


import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	public StudentMenu() {
		System.out.println("========== �л� ���� ��� ==========");
		// StudentController�� printStudent()�� ��ȯ ���� ���� �л� ���� ���
		
		Student[] std = ssm.printStudent();
		for(int i = 0; i < std.length; i++) {
			System.out.println(std[i].inform());
		}
		System.out.println();
		System.out.println("========== �л� ���� ��� ==========");
		// StudentController�� avgScore()�� ���� ���� �հ�� ��� ���
		
		double[] sArr = ssm.avgScore();
		System.out.println("�л� ���� �հ� : " + (int)sArr[0]);
		System.out.println("�л� ���� ��� : " + sArr[1]);
		
		System.out.println();
		System.out.println("========== ���� ��� ��� =========");
		// �л��� ������ CUT_LINE �̸��̸� ����� ���, �̻��̸� ��� ���
		
		for(int i = 0; i < std.length; i++) {
			if(std[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(std[i].getName() + "�л��� ����� ����Դϴ�.");
			}else {
				System.out.println(std[i].getName() + "�л��� ����Դϴ�.");
			}
	
		}
		
	}
}

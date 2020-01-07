package com.kh.example.chap06_method.controller.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodTest;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		mt.method1();
		
		int result = mt.method2();
		// line 12 + line 14 = line 15
		System.out.println(result);
		System.out.println(mt.method2());
		
		mt.method3(10,10);
		
		int result2 = mt.method4(10,30);
		System.out.println(result2);
		// line 19 + line 20 = line 22
		System.out.println(mt.method4(10, 30));
		
		// ��ȭ 1
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr : " + resultArr);
		
		// ��ȭ 2
		User user = mt.method6();
		System.out.println("Run user : " + user);
		
		//////////////////////////////////////////////////
		// (6 9) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Trainee tt = new Trainee("�ڽſ�");  // ����
		System.out.println(tt.inform());
		
		// �� �˾ƺ��ϱ� KH �ʹ� ���� �� �ٳ�߰ڴ�
		// ����ҰԿ�~~~~ !
		// ���� �׷� ���� ������ ==> 20��
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		// ������ 20���̳׿�.
		// ���� ����� �������� 12�� 23���̿���.
		// g���ε� ����Ͻðھ��?
		// �� �ҰԿ� ===> G
		
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());	
	}

}

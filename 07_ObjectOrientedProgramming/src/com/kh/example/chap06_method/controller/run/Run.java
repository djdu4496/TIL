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
		
		// 심화 1
		int[] resultArr = mt.method5();
		System.out.println("Run resultArr : " + resultArr);
		
		// 심화 2
		User user = mt.method6();
		System.out.println("Run user : " + user);
		
		//////////////////////////////////////////////////
		// (6 9) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Trainee tt = new Trainee("박신우");  // 대기생
		System.out.println(tt.inform());
		
		// 더 알아보니까 KH 너무 좋네 ㅎ 다녀야겠다
		// 등록할게요~~~~ !
		// ㅇㅋ 그럼 시험 보세요 ==> 20점
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		// 시험이 20점이네요.
		// 가장 가까운 개강일이 12월 23일이에요.
		// g반인데 등록하시겠어요?
		// 네 할게요 ===> G
		
		tt.setClassRoom('G');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());	
	}

}

package com.kh.operator;

import java.util.*;

public class G_Triple {
	// 삼항 연산자
	// (조건식)? 식1 : 식2;
	// 조건식이 true일 때 식 1 수행, false일 때 식 2 수행
	
	public void method1() {
		// 입력한 정수가 양수인지 아닌지 판별
		// 양수면 "양수다", 양수가 아니면 "양수가 아니다"라는 문장 출력
		// '정수 하나 입력 : '이라는 안내문 출력 후 입력한 정수를 num에 저장
		// 저장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();						// 이 라인을 system 아래로 내려서 빨간줄 에러를 고쳤다.
		
		String positive = "양수다";
		String negative = "양수가 아니다";
		
//		String result = (num>0 ? positive : negative);	
//	    System.out.println("num : " + result);
		/* 선생님 방법
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : "양수가 아니다"; */   // 차이는??
	    
	    // 중첩 삼항 연산자
	    
	    String result = num >0 ? positive :(num ==0 ? "0이다" : negative);
	    System.out.println("num : " + result);
	}
	
	public void method2() {
		// 입력한 정수가 짝수인지 홀수인지 판별
		// 홀수면 "홀수입니다", 짝수면 "짝수입니다" 출력
		
		// 1. 한 번에 합치기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 정수 : ");  // 안내문
		int num = sc.nextInt();		     // 받아주는 키보드
		
		String result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";  // 식을 따로 boolean이나 int 변수로 따로 만들어줘도 상관 없다.
		
		/* 2. 조건식만 따로 빼기
		 * boolean bool = num % 2 == 0;
		 * String result = bool ? "짝수입니다" : "홀수입니다";
		*/
		
		/* 3 계산식만 따로 빼기
		 * int mod = num % 2;
		 * String result = (mod == 0) ? "짝수입니다" : "홀수입니다";
		 */		
				
		System.out.println("num : " + result);
	}
}

package com.kh.variable;

public class A_Variable { // 클래스
	
	public void declareVariable() { // 메소드
		//변수 선언 후 초기화
		// A. 변수선언: 자료형 변수명;
		// 1. 논리형
		boolean isTrue;
		
		// 2. 문자형
		// 2-1. 문자
		char ch;
		// 2-2/ 문자열
		String str;  // String 대문자로 시작해야한다. class이기 때문.
		
		// 3. 숫자형
		// 3-1. 정수
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 3-2. 실수
		float fNum;
		double dNum;
		
		// B. 초기화: 변수명 = 값; =: 대입 연산자
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
//		fNum = 4.0; 
		/* Type mismatch: cannot convert from double to float
		   4.0은 실수인데, 기본적으로 실수는 double이 기본형이기 때문에 
		   4.0을 float가 아닌 double형으로 보고 있음
	             근데 fNum은 자료형은 float(4byte)인데 넣고자 하는 값은 8byte인 double형이기 때문에
		     큰 값을 작은 공간에 집어넣을 수 없다면서 에러가 떴음 */
		fNum = 4.0f;
		dNum = 8.0d;
		ch = 'A';	  // 문자는 작은 따옴표를 이용해서 집어 넣는다.
		str = "I my me mine"; // 문자열은 큰 따옴표를 이용해서 집어넣는다
		
		System.out.println("isTrue의 값: " + isTrue);
		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);
		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNum의 값: " + dNum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
		
		// 콘솔창에 실행을 하기 위해선 main method 작업을 해줘야 한다.
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = false;
		// 2. 문자형
		// 2-1. 문자
		char ch = '가';
		// 2-2. 문자열
		String str = "KH정보교육원";
		
		// 3. 숫자형
		// 3-1. 정수
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 3-2. 실수
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		System.out.println("isTrue의 값: " + isTrue);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
		System.out.println("bNum: " + bNum);
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		
	}
	
}

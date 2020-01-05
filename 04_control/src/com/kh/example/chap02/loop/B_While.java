package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*		 
 		while(조건식){
 			실행 문장;
 			[증감식 or 분기문;]
 		}
 	조건식 확인 -> (조건식 true일 때) 실행 문장 완성 -> 조건식 확인 -> (반복)	
 	조건식 결과가 false가 될 때까지 반복
	 */
	public void method1() {
		// 1부터	5까지 출력;
		int i = 1;
		while(i <= 5) {
			System.out.println(i + "번째 반복문 수행");
			i++;
		}

	}
	public void method1_1() {
		// 자기 소개 다섯 번 하기 : 내 이름은 정지우야
		
		int i=0;
		while(i < 5) {
			System.out.println("내 이름은 정지우야");
			i++;
		}
	}
	public void method2() {
		// 5부터 1까지 출력
		
		int i=5;
		while(i > 0) {
			System.out.println(i);
			i--;
		}
	}
	public void method3() {
		// 1에서 10 사이의 홀수만 출력
		
		int i=1;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
	}
	public void method4() {
		// 정수 두 개를 입력 받아 그 사이의 숫자 출력
		// 정수 두 개를 입력하세요.
		// 단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		// 첫 번째 숫자 :
		// 두 번째 숫자 :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요.");
		System.out.println("단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		int min = 0;
		int max = 0;
		
		if (start > end) {
			max = start;	//  좌항(변수) 우항(데이터 값)을 반대로 썼다 틀렸었다
			min = end;		
		}	else {
			min = start;
			max = end;
		}
		
		while (min <= max) {
			System.out.println(min);
			min++;
		}
	}
	public void method4_1() {
		// 정수를 하나 입력 받아 그 수가 1~9 사이의 수 일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 1~9사이의 양수를 입력하여야 합니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>=1&&num<=9) {
			int i=1;
			while(i<=9) {
				System.out.println(num + "*" + i + "=" + num * i);	// '*'(x), "*"(o)
				i++;
			}
		}	else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다");
		}
	}
	
	public void method5() {
		// 1부터 10 사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계 출력
		int random = (int)(Math.random()* 10 + 1);
		
		int sum = 0;
		
		int i = 1;
		while(i<=random) {
			sum +=i;
			i++;
		}
		System.out.printf("1부터 %d까지의 정수 합계 : %d", random, sum);
	}
	public void method6() {
		// 사용자에게 문자열을 입력 받아 인덱스 별로 문자 출력
		// 문자열 입력 : apple		문자열 : love		문자열 : ant
		// 0 : a				0 : l			0 : a
		// 1 : p				1 : o			1 : n
		// 2 : p				2 : v			2 : t
		// 3 : l				3 : e
		// 4 : e
		
		// 문제1. for
		// 문제2. while
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();	
		
		int length = str.length();
		sc.close();
		// 문제 1. for
//		for(int i=0;i<5;i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);
//		}
		// 문자열의 길이를 반환하는 메소드(method) : length()
		
//		System.out.println(str + "의 길이 : " + length);
//		for(int i=0;i<length;i++) { // or 변수 안 주고 for(int i=0;i<str.length();i++) 
//		char ch = str.charAt(i);
//		System.out.println(i + " : " + ch);
//		}
		// ------------------------------------
		// 문제2. while
		
		int i = 0;
		while(i<length) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
		
	}
	public void method7() {
		//2단부터 9단까지 출력
		int num = 2;	
		
		while(num<=9) {
			int i=1;
			while(i<=9) {			
				System.out.println(num + "*" + i + "=" + num * i );
// (강사님 코드)	System.out.printf("%d * %d = %d%n", num, i, (num*i));
				i++;
			}
			num++;
		}
	}
	public void method8() {
		// 아날로그 시계 0:0
		
		int h = 0;
		int m = 0;
		
		
		while (h<=23) {	
			m=0;
			while(m<60) {
				System.out.println(h + ":" + m);
// (강사닝 코드)	System.out.printf("%02d시 %02d분%n", h, m);  // %d : 정수 // %2d : 정수(두 자리 확보하겠다) // %-2d : 왼쪽 정렬 + 두 자리 확보
				m++;
			}
			h++;
		}
		
	}
	public void method9() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;     				// 중요 
		while(menuNum != 9) {
			System.out.println("1. 1~5까지 출력");
			System.out.println("2. 5~1까지 출력");
			System.out.println("3. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택 : "); 
											 
			menuNum = sc.nextInt(); 	    // 중요 

			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못 입력하셨습니다.");	
			}
		}
	}
}
	


package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
 
 		for(초기식; 조건식; 증감식){
 			실행문장;
 		}
 		초기식 -> 조건식 -> (조건식이 true일때) 실행문장 -> 증감식 -> 조건식 -> (조건식이 true일때) -> (반복)
 		조건식 결과가 false가 될 때까지 반복
 		
 		for문 안에 있는 초기식, 조건식, 증감식 모두 생략 가능
 		하지만, 모두 생략했을 때 반복문이 무한으로 돌기 때문에
 		for문 안이나 밖에다가 초기식은 무엇인지 조건은 무엇인지 증감은 얼마나 될건지를 모두 표기해야 함
 		즉 for() 안에서만 생략될 뿐 모두 필요한 요소임
 		
 		이해가 안 되면 펜과 종이를 꺼내서 계속 써보자
 		같은 문제 반복하는 것이 다른 문제 많이 풀어보는 것보다 중요하다
	 */
	public void method1() {
		// 1부터 5까지 출력
		for (int i = 1; i <= 5 ; i++) {
			System.out.println(i + "번째 반복문 수행");
		}
	}
	public void method1_1() {
		// 자기 소개 다섯 번 하기 :내 이름은 박신우야
		for (int i = 1; i <= 5 ; i++) {				// i가 꼭 1부터 시작할 필요는 없다.
			System.out.println("내 이름은 정지우야");
		}
		
	}
	public void method2() {
		// 5부터 1까지 출력하기
		for(int i = 5; i >= 1 ; i--) {
			System.out.println(i + "번째 반복문 수행");
		}

	}
	public void method2_1() {
		// 8부터 3까지 출력
		for(int i = 8; i >=3 ; i--)	 {
			System.out.println(i);
		}
	}
	public void method3() {
		// 1에서 10 사이의 홀수만 출력
		// 1 3 5 7 9
		for(int i = 1; i <= 10 ; i +=2)	 {		// 조건식은 무조건 범위를 써주자.
			System.out.println(i);
		}
	}
	public void method4() {
		// 정수 두 개를 입력 받아 그 사이 숫자 출력
		/*
		 	정수 두 개를 입력하세요.
		 	단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.
		 	예시 
		 	첫 번째 숫자 : 1
		 	두 번째 숫자 : 5
		 	1 2 3 4 5 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요\n"
				+ "단, 첫 번째 숫자가 두 번째 숫자보다 작게 입력해주세요.");
		
		System.out.print("첫 번째 숫자 : ");
		int start = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int end = sc.nextInt();
		
		
		// 첫 번째 숫자가 두 번째 숫자보다 작게 입력하기 위한 조치
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		// ----------------------------------------
		
		System.out.println("");
		
//		for (int i = min ; i <= max ; i++) {       // 방법 1 이것만 알아도 충분하다
//			System.out.println(i);
//		}
		for(; min <= max; min++) {                 // 방법 2for문 안에 있는 초기식, 조건식, 증감식 모두 생략 가능
			System.out.print(min + " ");
		}
	}
	public void method4_1() {
		// 정수 하나를 입력 받아 그 수가 1~9사이의 수일때만 그 수의 구구단 출력
		// 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int i;				// 선언
		i = 2;				// 초기화
//		int i = 2;			// 선언과 동시에 초기화

		
		if(num <=9 && num >=1) {
		  for(i = 1; i <= 9; i++) {
				System.out.println(num+"*"+ i + "="+ num * i);
			}
		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
	}
	public void method5() {
		// 1부터 10사이의 임의의 난수를 정해 1부터 난수까지의 정수 합계
		Math.random(); // 임의의 난수(실수)를 반환하는 메소드
					   // 이 메소드는 범위가 있다. 
//		System.out.println(Math.random()); // 확인해보자
		// 원래 Math.random()의 범위: 0 <== Math.random() < 1
		// 10까지 만들기 위해 10 곱하기 : 0 <== Math.random() * 10 < 10
		// 10을 포함하기 위해 1 더하기 : 1 <= Math.random() * 10 + 1 < 11         
		// (여전히 실수가 반환되고 있다) 
		// 정수로 만들기 위해 int 형변환 : 1 <= (int)Math.random() * 10 + 1 < 11
		int random = (int)(Math.random() * 10 + 1);
//		System.out.println(random);
		
		int sum = 0;
		
		for(int i = 1; i <= random ; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지 정수 합계 : %d", random, sum);
	}
	public void method6() {
		// 중첩 반복문
		// 2단부터 9단까지 출력
		
		int dan, su;
		
		for(dan = 2; dan <= 9; dan++) {
			for(su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
			}	
				System.out.println();
		}
	}
	public void method7() {
		// 아날로그 시계 출력 : 0시 0분 ~ 23시 59분
		
		int hour, min;
		
		for(hour = 0; hour <=23 ; hour++) {
			for(min = 0; min <= 59; min++) {
				System.out.printf("%d시 %d분%n", hour, min);
			}
		}
	}
	public void method8() {
		// 한 줄에 별(*)표가 5번 출력되는데
		// 그 줄은 사용자가 입력한 수만큼 출력
		/*
		 	출력할 줄 수 : 3
		 	*****
		 	*****
		 	*****	 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 줄 수 : ");
		int row = sc.nextInt();
		int i,j;
		
		for(i = 1 ; i <= row; i++) {
			for(j = 1 ; j <=5;j++) {
			System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public void method9() {
		// 한 줄에 별표 문자를 입력된 줄 수와 칸 수 만큼 입력
		// 단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수가 출력
		/*
		 	줄 수 : 6
		 	칸 수 : 6
		 	1*****
		 	*2****
		 	**3***
		 	***4**
		 	****5*
		 	*****6		 
		 */

		Scanner sc = new Scanner(System.in);// 한줄 끝나고 줄바꿈 해주기
		System.out.print("줄 수 : "); 			// 줄이 숫자 row는 고정값, i는 변수
		int row = sc.nextInt();
		System.out.print("칸 수 : ");			// 칸이 별    column 고정값, j는 변수
		int column = sc.nextInt();
		
		int i,j;
		
		for(i = 1; i <=row ; i++) {
			for(j=1;j<=column;j++) {
				if(i==j) {
					System.out.print(i);
				} else {
					System.out.print('*');
				}	
			}
			System.out.println();
		}											
	}
	public void method9_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int column = sc.nextInt();
		
		int i,j;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if(i==j) {
					System.out.print(i);
				}	else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
		
	}
		
		
}


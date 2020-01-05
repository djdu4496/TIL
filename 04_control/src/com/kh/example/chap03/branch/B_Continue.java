package com.kh.example.chap03.branch;

public class B_Continue {
	// continue는 반복문 안에서만 사용 가능
	// continue를 만나면 아래 문장 실행하지 않고
	// 반복을 다시 시작함
	// for문의 경우 증감식으로 가고, while문의 경우 조건식으로 감
	public void method1() {
		// 1~100까지 정수들의 합계를 출력하되 단, 4의 배수는 빼고 계산
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
	public void method2() {
		// 구구단 출력 : 짝수 단, 짝수 수 빼고 출력 // continue 방법 + 복합 대입 연산자 방법 다 풀어보기
		int dan = 1;
		int su = 1;
		
//		for(dan=1;dan<=9;dan+=2) {
			System.out.println("==========" + dan + "단==========");
			for(su=1;su<=9;su+=2) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			System.out.println();
		
//		for(dan=1;dan<=9;dan+=2) {
//			if(dan % 2 ==0) {
//				continue;
//			} 
//			for(su=1;su<=9;su+=2) {
//				if(su % 2 ==0) {
//					continue;
//				}
//				System.out.println(dan + "*" + su + "=" + (dan*su));
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
	}
			
		
}


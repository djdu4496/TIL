package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수다");
		}	else {
			System.out.println("양수가 아니다");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수다");
		}	else if(num==0) {
			System.out.println("0이다");
		}	else {
			System.out.println("음수다");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num/2==0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int peopleNum = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int candyNum = sc.nextInt();
		
		int perHead = candyNum / peopleNum;
		int rest = candyNum % peopleNum;
		
		
		System.out.println("1인당 사탕 개수 : " + perHead);
		System.out.println("남은 사탕 개수 : " + rest);
	}
	public void practice5() {						// charAt(); 미해결 // 소수점 아래 둘째자리까지 미해결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String userGender = sc.nextLine();
		char gender = userGender.charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + classNum + "반 " + number + "번 " + name + "" + gender + "학생의 성적은 " + score + "이다.");	
	}
	
	public void practice6() {						
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println("");
		
		if(age<=13) {
			System.out.println("어린이");
		} else if(age>19) {
			System.out.println("성인");
		}	else {
			System.out.println("청소년");
		}
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double average = (double)total / 3;
		
		System.out.println("");
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
		
		if (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	public void practice8() {						// charAt(); 미해결
		Scanner sc = new Scanner(System.in);
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		// method 1----------------------------------
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String user = sc.nextLine();
		
		
		//123456-2123456
		char userGender = user.charAt(7);
		String gender = userGender == '1' || userGender == '3' ? "남자" : "여자";
		System.out.println(gender);
		//method 2-------------------------------------

		if(userGender == '1' || userGender == '3') {
			System.out.println("남자");
		}	else {
			System.out.println("여자");
		}
	}
	public void practice9() {					// 단, num1은 num2보다 작아야 함 ???
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		if(num3 <= num1 || num3 > num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();	
		
		System.out.println("");
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("true");
		}	else {
			System.out.println("false");
		}
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int aWage = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int bWage = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int cWage = sc.nextInt();	
		
		System.out.println("");
		
		double aWageTotal = (double)aWage + 1000.0;
		double bWageTotal = (double)bWage + 0.0;
		double cWageTotal = (double)cWage + 389.9999999999995;
		
		System.out.println("A사원 연봉/연봉+a : " + aWage + "/" + aWageTotal );
		if(aWageTotal >= 3000.0) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("B사원 연봉/연봉+a : " + bWage + "/" + bWageTotal );
		if(bWageTotal >= 3000.0) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("A사원 연봉/연봉+a : " + cWage + "/" + cWageTotal );
		if(cWageTotal >= 3000.0) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		// ----------------------------------------------
		/* 선생님 풀이방식
		 * double aIncen = a * 1.4;
		 * double bIncen = b;
		 * double cIncen = c * 1.15;  // (같은 말) double cIncen = c + c * 0.15;
		 * 
		 * String s1 = "3000 이상";
		 * String s2 = "3000 미만";
		 * 
		 * System.out.println("A사원 연봉/연봉+a : " + a + "/" + aIncen);
		 * System.out.println(aIncen >= 3000 ? s1 : s2);
		 * System.out.println("B사원 연봉/연봉+a : " + b + "/" + bIncen);
		 * System.out.println(bIncen >= 3000 ? s1 : s2);
		 * System.out.println("B사원 연봉/연봉+a : " + c + "/" + cIncen);
		 * System.out.println(cIncen >= 3000 ? s1 : s2); 
		 */
	}
}
	


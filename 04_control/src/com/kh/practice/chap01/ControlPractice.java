package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			
			menuNum = sc.nextInt();
			
			switch (menuNum) {
			case 1: System.out.println("입력메뉴입니다."); break;
			case 2: System.out.println("수정메뉴입니다."); break;
			case 3: System.out.println("조회메뉴입니다."); break;
			case 4: System.out.println("삭제메뉴입니다."); break;
			case 7: System.out.println("프로그램이 종료됩니다."); break;
			default: System.out.println("잘못된 번호입니다");
			} 
		}while(menuNum != 7);
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if((num>0)&&(num%2==0)) {
			System.out.println("짝수다");
		} else if(num%2!=0) {
			System.out.println("홀수다");		
		}	else if(num<0){
			System.out.println("양수만 입력해주세요.");
		}
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + math + eng;
		double average = (double)(total / 3);
		
		if(kor>=40&&math>=40&&eng>=40&&average>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			System.out.println("축하합니다, 합격입니다!");
		}	else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season ="";
			
		switch(month) {
		case 1: 
		case 2: 
		case 12:
			season = "겨울";
			break;
		case 3: 
		case 4: 
		case 5: 
			season = "봄";
			break;
		case 6: 
		case 7: 
		case 8: 
			season = "여름";
			break;
		case 9: 
		case 10: 
		case 11: 
			season = "가을";
			break;
		default:
			System.out.printf("%d월은 잘못 입력된 달입니다.",month);
		}
		if(month <12) {
			System.out.printf("%d월은 %s입니다.",month,season);
		} 
	}
	public void practice5() { // 해결 : 문자열의 내용이 같은지를 알아보려면, equals 메소드를 호출해서 비교한다.
							  // equals에서 아닌 경우는 !xx.equals(xx);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		String corId = "myId";
		String corPw = "myPassword12";
		
		if((id.equals(corId))&&(pw.equals(corPw))) {
			System.out.println("로그인 성공");
		} else if(!pw.equals(corPw)){
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(!id.equals(corId)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("알 수 없는 권한입니다.");
		}
		
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg/(m*m);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if(bmi>=18.5&&bmi<23) {
			System.out.println("정상체중");
		} else if(bmi>=23&&bmi<25) {
			System.out.println("과체중");
		} else if(bmi>=25&&bmi<30) {
			System.out.println("비만");
		} else if(bmi>=30) {
			System.out.println("고도 비만");
		}
		
	}
	public void practice8() {		// 문제점 : 소수점 두째짜리까지 반영되지 않는다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String sign = sc.next();
		
		
		
		double sign1 = (double)num1+num2;
		double sign2 = (double)num1-num2;
		double sign3 = (double)num1*num2;
		double sign4 = (double)num1/num2;
		double sign5 = (double)num1%num2;
		
		if(num1<0||num2<0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} else {
			switch (sign) {
			case "+":
				System.out.printf("%d+%d=%f", num1,num2,sign1);
				break;
			case "-":
				System.out.printf("%d-%d=%f", num1,num2,sign2);
				break;
			case "*":
				System.out.printf("%d*%d=%f", num1,num2,sign3);
				break;
			case "/":
				System.out.printf("%d/%d=%f", num1,num2,sign4);
//				System.out.println(num1+"/"+num2+"="+(double)(num1/num2));
				break;
			case "%":
				System.out.printf("%d%%d=%f", num1,num2,sign5);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}	
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		System.out.print("출석 회수 : ");
		int att = sc.nextInt();
			
		System.out.println("================= 결과 =================");
		
		double mid1 = (double)mid*2/10;
		double fin1 = (double)fin*3/10;
		double work1 = (double)work*3/10;
		double att1 = (double)att;
		double total = mid1 + fin1 + work1+att;						
			
		if(total>=70) {
			System.out.println("중간 고사 점수(20) : " + mid1);
			System.out.println("기말 고사 점수(30) : " + fin1);
			System.out.println("과제 점수(30) : " + work1);
			System.out.println("출석 점수(20) : " + att1);			
			System.out.println("총점 : " + total);
			System.out.println("Pass");
		}	else if(total<70&&att>=15) {
			System.out.println("중간 고사 점수(20) : " + mid1);
			System.out.println("기말 고사 점수(30) : " + fin1);
			System.out.println("과제 점수(30) : " + work1);
			System.out.println("출석 점수(20) : " + att1);			
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		}	else if(att1<15) {				
		    System.out.printf("Fail [출석 회수 부족(%d/20)]",att);
		}
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			practice1();break;
		case 2:
			practice2();break;
		case 3:
			practice3();break;
		case 4:
			practice4();break;
		case 5:
			practice5();break;
		case 6:
			practice6();break;
		case 7:
			practice7();break;
		case 8:
			practice8();break;
		case 9:
			practice9();break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
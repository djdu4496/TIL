package com.kh.variable;
import java.util.*;  // Scanner import 작성(슬라이드 참조)
public class F_KeyboardInput {

	public void	inputScanner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: "); // 안내 문구 역할
		String name = sc.nextLine();  // 사용자가 이름을 쓸 데까지 기다린다.
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();  // 나이를 sc에서 20을 받아올 것이다. 사용자가 이름을 쓸 데까지 기다린다.
		
		System.out.print("키(소수점 첫째 자리까지 입력) : ");  // 안내문구 : 소수점 첫째 자리까지 입력. 키 : 실수를 받아올 것이다.
		double height = sc.nextDouble(); // 키를 받아온다. 사용자가 이름을 쓸 데까지 기다린다.
		
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm 입니다.");
		
	}
	
	public void inputScanner2() {
		// 사용자에게 이름과 나이를 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
//		int age = sc.nextInt();	
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();   //nextLine 똑같이 적어준다. 그랬더니 이름과 주소가 같이 안 기다리고 바로 나와버리는 에러가 발생했다.
		
		// 해결하는 방법
		// 방법1. 줄바꿈을 가져갈 수 있는 nextLine() 추가
//		int age = sc.nextInt();
//		sc.nextLine();  // 값을 갖고 오는 역할을 하는게 아니라 버퍼에 남아있는 줄바꿈만 빼주는 역할을 하는 것이다. 따라서, 버퍼에 줄바꿈은 남지 않는다.
//		System.out.print("주소를 입력하세요: ");
//		String address = sc.nextLine();
		
		// 방법2. age를 받을 때도 nextLine()을 쓰되 int로 파싱하기(parsing)
//		int age = sc.nextLine(); 
		// 파싱 : 문자열을 기본 자료형으로 바꿔주는 일 	
		// "1" (o), "박신우" (x) 숫자로 구성되는 문자열만 기본 자료형으로 바꿀 수 있다.
		// "true"(o), "박신우"(x) true로 구성되는 문자열만 기본 자료형으로 바꿀 수 있다.
//		String userAge = sc.NextLine();
//		int age = Integer.parseInt(userAge); // Int로 바꾸고 싶으면, integer.parseInt다! (알아두기)
     	int age = Integer.parseInt(sc.nextLine());  // 이건 윗 두 줄을 하나로 합친 것이다. 변수로 한 번 치환하느냐, 바로 집어넣느냐 차이다.(중요)
		System.out.print("주소를 입력하세요: ");
		String address = sc.nextLine();
		
		// 방법3. next()로 주소를 받기 (한계가 있는 방법) 
		// 한계 : 
//		int age = sc.nextInt();
		System.out.print("주소를 입력하세요: ");
//		String address 	= sc.next();
//		next(); 메소드는 띄어쓰기를 '구분자'로 인식한다. 따라서 경기도 한 번 의왕시 한 번 오전동 한 번 이렇게 세 번으로 인식한다.
//		따라서 주소에 띄어쓰기가 있을 경우 처음에 쓴값만 읽어온다.
		
		// + 추가 : char형을 받고 싶을 때는?
		System.out.print("성별을 입력하세요 : "); // F / M
//		String userGender = sc.nextLine(); // 일단 문자열로 받아온다.
//		char gender = userGender.charAt(0); // char gender라는 곳에 저장하고 싶다.
		char gender = sc.nextLine().charAt(0); // 위 두 줄을 한 줄로 만들어 준 것이다.
//		.charAt(0);이 중요하다. charAt이란 문자열에서 index번째의 문자를 가져와주는 '메소드'.
		
		System.out.println(name + "님은 " + age + "세이며, 사는 곳은 " + address + "입니다.");
		System.out.println("gender : " + gender);
	}
}


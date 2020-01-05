package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100; // boolean은 형변환에서 제외된다. boolean only true or false.
		int num = 'A';  // 문자형 char가 숫자형 int값이 들어갈 수 있다. 근거: 컴퓨터는 문자형을 유니코드 방식으로 읽는다.
		System.out.println("num: " + num);
		
		char ch = 97;  // 우항에 리터럴, 97을 넣고 있기 때문에 에러가 나지 않았다. 숫자형 int에 문자형 'char' 값이 들어갈 수 있다
		System.out.println("ch : " + ch);
		
		char ch2 = (char) num;  // 에러: Type mismatch: cannot convert from int to char
						 		// 'num'은 값이 아닌, '변수'다. 
								// 변수가 값에 들어가면 변수에 대한 크기만 볼 수 있다. 
								// 'num'은 4byte. 
								// 'char'는 2byte다. 크기 비교만 되기 때문에 error가 뜨는 것이다.
								// 이럴 때, 'num'은 char로 강제 형변환이 들어가야 한다.
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);  // 물음표가 값이 뜨는 게 아니라 음수는 char에 없는 숫자이기 때문에 ?가 출력된 것이다.
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;  // 에러: 작은 것이 큰걸 따라가기 때문에 long이 되는 값을 int에 집어넣으려고 하기 때문에 error가 난다.
								   // 연산은 큰 자료형으로 자동 형변환이 된 후 연산처리가 되기 때문에
									// iNum + lNum의 결과는 long형이 된 상태.
		// iNum + lNum을 int result에 저장할 수 있는 방법
		// 방법 1. 수행 결과를 int로 강제 형변환
//		int result = (int) (iNum + lNum);  // (int)로 묶고, (iNum + lNum)도 이렇게 묶어준다.
		// 방법 2. long형을 int로 강제 형변환
//		int result = iNum + (int)lNum;
		// 방법 3. 결과 값을 저장하는 result를 long형을 받음
//		long result = iNum + lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum; // 에러: int라는 큰 자료형이 byte라는 작은 자료형이 들어가려고 하기 때문
								// 지로 집어넣기 위해 byte로 형변환을 해주고 그러기 위해 몸을 잘라낸다.
								// 잘라내는 부분에 데이터가 들어가있으면 그 부분은 버리고 일부가 손실된 데이터가 바이트 안에 들어간다. 
		                        // 그 결과가 34로 나온 것이고 이게 데이터 손실이다.

		System.out.println("bNum : " + bNum);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

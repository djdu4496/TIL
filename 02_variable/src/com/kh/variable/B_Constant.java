package com.kh.variable;

public class B_Constant {

	public void finalConstant() {
		int age; // 일반 변수 선언
		final int AGE; // 상수 선언
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		
		// 변수의 값 변경
		
		age = 30;
//      AGE = 30;
		//The final local variable AGE may already have been assigned
		// final 변수 즉, 상수는한 번만 저장할 수 있는데, 지금 30으로 또 변경하려 하니까 변경이 불가능하다며 빨간줄이 떴다, 즉 에러가 났다.
		// 고칠 수 있는 방법은 없다.
		
		System.out.println("값 변경 후 age : " + age );
		System.out.println("값 변경 후 AGE : " + AGE);
		
				
		
		
		
		
		
		
		
	}
}

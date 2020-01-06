package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// 객체 생성 : B_KindsOfVariable2	
		B_KindsOfVariable2 bkov = new B_KindsOfVariable2();  // 'B_KindsOfVariable2' : 생성자  + 'new' : new 연산자
		int a = bkov.staticNum;
		// The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		
		int a1 = B_KindsOfVariable2.staticNum;
		// static영역에 올라가 있기 때문에 객체 생성 없이 가능
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		
		/*Static
		System.out.println();
		Arrays.copyof(null,0);
		Integer.pareInt(null);
		Math.random();
		main(String[] args]
		>> 모두 static 메모리 저장 영역에 들어가있따.
		*/
		
		Product p = new Product();
		p.inform();
		// JVM 기본값  초기화 : null, null, 0, 0(값 초기화가 안 되면 jvm의 기본값으로 실행된다)
		// 명시적 초기화 : 초코파이, 오리온, 1500, 100
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 80
		
		Product p3 = new Product();
		p3.inform();
		// 인스턴스 초기화 블럭 : 칸초, 롯데, 1000, 70
		// 칸초, 롯데, 1000, 139
		// 칸초, 롯데, 1000, 129
		// 칸초, 롯데, 1000, 119
	}

}

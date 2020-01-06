package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "초코파이";
	private String brand = "오리온";
	private int price = 1500;
	private static int num = 100; 
	// 여기까지 명시적 초기화(초기값)
	
	{
		name = "칸초";
		price =1000;
		brand = "롯데";
		num -= 10;
		// 객체가 만들어 졌을 때 메모리 영역에 올라가는 애들
	}
	
	static {
//		name = "홈런볼";
//		price =2000;
//		brand = "해태";
		// Cannot make a static reference to the non-static field brand : 프로그램 시작시 메모리 영역에 올라가는 애들, 생성시점이 다르기 때문에 올라갈 수 없다.
		num = 150;
		num --;
		
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}

}

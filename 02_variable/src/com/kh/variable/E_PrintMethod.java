package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "안녕하세요";
	String str2 = "반갑습니다";
	
	public void printExample() {
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";

		System.out.print(str1);
		System.out.print(str2);
				
	}
	public void printlnExample() {
//		String str1 = "안녕하세요";
//		String str2 = "반갑습니다";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("박신우");
	}
	
	public void printfExample() {
		// 안녕하세요, 정지우입니다. 반갑습니다.
		// -------             --------
		//   str1                str2
		System.out.printf("%s, 정지우입니다. %s.", str1, str2);  // "" 내가 출력하고자 하는 형식 
															  // argument: 각각 포메터에 들어가야하는 변수나 값
		
		// 반갑습니다, 친하게 지내요.
		System.out.printf("%s, 친하게 지내요.", str2);   
		
		System.out.println();
		
		// 미니 문제
		// 안녕하세요, 저는 20살 박신우 강사 입니다. 만나서 반갑습니다.
		int age =20;
		String name = "박신우";
		String job = "강사";
		
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s", str1, age, name, job, str2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

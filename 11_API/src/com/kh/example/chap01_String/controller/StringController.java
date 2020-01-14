package com.kh.example.chap01_String.controller;

import java.util.StringTokenizer;

public class StringController {
	public void method1() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
//		str1 == str2;
		str1.equals(str2);
		
		System.out.println("str1과 str2의 주소는 같은가? : " + (str1 == str2));
		System.out.println("str1과 str3의 주소는 같은가? : " + (str1 == str3));
		
		System.out.println("str1의 hashCode : " +str1.hashCode());
		System.out.println("str2의 hashCode : " +str2.hashCode());
		System.out.println("str3의 hashCode : " +str3.hashCode());
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		
		str2 +="oracle";
		System.out.println("str1과 str2의 주소값은 같은가? : " + (str1 == str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str3));
	}
	
	public void method2() {
		// StringBuffer Test
		// 계속해서 값을 변경해야 할 때 String의 경우 값이 새로 생기고 참조 위치만 바꿔주기 때문에
		// 변경이 적고 읽기만 하는 경우에는 불변 클래스인 String클래스가 용이하겠지만
		// 변경해야 하는 값이 많은 경우 StringBuffer나 StringBuilder로 하는 게 더 효율적임
		
		StringBuffer buffer1 = new StringBuffer();
		System.out.println("초기 buffer1의 수용량 : " + buffer1.capacity());
		System.out.println("buffer1에 들어 있는 실제 값의 길이 : " + buffer1.length());
		
		System.out.println();
		
		StringBuffer buffer2 = new StringBuffer(100);
		System.out.println("초기 buffer2의 수용량 : " + buffer2.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer2.length());
		
		System.out.println();
		
		StringBuffer buffer3 = new StringBuffer("abc");
		System.out.println("초기 buffer3의 수용량 : " + buffer3.capacity());
		System.out.println("buffer2에 들어있는 실제 값의 길이 : " + buffer3.length());
		
		System.out.println();
		
		StringBuilder builder = new StringBuilder("abe");
		System.out.println("초기 builder의 수용량 : " + builder.capacity());
		System.out.println("builder에 들어있는 실제 값의 길이 : " + builder.length());
		
		System.out.println();
		
		builder.append("abc");
		System.out.println("abc 추가 후의 builder : " + builder);
		System.out.println("abc 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc 푸가 후의 builder 길이 : " + builder.length());
		
		
		builder.append("def");
		System.out.println("def 추가 후의 builder : " + builder);
		System.out.println("def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("def 추가 후의 builder 길이 : " + builder.length());
		
		
//		builder.append("abc").append("def");? // 메소드 체이닝(method chaining)
//		builder.append("ghi").toString().equals("abcdefghi");
//		---------------------
//			StringBuilder
//		--------------------------------
//					String
		System.out.println("abc, def 추가 후의 builder : " + builder);
		System.out.println("abc, def 추가 후의 builder 용량 : " + builder.capacity());
		System.out.println("abc, def 추가 후의 builder 길이 : " + builder.length());
		
		builder.insert(2, "zzz");
		System.out.println("인덱스2에 zzz 추가 후의 builder : " + builder);
		
		System.out.println();
		
		builder.delete(2, 5); // start <= 인덱스  < end
		System.out.println("인덱스 2부터 인덱스 5까지 삭제 후의 builder : " + builder);
		
		System.out.println();
		
		builder.reverse();
		System.out.println("reverse 후의 builder : " + builder);
		
		System.out.println();
		
		StringBuilder sb = new StringBuilder("abc");
		sb = sb.append("zzz").insert(2,"yy").reverse().delete(1, 3);
//		         abczzz             abyyczzz    zzzcyyab        zcyyab
		System.out.println(sb);
		
	}
	
	public void method3() {
		String str = "Hello World";
		
		// 1. charAt(int index):char
		//		String의 index번째 char반환
		char ch = str.charAt(4);
		System.out.println(ch);
		// 2. concat(String str):String
		// 		매개변수로 들어온 값에 원래 String의 끝에 이어붙인 값(String)을 반환
		String concatStr = str.concat("!!!");
		System.out.println("concatStr : " + concatStr);
		str +="!!!";
		System.out.println(str);
				
		// 3. equals():boolean
		System.out.println("concatStr.equals(str) : " + concatStr.equals(str));
		
		// 4. substring(int beginIndex):String
		// 	  substring(int beginIndex, int endIndex):String
		// 		String의 일부를 반환 - 매개변수가 하나면, 그 인덱스부터 끝까지 반환
		//					    - 매개변수가 두 개면, 시작 인덱스 <= 문자 < 끝 인덱스
		System.out.println("str.substring(6) : " + str.substring(6));
		System.out.println("str.substring(0, 5) : " + str.substring(0, 5));
		
		// 5. replace(char oldChar, char newChar):String
		//		지정 char를 새로운 char로 대체하여 반환
		System.out.println("str.replace('l', 'e') : " + str.replace('l','e'));
		
		// 6. toUpperCase()/toLowerCase():String
		//		모두 대문자 혹은 소문자로 바꿔 반환
		System.out.println("str.toUpperCase() : " + str.toUpperCase());
		System.out.println("str.toLowerCase() : " + str.toLowerCase());
		
		// 7. equalsIgnoreCase():boolean
		//	대소문자 구분 안 하고 문자가 같은지만 확인
		String str2 = "Wonderful";
		String str3 = "wonderful";
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		System.out.println("str.equalsIgnoreCase(str3) : " + str2.equalsIgnoreCase(str3));
		
		// 8. trim():String
		// 		앞/뒤에 있는 공백(빈 공간)을 제거한 문자열 반환
		String str4 = "     Java";
		String str5 = "Java     ";
		String str6 = "     Java      ";
		System.out.println(str4 + "| str4.trim() : " + str4.trim());
		System.out.println(str5 + "| str5.trim() : " + str5.trim());
		System.out.println(str6 + "| str6.trim() : " + str6.trim());
		
		// 9. split(String str):String[]
		//		문자열을 분리하여 배열에 담아 반환
		String splitStr = "Java, Oracle, JDBC, Front, Server, Framework";
		String[] splitArr = splitStr.split(", ");
		System.out.println("분리된 문자열 개수(split) : " + (splitArr.length));
//		for(int i=0;i<splitArr.length;i++) {
//			System.out.println(splitArr[i]);
//		} 일반 for문
		
		// 향상된 for문(for-each문)
		for(String s : splitArr) {
			System.out.println(s);
		}
		
	}
		public void method4() {
			String str = "Java, Oracle, JDBC, Front, Server, Framework";
			StringTokenizer stObj = new StringTokenizer(str, ", ");
			
			System.out.println("분리된 문자열 개수 : " + stObj.countTokens());
			
			while(stObj.hasMoreTokens()) {
				System.out.println(stObj.nextToken());
			}
			
			System.out.println("값을 꺼낸 후의 문자열 개수 : " + stObj.countTokens());
			
			System.out.println();
			
			String str2 = "Apple, Banana-Cream*Dessert#Egg Fruits";
			StringTokenizer stObj2 = new StringTokenizer(str2, ", -*#");
		    System.out.println("분리된 문자열 개수 : " + stObj2.countTokens());
			
			while(stObj2.hasMoreTokens()) {
				System.out.println(stObj2.nextToken());
			}
			
			// split()과 StringTokenizer의 차이점
			// 1. 분리한 문자열을 String[]로 처리하고 싶을 때 split()
			// 	     분리한 문자열을 객체로 처리하고 싶을 때 StringTokenizer클래스
			// 2. split()메소드의 구분자는 1개
			// 	  StringTokenizer클래스의 구분자는 여러 개 가능
				

	}
}

package com.kh.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// 얕은 복사 : 배열의 주소만 복사
	// 깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값 복사
	//		1) for문을 이용한 1:1 복사
	// 		2) System.arraycopy() 메소드 이용한 복사
	//		3) Arrays.copyOf() 메소드 이용한 복사
	// 		4) clone() 메소드 이용한 복사  -- 하지 않을 것이다--
	
	public void method1() {
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr; // 얕은 복사
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		// 원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr의 주소 값 : " + originArr);
		System.out.println("copyArr의 주소 값 : " + copyArr);
		
	}
	public void method2() {
		// 깊은 복사1. for문 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[5];
		
		for(int i = 0; i <originArr.length; i++) {
			copyArr[i] = originArr[i];   // copyArr[i] 을 originArr[i]로 집어넣겠다(깊은 복사)
		}
		System.out.println("=====복사 직후=====");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");	
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("===== originArr의 0번째 인덱스를 99로 변경 =====");
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("originArr의 주소 값 : " + originArr);
		System.out.println("copyArr의 주소 값 : " + copyArr);
	}
	public void method3() {
		// 깊은 복사 2: arraycopy() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
//						원본배열 시작위치		복사배열 시작위치
//		System.arraycopy(src,srcPos,dest,destPos,length);
//				 		원본배열		복사 배열			복사길이
		// originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데 
		// copyArr의 3번째에서부터 붙여넣고 싶음
		
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
				
	}
	public void method4() {
		// 깊은 복사 3: Arrays.copyOf() 이용
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[10];
		
		System.out.println("=====처음 값=====");
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("=====copyOf()로 복사 후=====");
		// Array.copyOf(original, newLength)
		//				원본 배열		복사할 길이
		copyArr = Arrays.copyOf(originArr, originArr.length);
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println();
	}
	
}

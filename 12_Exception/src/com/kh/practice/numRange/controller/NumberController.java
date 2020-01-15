package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	
	public NumberController() {}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		boolean flag=false;
//		if(((num1>=1)&&(num1<=100)&&(num2>=1)&&(num2<=100))&&(num1%num2==0)) {
//			flag=true;
//		} else if(((num1>=1)&&(num1<=100)&&(num2>=1)&&(num2<=100))&&(num1%num2!=0)) {
//			flag=false;
//		} else if(!((num1>=1)&&(num1<=100))||!((num2>=1)&&(num2<=100))) {
//			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
//		} 
		// 조건식을 너무 복잡하게 쓴 경우
		
		// 중첩 if문을 사용해서 조건식을 간단하게 쓴 경우
		if((num1>=1&&num1<=100)&&(num2>=1&&num2<=100)) {
			if(num1%num2==0) {
				flag=true;
			} else {
				flag=false;
			}
		} else {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
			
		return flag;
	}
	
	
	
}

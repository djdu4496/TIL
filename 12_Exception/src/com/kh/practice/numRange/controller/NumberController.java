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
//			throw new NumRangeException("1���� 100������ ���� �ƴմϴ�.");
//		} 
		// ���ǽ��� �ʹ� �����ϰ� �� ���
		
		// ��ø if���� ����ؼ� ���ǽ��� �����ϰ� �� ���
		if((num1>=1&&num1<=100)&&(num2>=1&&num2<=100)) {
			if(num1%num2==0) {
				flag=true;
			} else {
				flag=false;
			}
		} else {
			throw new NumRangeException("1���� 100������ ���� �ƴմϴ�.");
		}
			
		return flag;
	}
	
	
	
}

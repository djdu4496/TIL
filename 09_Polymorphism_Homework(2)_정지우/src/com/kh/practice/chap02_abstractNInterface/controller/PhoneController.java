package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	
	public String[] method() {
		
		// 2개의 Phone객체를 저장할 수 있는 객체배열 생성
		Phone[] Arr = new Phone[2];
		
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		Arr[0] = new GalaxyNote9();
		Arr[1] = new V40();
		
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String배열에 담아 반환
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)Arr[i]).printInformation();
			} else {
				result[i] = ((V40)Arr[i]).printInformation();
			}
		}
		
		return result;
	}
}

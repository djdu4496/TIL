package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	
	public String[] method() {
		
		// 2���� Phone��ü�� ������ �� �ִ� ��ü�迭 ����
		Phone[] Arr = new Phone[2];
		
		// ������ �ε����� �������� �����Ͽ� GalaxyNote9, V40 ��ü ����
		Arr[0] = new GalaxyNote9();
		Arr[1] = new V40();
		
		// for���� �̿��Ͽ� Phone ��ü�迭�� �� �ε����� printInformation()��
		// ��ȯ ���� String�迭�� ��� ��ȯ
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

package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}

	public int countAlpha(String s) throws CharCheckException{
		int count=0;

		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				count++;
			} else if(s.charAt(i)==' ') {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�.");
			}
		}

		return count;
		
	}
}

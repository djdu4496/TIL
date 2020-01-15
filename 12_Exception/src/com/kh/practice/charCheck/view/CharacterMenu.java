package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);

	public void menu() {

		CharacterController cc = new CharacterController();
		while(true) {
			System.out.print("���ڿ� : ");
			String str = sc.nextLine();

			try {

				cc.countAlpha(str);

				System.out.println("'"+str+"'�� ���Ե� ������ ���� : "+cc.countAlpha(str));
				//  \ + t = Tab
				//  \ + n = �ٹٲ�
				System.out.println("\n�Ǵ�\n");
			} catch(CharCheckException cce) {

				cce.printStackTrace();
				break;
			}
					
		}


	}
}

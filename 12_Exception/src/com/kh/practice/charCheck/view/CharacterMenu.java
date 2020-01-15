package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	Scanner sc = new Scanner(System.in);

	public void menu() {

		CharacterController cc = new CharacterController();
		while(true) {
			System.out.print("문자열 : ");
			String str = sc.nextLine();

			try {

				cc.countAlpha(str);

				System.out.println("'"+str+"'에 포함된 영문자 개수 : "+cc.countAlpha(str));
				//  \ + t = Tab
				//  \ + n = 줄바꿈
				System.out.println("\n또는\n");
			} catch(CharCheckException cce) {

				cce.printStackTrace();
				break;
			}
					
		}


	}
}

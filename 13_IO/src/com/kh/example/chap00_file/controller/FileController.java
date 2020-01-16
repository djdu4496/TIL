package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile();
			f3.mkdirs(); // ������ ������ش�.
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); // true
			System.out.println(f3.exists()); // true
			System.out.println(f4.exists()); // false
			
			// �� �� �޼ҵ��
			System.out.println("���� �� : " + f1.getName());
			System.out.println("���� ���� ��� : " + f1.getAbsolutePath());
			System.out.println("���� ��� ��� : " + f1.getPath());
			System.out.println("f1 ���� �뷮 : " + f1.length());
			System.out.println("f2 ���� �뷮 : " + f2.length());
			System.out.println("f1 ���� ���� : " + f1.getParent());
			System.out.println("f4 ���� ���� : " + f4.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

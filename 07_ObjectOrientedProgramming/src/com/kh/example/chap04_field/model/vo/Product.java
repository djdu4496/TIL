package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������";
	private String brand = "������";
	private int price = 1500;
	private static int num = 100; 
	// ������� ����� �ʱ�ȭ(�ʱⰪ)
	
	{
		name = "ĭ��";
		price =1000;
		brand = "�Ե�";
		num -= 10;
		// ��ü�� ����� ���� �� �޸� ������ �ö󰡴� �ֵ�
	}
	
	static {
//		name = "Ȩ����";
//		price =2000;
//		brand = "����";
		// Cannot make a static reference to the non-static field brand : ���α׷� ���۽� �޸� ������ �ö󰡴� �ֵ�, ���������� �ٸ��� ������ �ö� �� ����.
		num = 150;
		num --;
		
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}

}

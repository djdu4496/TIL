package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		// �ſ���ȣ�� 100, �̸��� ȫ�浿, �Ҽ��� ������, ������ ����, ���̴� 25��, ������ ���ڱ���
		e1.setEmpNo(100);
		
		e1.setEmpName("ȫ�浿");
		
		e1.setDept("������");
		
		e1.setJob("����");
			
		e1.setAge(25);
		
		e1.setGender('��');
		
		e1.setSalary(2500000);
		
		e1.setBonusPoint(0.05);
		
		e1.setPhone("010-1234-5678");
		
		e1.setAddress("����� ������");
		System.out.println(e1.getEmpNo()+", " + e1.getEmpName() + ", " + e1.getDept() + ", " + e1.getJob() + ", " + e1.getAge() + ", " + e1.getGender() + ", " + e1.getSalary() + e1.getBonusPoint() + ", " + e1.getPhone() + ", " + e1.getAge());

	}

}
//100, "ȫ�浿", "������", "����", 25, '��', 2500000, 0.05, "010-1234-5678", "����� ������"
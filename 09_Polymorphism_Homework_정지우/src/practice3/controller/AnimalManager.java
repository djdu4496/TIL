package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		// ������ 5¥�� Animal Ÿ���� ��ü �迭 ����
		Animal[] aArr = new Animal[5];
		
		// �� �ε������� �������� Dog, Cat Ŭ������ �̿��Ͽ� ��ü ����
		// �̶�,�Ű����� �����ڸ� �̿��Ͽ� ����
		
		aArr[0] = new Dog("�ٵ���","��Ƽ��",8);
		aArr[1] = new Dog("����","Ǫ��",2);
		aArr[2] = new Cat("�ֿ���","����","����� �����","Ȳ���");
		aArr[3] = new Cat("������","������","����� �����","��ȸ��");
		aArr[4] = new Dog("����","��ũ��",3);				
				
		// �ݺ������� �� �ε����� ��ü�� speak() �޼ҵ� ����
		for(int i=0;i<aArr.length;i++) {   // ���� ���ε�
				aArr[i].speak();
//			if(aArr[i] instanceof Dog) {   // i��° �ε��� �迭�� �����ϴ� Ŭ����
//				((Dog)aArr[i]).speak();
//			} else if(aArr[i] instanceof Cat) {
//				((Cat)aArr[i]).speak();
//			}
		}
		
	}
}

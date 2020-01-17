package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		// 사이즈 5짜리 Animal 타입의 객체 배열 생성
		Animal[] aArr = new Animal[5];
		
		// 각 인덱스별로 무작위로 Dog, Cat 클래스를 이용하여 객체 생성
		// 이때,매개변수 생성자를 이용하여 생성
		
		aArr[0] = new Dog("바둑이","말티즈",8);
		aArr[1] = new Dog("지니","푸들",2);
		aArr[2] = new Cat("애용이","누왁","좀비딸 세계관","황토색");
		aArr[3] = new Cat("떼껄룩","흑고양이","좀비딸 세계관","검회색");
		aArr[4] = new Dog("베일","요크셔",3);				
				
		// 반복문으로 각 인덱스별 객체의 speak() 메소드 실행
		for(int i=0;i<aArr.length;i++) {   // 동적 바인딩
				aArr[i].speak();
//			if(aArr[i] instanceof Dog) {   // i번째 인덱스 배열이 참조하는 클래스
//				((Dog)aArr[i]).speak();
//			} else if(aArr[i] instanceof Cat) {
//				((Cat)aArr[i]).speak();
//			}
		}
		
	}
}

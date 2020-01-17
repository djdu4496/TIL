package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	// - name:String
	// - score:int
	
	// + Student()
	// + Student(name:String, score:int)
	
	// + getter/setter
	// + toString():String
	
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(String name, int score) {
		super();
		this.name=name;
		this.score=score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score=score;
	}
	
	@Override
	public String toString() {
		return  name + " (" + score + ") ";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { // 나랑 obj의 '주소값'이 갖다면 
			return true; // 같다(true 반환)
		} 
		if(obj == null) { // 나랑 obj의 '주소값'이 다르면(obj가 null이라면)
			return false; // false 반환
		}
		if(getClass() != obj.getClass()) {		// 내 클래스에 대한 정보를 담고 있는 메소드 != obj에 대한 정보를 담고 있는 메소드
			return false;						// false 반환
		}
		// 여기까지가 '객체 자체(주소값)에 대한 비교'다.
		
		// 여기부터 '객체 필드값'으로 비교한다.
		Student other = (Student)obj;  // 다운캐스팅 : 부모클래스 obj가 student클래스안에 볼 수 있는 곳을 단순히 obj 부모 클래스에서 student클래스 전체로 확장하기 위해 obj를 Student클래스로 '형변환' 해준다.
		if(name == null) {			// string은 기본형 자료형과 달리 클래스라서 null값을 먼저 비교해주어야 한다.
			if(other.name != null) {	// 나도 null이고 다른 사람이 null이 아니면 같지 않다.
				return false;
			}
		} else if(!name.equals(other.name)) {  // 내가 null이 아니면서 너의 name과 나의 name이 같지 않으면 false. 
			return false;
		}
		
		if(score != other.score) {	// 이렇게 name이 끝나서, score가 남았다. int값인 score는 참조형변수가 아니기 때문에  같은지 아닌지만 비교하면 된다. 
			return false;	// 비교하여 같지 않으면 false.
		}
		
		return true;
	}

//	@Override
//	public int compareTo(Object o) {
//		return 0;
//	}

	@Override
	public int compareTo(Student o) {
		// 이름에 대해서 오름차순 정렬
		// 이름 ==> String
		// ==> String에 대해 오름차순 정렬
		
		String otherName = o.getName();
		
		/*
		 
		 	compareTo의 반환 값 : int
		 	비교 주체가 비교 대상과 같으면 0
		 	비교 주체가 비교 대상보다 크면 1
		 	비교 주체가 비교 대상보다 작으면 -1 반환
		 
		 */
		
		
		return name.compareTo(otherName);
	}
}

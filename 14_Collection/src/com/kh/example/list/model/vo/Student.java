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
		if(this == obj) { // ���� obj�� '�ּҰ�'�� ���ٸ� 
			return true; // ����(true ��ȯ)
		} 
		if(obj == null) { // ���� obj�� '�ּҰ�'�� �ٸ���(obj�� null�̶��)
			return false; // false ��ȯ
		}
		if(getClass() != obj.getClass()) {		// �� Ŭ������ ���� ������ ��� �ִ� �޼ҵ� != obj�� ���� ������ ��� �ִ� �޼ҵ�
			return false;						// false ��ȯ
		}
		// ��������� '��ü ��ü(�ּҰ�)�� ���� ��'��.
		
		// ������� '��ü �ʵ尪'���� ���Ѵ�.
		Student other = (Student)obj;  // �ٿ�ĳ���� : �θ�Ŭ���� obj�� studentŬ�����ȿ� �� �� �ִ� ���� �ܼ��� obj �θ� Ŭ�������� studentŬ���� ��ü�� Ȯ���ϱ� ���� obj�� StudentŬ������ '����ȯ' ���ش�.
		if(name == null) {			// string�� �⺻�� �ڷ����� �޸� Ŭ������ null���� ���� �����־�� �Ѵ�.
			if(other.name != null) {	// ���� null�̰� �ٸ� ����� null�� �ƴϸ� ���� �ʴ�.
				return false;
			}
		} else if(!name.equals(other.name)) {  // ���� null�� �ƴϸ鼭 ���� name�� ���� name�� ���� ������ false. 
			return false;
		}
		
		if(score != other.score) {	// �̷��� name�� ������, score�� ���Ҵ�. int���� score�� ������������ �ƴϱ� ������  ������ �ƴ����� ���ϸ� �ȴ�. 
			return false;	// ���Ͽ� ���� ������ false.
		}
		
		return true;
	}

//	@Override
//	public int compareTo(Object o) {
//		return 0;
//	}

	@Override
	public int compareTo(Student o) {
		// �̸��� ���ؼ� �������� ����
		// �̸� ==> String
		// ==> String�� ���� �������� ����
		
		String otherName = o.getName();
		
		/*
		 
		 	compareTo�� ��ȯ �� : int
		 	�� ��ü�� �� ���� ������ 0
		 	�� ��ü�� �� ��󺸴� ũ�� 1
		 	�� ��ü�� �� ��󺸴� ������ -1 ��ȯ
		 
		 */
		
		
		return name.compareTo(otherName);
	}
}

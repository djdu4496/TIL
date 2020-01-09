package com.kh.example.animal.model.vo;

public class Snake extends Animal {
	// - name : String
	// - age : int
	// - weight : double
	// - pattern : String
	
	// + Snake()
	// + Snake(name:String, age:int, weight:double, pattern:String)
	
	// + getter/setter
	// + inform():String
	// 		반환 형식 : 이름 나이 몸무게 무늬
	private String pattern;
	
	public Snake() {}
	
	public Snake(String name, int age, double weight, String pattern) {
		super(name,age,weight);
		this.pattern=pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern=pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
//	public String inform() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + pattern;
//		return super.inform()+ " " + pattern;
		
//	}
	@Override
	public String toString() {
		return super.toString() + " " + pattern;
	}
}

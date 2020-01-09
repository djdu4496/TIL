package com.kh.example.person.model.vo;

public class Person {
	// - name : String
	// - age : int
	// - gender : char
	// - height : double
	// - weight : double
	
	// + Person()
	// + Person(name:string, age:int)
	// + Person(name:String, age:int, gender:char, height:double,weight:double)
	
	// + getter/setter
	// + personInfo() : String
	// 		반환 값 형식 : 이름, 나이, 성별, 키, 몸무게
	
	private String name;
	private int age;
	private char gender;
	private double height;
	private double weight;
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, char gender, double height, double weight) {
		this(name,age);
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(int age) {
		this.age = age;
	}
	
	public int getInt() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String personInfo() {
		return name + ", " + age + ", " + gender + ", " + height + ", " + weight;
	}
}

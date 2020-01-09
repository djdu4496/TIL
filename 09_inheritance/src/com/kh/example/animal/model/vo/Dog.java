package com.kh.example.animal.model.vo;

public class Dog extends Animal{
	// - name : String
	// - age : int
	// - weight : double
	// - height : double
	// - hair : String
	
	// + Dog()
	// + Dog(name:String, age:int, weight:double, height:double,hair:String)
	
	// + getter/setter
	// + inform():String
	//		��ȯ ���� : �̸� ���� ������ Ű ��
	private double height;
	private String hair;
	
	public Dog() {
		
		
	}
	
	public Dog(String name, int age, double weight, double height, String hair) {
		super(name,age,weight);
		this.height=height;
		this.hair=hair;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHair(String hair) {
		this.hair=hair;
	}
	
	public String getHair() {
		return hair;
	}
	
//	public String inform() {
//		return super.getName() + " " + super.getAge() + " " + super.getWeight() + " " + height + " " + hair;
//		return super.inform() + " " + height + " " + hair;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + height + " " + hair;
	}
}

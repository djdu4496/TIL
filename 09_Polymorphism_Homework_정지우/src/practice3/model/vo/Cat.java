package practice3.model.vo;

public class Cat extends Animal{
	private String location;
	private String color;
	
	public Cat() {}
	
	public Cat(String name, String kinds, String location, String color) {
		super(name,kinds);
		this.location=location;
		this.color=color;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void speak() {
		//부모클래스 오버라이딩 해서 구현. 부모의 toString() 메소드 호출하여 리턴 받은 결과값 뒤에 location + “에 서식하며, 색상은 “ + color + “입니다.”합쳐서 출력
		System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color + "입니다.");
	}
	
}
